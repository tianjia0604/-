#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int Numberof1(int n)
{
	int count = 0;
	while (n)
	{
		++count;
		n = (n - 1)&n;
	}
	return count;
}
int main()
{
	printf("%d\n", Numberof1(1000));
	system("pause");
	return 0;
}