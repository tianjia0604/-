#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int Partion(int arr[], int left, int right)
{
	int tmp = arr[left];
	while (left < right)
	{
		//右边 找比tmp小的数据
		while (left < right && arr[right] >= tmp)
		{
			right--;
		}
		if (left >= right)
		{
			//arr[left] = tmp;
			break;
		}
		else
		{
			arr[left] = arr[right];
		}
		//左边的   比tmp大的数据
		while (left < right && arr[left] <= tmp)
		{
			left++;
		}
		if (left >= right)
		{
			//arr[left] = tmp;
			break;
		}
		else
		{
			arr[right] = arr[left];
		}
	}
	arr[left] = tmp;
	return left;
}
void PreKNum(int *arr, int len, int k)
{
	int left = 0;
	int right = len - 1;
	int par = Partion(arr, left, right);//5
	int i = 0;
	while (par != k - 1)
	{
		if (par > k - 1)//5 > 2
		{
			right = par - 1;
			par = Partion(arr, left, right);
		}
		else // 5    7
		{
			left = par + 1;
			par = Partion(arr, left, right);
		}
	}
	for (i = 0; i < k; i++)
	{
		printf("%d ", arr[i]);
	}
	printf("\n");
}


int main()
{
	int arr[] = { 12, 3, 5, 17, 0, 7, 14, 8, 4 };
	int len = sizeof(arr) / sizeof(arr[0]);
	PreKNum(arr, len, 5);
	system("pause");
	return 0;
}