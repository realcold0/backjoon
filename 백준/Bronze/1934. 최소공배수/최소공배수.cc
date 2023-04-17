#include <iostream>
using namespace std;

// 최대공약수를 구하는 함수 (유클리드 호제법 이용)
int uclid(int a, int b) {

	int r = a % b;
	
	if (r == 0) {
		return b;
	}
	
	else {
		return uclid(b, r);
	}

}

int main()
{
	int T;
	cin >> T;
	int* array1 = new int[T]; //하나씩
	int* array2 = new int[T]; //넣기
	int* array3 = new int[T]; // 정답
	//a*b= 최대 공약수 * 최소공배수
	//최소 공배수 = a*b/최대 공약수


	for (int i = 0; i < T; i++)
	{
		cin >> array1[i];
		cin >> array2[i];
	}

	for (int i = 0; i < T; i++)
	{
		array3[i] =	array1[i] * array2[i] / uclid(array1[i], array2[i]);
	}

	for (int i = 0; i < T; i++)
	{
		cout << array3[i] << "\n";
	}


	return 0;
}