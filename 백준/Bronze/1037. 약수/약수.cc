#include <iostream>
#include <algorithm>
using namespace std;
#define MAX 50
int main()
{
	int count;
	
	
	cin >> count;
	int *divisor = new int[count];
	for (int i = 0; i < count; i++)
	{
		cin >> divisor[i];
	}

	sort(divisor, divisor + count);
	cout << divisor[0] * divisor[count - 1];
	return 0;


}