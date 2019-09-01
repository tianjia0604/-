#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<assert.h>
int MAX_Arry(int *arr, int len)
{
	int Max = arr[0];
	int sum = arr[0];
	int i = 0;
	if (arr == NULL || len <= 1)
	{
		return 0;
	}
	for (i = 0; i < len; i++)
	{
		if (sum < 0)
		{
			sum = arr[i];
		}
		else
			sum += arr[i];
		if (sum>Max)
		{
			Max = sum;
		}
	}
	return Max;
}
int main()
{
	int arr[] = { 1, -2, 3, 10, -4, 7, 2, -5 };
	int len = sizeof(arr) / sizeof(arr[0]);
	printf("%d\n",  MAX_Arry(arr, len));
	system("pause");
	return 0;
}