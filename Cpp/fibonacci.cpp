#include <iostream>
using namespace std;

int fibonacci(int n)
{
	return (n = (n <= 2) ? (n = (n == 0) ? 0 : 1) : fibonacci(n - 1) + fibonacci(n -2));
}

int main()
{
	int n;
	cout << "Please enter a number to loop to (not to high its fibonacci): " << "";
	cin >> n;

	for (int i = 0; i <= n; i++) 
	{	
		printf("%d\n", fibonacci(i));
	}
} 
