#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int Partition(int arr[], int left, int right)
{
	int tmp = arr[left];
	while (left < right)
	{
		//�ұ� �ұ�tmpС������
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
		//��ߵ�   ��tmp�������
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
int BeyondArrayLengthHalf(int *arr, int len)
{
	int mid = len / 2;
	int left = 0;
	int right = len - 1;
	int par = Partition(arr, left, right);
	int result = 0;
	if (arr == NULL || len < 0)
	{
		return 0;//�������鵱�в��������0
	}
	while (par != mid)
	{
		if (par > mid)
		{
			right = par - 1;
			par = Partition(arr, left, right);
		}
		if (par < mid)
		{
			left = par + 1;
			par = Partition(arr, left, right);
		}
	}
	result = arr[mid];
	if (!CheakMoreThanHalf(arr, len, result))
	{
		return 0;
	}
	return result;
}
int CheakMoreThanHalf(int *arr, int len, int val)
{
	int count = 0;
	int i = 0;
	for (i = 0; i < len; i++)
	{
		if (arr[i] == val)
		{
			count++;
		}
	}
	if (count >= len / 2)
	{
		return 1;
	}
	return 0;

}
int main()
{
	int ret = 0;
	int arr[] = { 1, 2, 3, 2, 2, 2, 0, 2 };
	int len = sizeof(arr) / sizeof(arr[0]);
	ret = BeyondArrayLengthHalf(arr, len);
	printf("%d\n", ret);
	system("pause");
	return 0;
}
