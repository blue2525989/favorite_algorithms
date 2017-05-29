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

	for (int n = 0; n < size; n++)
	{
		printf("%d\n", nums[n]);
	}
}
