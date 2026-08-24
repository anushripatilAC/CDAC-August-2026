#include <iostream>
#include <cmath>
using namespace std;

int main()
{
	float p,r,t,a,compoundInterest;
	
	cout << "Enter Principle Amount:";
	cin >> p;
	
	cout <<"Enter Rate:";
	cin >> r;
	
	cout <<"Enter Time:";
	cin >> t;
	
	a = p * pow(1 + r/100,t);
	compoundInterest = a - p;
	
	cout << "compound Interest =" << compoundInterest;
	
	return 0;
}