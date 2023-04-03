#include <iostream>
#include <cmath>  
using namespace std;


int main()
{
	std::ios::sync_with_stdio(false);
	int n;  //입력
	
	
	
	while (cin >> n) {  //지수
		int  multi = 1;  //1로만 이루어진 의 배수
		int k = 1;
		while (1) {
			
			if (multi % n == 0)
			{
				
				break;
			}
			multi = multi * 10 + 1;
			multi %= n;
			k++;
		}
		cout << k << "\n";
	}
		

	
	return 0;
}