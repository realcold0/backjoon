#include <iostream>
#include <string>
#include <math.h>
using namespace std;

int exchange(char s, int b)
{
	try {
		if (s >= 'A' && s <= 'Z')
		{
			return (s - 65) + 10 ;
		}
		else if (s >= '0' && s <= '9')
		{
			return s - 48;
		}
	}
	catch (int exception) {
		cout << "예외 발생, " << exception << "!" << endl;
	}
}

int main()
{
	string str;
	int b, max;
	long int result = 0;
	cin >> str >> b;

	max = str.length() -1 ;

	for (int i = 0; i < str.length(); i++)
	{
		//cout << exchange(str[i], b) << " " << pow(b, max) << endl;
		result += exchange(str[i], b) * pow(b, max--);
	}
	cout << result;
	//cout << max;



}