#include <iostream>
using namespace std;
#define MAX 50
int main()
{
	int count;
	int divisor[50];
	
	cin >> count;
	for (int i = 0; i < count; i++)
	{
		cin >> divisor[i];
	}


	int min = divisor[0], max = divisor[0];
	for (int i = 1; i < count; i++)
	{
		if (divisor[i] > max)
		{
			max = divisor[i];
		}
		if (divisor[i] < min)
		{
			min = divisor[i];
		}
	}
	cout << min * max << "\n";
	return 0;


}