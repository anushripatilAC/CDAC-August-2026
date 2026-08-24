#include <iostream>
using namespace std;
int main()
{
	int a,b;
	int temp;
	
	cout <<" Enter Your Number: ";
	cin >> a >> b;
	
	temp = a;
	a = b;
	b = temp;
	
	cout << "after swapping " << a << " " << b;
	return 0;
}