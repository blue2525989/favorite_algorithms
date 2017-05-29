#include <iostream>
using namespace std;

/* finds the area */

int findArea(int length, int width)
{
	int area = length * width;
	return area;
}

int main()
{
	int length, width;
	cout << "Enter the length: " << "";
	cin >> length;
	cout<< "Enter the width: " << "";
	cin >> width;
	int area = findArea(length, width);	
	cout << "The area is: " << area << endl;
}

