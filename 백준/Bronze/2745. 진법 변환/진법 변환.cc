#include <iostream>
#include <string>
#include <cmath>
using namespace std;

int main() {
    string N;
    int B,max;
    int result = 0;
    int tmp = 0;
    cin >> N >> B;
    max = N.size()-1;

    for (int i = 0 ; i < N.size(); i++) {

        if (N[i] >= '0' && N[i] <= '9') { //숫자
            tmp = N[i] - '0';
        }
        else {
            tmp = N[i] - 'A' + 10;
        }
        //cout << "pow = " << pow(B, i) * tmp << endl;
        result = result + pow(B, max--) * tmp;
    }
    cout << result;

    return 0;
}