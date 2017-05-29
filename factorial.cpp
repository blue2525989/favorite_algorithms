#include <iostream>
using namespace std;

int factorial(int n)
{
	return (n = (n <= 1) ? n : (n * factorial(n -1)));
}

int main()
{
	for (int i = 0; i <= 10; i++) {
		printf("%d\n", factorial(i));
	}
}
