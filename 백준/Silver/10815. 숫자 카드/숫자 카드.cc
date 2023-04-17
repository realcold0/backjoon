#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
	int N, M;

	cin >> N;

	int* array_N = new int[N];

	for (int i = 0; i < N; i++)
	{
		cin >> array_N[i];
	}
	
	cin >> M;

	int* array_M = new int[M];

	for (int i = 0; i < M; i++)
	{
		cin >> array_M[i];
	}
	//입력 받기 완료

	//이진 탐색 트리
	sort(array_N, array_N + N);
	
	for (int i = 0; i < M; i++)
	{
		int right = N - 1;
		int left = 0;
		int out = 0;
		while (left <= right)
		{
			int mid = (right + left) / 2;

			if (array_N[mid] == array_M[i])
			{
				out++;

			}
			if (array_N[mid] > array_M[i])
			{
				right = mid - 1;
			}
			else {
				left = mid + 1;

			}

		}
		if (out > 0)
		{
			cout << 1<< " ";

		}
		else {
			cout << 0 << " ";
		}
	}
	


	return 0;

}