package main.web.methods;

public class FixPayPalButtons {
	
	// checks for unclosed image and input tags and closes them
	public static String fixPayPalButtons(String tag) {
		String imgOpen = "<img", inputOpen = "<input";
		String close = ">", newClose = " />";
		String[] tags = tag.split(close);
		tag = "";
		for (int i = 0; i < tags.length; i++) {
			if (tags[i].contains(imgOpen) || tags[i].contains(inputOpen)) {
				String temp = tags[i].substring(0, tags[i].length()) + newClose;
				tag += temp;
			} else if (i == tags.length-1){
				tag += tags[i];
			}  else {
				tag += tags[i] + ">";
			}
		}
		
		return tag;
	}

	
	
	public static void main(String[] args) {
		
		String payPalTest = "<form action=\"https://www.paypal.com/cgi-bin/webscr\" method=\"post\" target=\"_top\">" +
" <input type=\"hidden\" name=\"cmd\" value=\"_s-xclick\">" +
" <input type=\"hidden\" name=\"hosted_button_id\" value=\"\"> " +
" <table> " +
" <tr><td><input type=\"hidden\" name=\"on0\" value=\"Style\">Style</td></tr><tr><td><select name=\"os0\"> " +
"	<option value=\"Single block offset\">Single block offset </option> " +
"	<option value=\"Single block normal\">Single block normal </option> " +
"	<option value=\"Two finger ring\">Two finger ring </option> " +
" </select> </td></tr> " +
" <tr><td><input type=\"hidden\" name=\"on1\" value=\"Color\">Color</td></tr><tr><td><input type=\"text\" name=\"os1\" maxlength=\"200\"></td></tr> " +
" </table> " +
" <input type=\"image\" src=\"https://www.paypalobjects.com/en_US/i/btn/btn_buynowCC_LG.gif\" border=\"0\" name=\"submit\" alt=\"PayPal - The safer, easier way to pay online!\"> "  +
" <img alt=\"\" border=\"0\" src=\"https://www.paypalobjects.com/en_US/i/scr/pixel.gif\" width=\"1\" height=\"1\"> " +
" </form> ";
		

		String temp = fixPayPalButtons(payPalTest);
		System.out.println(temp);
	}
}
