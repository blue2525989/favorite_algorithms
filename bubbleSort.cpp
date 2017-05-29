#include <iostream>
using namespace std;

int main()
{
	/* Need to read more about passing arrays to functions 
	   to be able to encapsulate this function */
	
	int nums[] = {19, 33, 2, 7, 1};
	// nested loop for sorting
	int size = distance(begin(nums), end(nums));
	for (int i = 0; i < size; i++)
	{
		for (int j = 0; j < size-1; j++)
		{
			if (nums[j] > nums[j+1]) 
			{	
				int temp = nums[j];
				nums[j] = nums[j+1];
				nums[j+1] = temp;
			}
		}
	}
	
	/* Second way of sorting using ternary operator */

	int nums2[] = {44, 77, 65, 23, 65, 37, 97, 26, 91, 96, 45, 68, 39};
	int size2 = distance(begin(nums2), end(nums2));
	for (int i = 0; i < size2; i++)
	{
		for (int j = 0; j < size2 -1; j++)
		{
			int temp;
			temp = (nums2[j] > nums2[j+1]) ?
			 (temp = nums2[j]) & (nums2[j] = nums2[j+1]) & (nums2[j+1] = temp) :
			   nums2[j];
		}
	}
	
	// printing loops
	for (int n = 0; n < size; n++)
	{
		printf("%d\n", nums[n]);
	}
	// newling between outputs
	printf("\n");

	for (int n = 0; n < size2; n++)
	{
		printf("%d\n", nums2[n]);
	}
}
