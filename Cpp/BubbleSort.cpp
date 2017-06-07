#include <iostream>

/* templates */
void swap(int *xp, int *yp);

void bubbleSort(int arr[], int n);

void printArray(int arr[], int size);

/* main function */
int main()
{
	int arr[] = {64, 24, 14, 132, 233, 32, 311, 35, 358, 543, 254, 244, 222};
	int n = sizeof(arr)/sizeof(arr[0]);
	bubbleSort(arr, n);
	printf("Sorted Array: \n");
	printArray(arr, n);
	return 0;
}

/* pass in pointers */
void swap(int *xp, int *yp)
{
	int temp = *xp;
	*xp = *yp;
	*yp = temp;
}

/* bubbleSort calls swap */
void bubbleSort(int arr[], int n)
{
	int i, j;
	for (i = 0; i < n; i++)
	{
		for (j = 0; j < n-1; j++)
		{
			if (arr[j] > arr[j+1])
			{
				swap(&arr[j], &arr[j+1]);
			}
		}
	}
}

/* print array */
void printArray(int arr[], int size)
{
	for (int i = 0; i < size; i++)
	{
		printf("%d ", arr[i]);
	}
	printf("\n");
}