#include <iostream>
using namespace std;


int main()
{
	int n;
	
	cin >> n;

	
	int s = 1, //start
		e = 1,  //end
		count = 1, //자기자신 넣어두고
		sum = 1;


	while (e != n  )
	{
		//sum = array[e] - array[s - 1]
		if ( sum == n)
		{
			count++;
			e++;
			sum = sum + e;
		}
		else if (sum > n)
		{
			sum = sum - s;
			s++;
			
		}
		else { //sum < n이라면
			e++;
			sum = sum + e;
		}
	}


	cout << count;
	return 0;
}