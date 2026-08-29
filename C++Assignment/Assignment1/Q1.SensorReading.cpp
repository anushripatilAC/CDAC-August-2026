#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
	double temperature;
	int statuscode;
	cin >> temperature;
	if( temperature < 0){
		statuscode = -1;
	}else if(temperature > 0 && temperature < 29){
		statuscode = 0;
	}else if(temperature > 30 && temperature < 44){
		statuscode = 1;
	}else if(temperature > 45 && temperature < 59){
		statuscode = 2;	
	}else if(temperature > 60){
		statuscode = 3;
	}
	
	double fahrenheit =( temperature * 9/5)+ 32;
	cout << fixed << setprecision(2);
	cout << "Temperature:" << temperature << " C/" << fahrenheit << "F";
	
	switch(statuscode){
	case -1:
		cout << "Status   :SENSOR-ERROR"<< endl;
		cout << "Action    : Sensor fault"<< endl; 
		break;
	case 0:
		cout << "status    :NORMAL"<< endl;
		cout << "Action    :No action Required"<< endl;
		break;
	case 1:
		cout << "Status  :WARNING" <<endl;
		cout << "Action  :Alert sent To supervisor" << endl;
		break;
	case 2: 	
		cout <<" status  :CRITICAL"<< endl;
		cout << "Action : Cooling system Triggred" << endl;
		break;
	case 3:
		cout <<" status :SHUTDOWN "<< endl;
		cout <<" Action :Emergency  shutdown initiated" <<endl;
		break;
}
	
	string reading = (temperature > 25) ? "Above Average" : "Below Average";
	cout << "Reading  :"<< reading <<endl;
	return 0;
}

	
	 