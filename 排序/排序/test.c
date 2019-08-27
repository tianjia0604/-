#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
void BubbleSort(int arr[], int size)
{
	int i = 0;
	int j = 0;
	int flag = 0;
	int pos = 0;//记录最后一次交换的位置
	int k = size - i - 1;
	int count = 0;
	for (i = 0; i < size - 1; i++)
	{
		flag = 0;
		pos = 0;
		for (j = 0; j < k; j++)
		{
			if (arr[j]>arr[j + 1])
			{
				int tmp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = tmp;
				flag = 1;//做标记
				pos = j;//记录最后一次交换的位置
			}
			count++;
		}
		if (flag == 0)
		{
			return;
		}
		k = pos;
	}

}
void print(int arr[], int size)
{
	int i = 0;
	for (i = 0; i < size; i++)
	{
		printf("%d ", arr[i]);
	}
}
int main()
{
	int arr[] = { 9, 5, 2, 7 };
	int size = sizeof(arr) / sizeof(arr[0]);
	BubbleSort(arr, size);
	print(arr,size);
	system("pause");
	return 0;
}