#include <iostream>
#include <cstring>

// use this with cstring to have access to string functions
// easily, no longer have to type std::
using namespace std;


// defining functions

int rot13(int c);

int unRot13(int c);

void rot13Chars(char arr[], int size);

void unRot13Chars(char arr[], int size);

int rotAny(int c, int rot);

int unRotAny(int c, int rot);

void rotAnyChars(char arr[], int size, int rot);

void unRotAnyChars(char arr[], int size, int rot);

void rotByWord(char master[], int sizeM, char key[], int sizeK);

// main function
int main()
{

	printf("******* ROT 13 *******\n");

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
	printf("\n\n");

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
	printf("%c\n\n", j);

	// rotate character array by any number example is 5
	rotAnyChars(word, wordSize, 5);	
	for (int n = 0; n < wordSize; n++)
	{
		printf("%c", word[n]);
	}
	// new line
	printf("\n");

	// un rotate character array by any number example is 5
	unRotAnyChars(word, wordSize, 5);
	for (int n = 0; n < wordSize; n++)
	{
		printf("%c", word[n]);
	}
	printf("\n");

	// rot by word tests
	char master[] = "jason loves programming";
	char key[] = "goat";
	int sizeM = distance(begin(master), end(master));
	int sizeK = distance(begin(key), end(key));
	
	for (int n = 0; n < sizeM; n++)
	{
		printf("%c", master[n]);
	}
	printf("\n");
	rotByWord(master, sizeM, key, sizeK);
	for (int n = 0; n < sizeM; n++)
	{
		printf("%c", master[n]);
	}
	printf("\n");
}

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
	for (int i = 0; i < size; i++)
	{
		arr[i] = rotAny(arr[i], rot);
	}
}
// un rotates char array by any number
void unRotAnyChars(char arr[], int size, int rot)
{
	for (int i = 0; i < size; i++)
	{
		arr[i] = unRotAny(arr[i], rot);
	}
}
// rotate by word
void rotByWord(char master[], int sizeM, char key[], int sizeK)
{
	int count = 0;
	for (int i = 0; i < sizeM; i++)
	{
		count = (count >= sizeK) ? 0 : count;
		char temp;
		master[i]  = (master[i] >= 'A' && master[i] <= 'Z') ?
			temp = (char) (((master[i] - 'A') + key[count])% 26) + 'A' :
				(temp = (master[i] >= 'a' && master[i] <= 'z') ?
					temp = (char) (((master[i] - 'a') + key[count])% 26)+ 'a' : master[i]);
		count++;
	}
}
// un rotate by word
void unRotByWord(char master[], int sizeM, char key[], int sizeK)
{
	// stub
}
