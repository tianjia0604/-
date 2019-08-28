#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
void ReplaceBlank(char *str, int len)
{
	int MLen = 0;//计算字符的个数
	int NumBlank = 0;//计算空格的数组
	int IndexofMLen = 0;
	int Indexofnew = 0;
	int newlen = 0;
	int i = 0;//从0号下标开始遍历
	if(str == NULL || len <= 0)
	{
		return ;
	}
	while(str[i] != '\0')
	{
		++MLen;
		if (str[i] == ' ')
		{
			++NumBlank;
		}
		++i;
	}
	newlen = MLen + NumBlank * 2;
	if(newlen > len)//newlen是扩充后数组的大小，所以一定要小于len原来大小，不然放不下
	{
		return;
	}
	IndexofMLen = MLen;
	Indexofnew = newlen;
	while (IndexofMLen >= 0 && Indexofnew >IndexofMLen)
	{
		if (str[IndexofMLen] == ' ')
		{
			str[Indexofnew--] = '0';
			str[Indexofnew--] = '2'; 
			str[Indexofnew--] = '%';
		}
		else
		{
			str[Indexofnew--] = str[IndexofMLen];
		}
		--IndexofMLen;
	}
}

int main()
{
	char str[30] = "we are happy";
	int len = (sizeof(str) / sizeof (str[0]));
	ReplaceBlank(str, len);
	printf("%s\n", str);
	system("pause");
	return 0;
}