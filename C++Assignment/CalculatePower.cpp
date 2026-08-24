#include <iostream>
using namespace std;
int main()
{
	int base,exponent;
	int result = 1;
	cout << "Enter base and Exponent:";
	cin >> base >> exponent;
	
	for ( int i = 1; i<=exponent;i++){
		result = result*base;
	}

	cout <<"Power=" <<result;
	return 0;
}