#include <iostream>
using namespace std;
int main()
{
	float p,r,t,SimpleInterest;
	
	cout <<"Enter Principle:";
	cin >> p;
 	
	cout <<"Enter Rate:";
	cin >> r;
	
	cout <<"Enter Time:";
	cin >> t;
	
	SimpleInterest =(p*r*t)/100;
	
	cout <<"SimpleInterest:" << SimpleInterest;
}