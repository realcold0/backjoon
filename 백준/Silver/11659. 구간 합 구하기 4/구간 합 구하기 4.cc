#include <iostream>
using namespace std;

int main()
{

	int n, m;
	//n, m입력
	cin >> n >> m;
	int* array = new int[n];
	int** section = new int* [m];
	array[0] = 0;
	//n개의 숫자 입력
	for (int i = 1; i <= n; i++)
	{
		cin >> array[i];

		array[i] += array[i - 1];
	}

	//2*m 만큼의 배열 - 구간을 저장
	for (int i = 0; i < m; i++)
	{
		section[i] = new int[2];
		
		cin >> section[i][0] >> section[i][1];

		if (section[i][0] > section[i][1])
		{
			exit(1);
		}
		
	}
	//저장된구간을꺼내 
	int result = 0;
	for (int i = 0; i < m; i++)
	{
		result  = array[section[i][1]] - array[section[i][0] - 1]; 

		cout << result << "\n";
	}

	return 0;

}