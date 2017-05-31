#include <iostream>
#include <cstring>

// use this with cstring to have access to string functions
using namespace std;
// rot13
int rot13(int c)
{
	return (c = (c >= 'A' && c <= 'Z') ?
		(((c - 'A')+13)%26) + 'A' : (c = (c >= 'a' && c <= 'z') ?
			(((c - 'a')+13)%26) + 'a' : c));
}

// un-rot13
int unRot13(int c)
{
	return (c = (c >= 'A' && c <= 'Z') ?
		(((c - 'Z')-13)%26) + 'Z' : (c = (c >= 'a' && c <= 'z') ?
			(((c - 'z')-13)%26) + 'z' : c));
}
// rot13 char array
void rot13Chars(char arr[], int size)
{
	for (int i = 0; i < size; i++)
	{
		arr[i] = rot13(arr[i]);
	}
}
// un-rot13 char array
void unRot13Chars(char arr[], int size)
{
	for (int i = 0; i < size; i++)
	{
		arr[i] = unRot13(arr[i]);
	}
}
// rotate by any number
int rotAny(int c, int rot)
{
	return (c = (c >= 'A' && c <= 'Z') ?
		(((c - 'A')+ rot)%26) + 'A' : (c = ( c >= 'a' && c <= 'z') ?
			(((c - 'a')+ rot)%26) + 'a' : c));
}
// un-rotate by any number
int unRotAny(int c, int rot)
{
	return ( c = (c >= 'A' && c <= 'Z') ?
		(((c - 'Z')- rot)%26) + 'Z' : (c = (c >= 'a' && c <= 'z') ?
			(((c - 'z')- rot)%26) + 'z' : c));
}
// rotates char array by any number
void rotAnyChars(char arr[], int size, int rot)
{
	// stub 
}
// un rotates char array by any number
void unRotAnyChars(char arr[], int size, int rot)
{
	// stub
}

int main()
{
	// test character 'w'
	char c = 'w';

	// print character
	printf("%c\n", c);
	
	// rot13 character and print it
	c = (char) rot13(c);
	printf("%c\n", c);

	// rot13 it again and print it
	c = (char) rot13(c);
	printf("%c\n", c);	
	
	// rot13 again for other test cases, no print
	c = (char) rot13(c);	

	// un rot method doesnt work fully
	c = (char) unRot13(c);
	printf("%c\n\n", c);

	// character array and size
	char word[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	int wordSize = distance(begin(word), end(word));
		
	// rotate character array
	rot13Chars(word, wordSize);
	for (int i = 0; i < wordSize; i++)
	{
		printf("%c", word[i]);	
	}
	printf("\n");

	// un rotate character array 
	int wordSize2 = distance(begin(word), end(word));
	unRot13Chars(word, wordSize2);
	for (int i = 0; i < wordSize2; i++)
	{	
		printf("%c", word[i]);
	}
	printf("\n");

	printf("******* ROT ANY *******\n");

	// test character
	char j = 'j';

	// print character
	printf("%c\n", j);	

	// rot any example is 5
	j = (char)  rotAny(j, 5);
	printf("%c\n", j);

	// un rot by any example is 5
	j = (char) unRotAny(j, 5);
	printf("%c\n", j);
}
