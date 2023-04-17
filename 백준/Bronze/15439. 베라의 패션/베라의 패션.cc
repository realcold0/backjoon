#include <iostream>
using namespace std;

int main()
{
	int n;
	cin >> n;
	//n색상으로 상하의를 다르게 하려면 n * n-1
	cout << n * (n - 1);
}