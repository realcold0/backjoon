#include <iostream>
#include <stack>
#include <string>
using namespace std;

int main()
{
	stack<int> stack;
	int n,k,j =0,x =1;
	string array = "";
	cin >> n;

	for (int i = 1; i <= n; i++)  //n번 반복
	{
		cin >> k;  //수열 입력
		while(k >= x)   //4넣으면 4까지 push
		{
			stack.push(x++);
			array += '+';
		}
		if (stack.empty() || stack.top() < k) 
		{
		
			cout << "NO" << "\n";
			return 0;
		}
		if (k <= stack.top())
		{
			
			while (1)
			{

				if (k == stack.top())
				{
					array += '-';
					stack.pop();
					break;
				}
				else {
					array += '-';
					stack.pop();
				}
			}
			
			
		}
		
	}
	

	for (int i = 0; i < array.length(); i++)
	{
		if (i == array.length() - 1)
		{
			cout << array[i];
		}
		else {

			cout << array[i] << "\n";
		}
	}
	return 0;

}