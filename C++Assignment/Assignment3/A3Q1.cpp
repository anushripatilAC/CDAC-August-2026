#include <iostream>
#include <string>
#include <vector>
#include <utility>
using namespace std;
enum class HttpStatus{ ok =200,
Created = 201,
BadRequest = 400,
NotFound = 404};

void handleResponse(HttpStatus status,const string& endpoint)
{
    switch(status){
        case HttpStatus::ok:
            cout <<"["<<endpoint<<"]->"<< static_cast<int>(status) << "ok::Request successful"<<endl;
            break;
        case HttpStatus::Created:
            cout <<"["<<endpoint<<"]->"<< static_cast<int>(status) << "Created::Resaurce Successful"<<endl;
            break;
        case HttpStatus::BadRequest:
            cout <<"[" <<endpoint << "]->" << static_cast<int>(status) <<"Badrequest::Invalid Request"<<endl;
            break;
        case HttpStatus::NotFound:
            cout <<"[" <<endpoint<< "]->" << static_cast<int>(status) <<"NotFound::does not exist" <<endl;
            break;
    }
}
//type alias
using Header = pair<string,string>;
using Headerlist = vector<Header>;
using Port= unsigned int ;
using IPAddresss = string;
typedef unsigned long long RequestId;

//function 
void printHeaders(const Headerlist&  headers){
    cout<<"Headers:"<<endl;
    for(const Header& header:headers){
        cout << header.first<<endl;
        cout << header.second<<endl;
    }
}
int main(){
    handleResponse(HttpStatus::ok ,"api/users");
    handleResponse(HttpStatus::Created,"api/Create");
    handleResponse(HttpStatus::BadRequest,"api/unauthorized");
    handleResponse(HttpStatus::NotFound,"api/Product//90");

Port serverport  =8080;
IPAddresss  serverip= "1.09.90,677";
RequestId requestId = 17482793847;


Headerlist headers ={
    {"Content_type","application json"},
    {"Authorizatiom","Barea"},
    {"Accept-Language","en-Us"}
};
cout <<"PortNumber:"<<serverport<<endl;
cout << "IPAddresss:"<<serverip<<endl;
cout <<"requestId:"<<requestId<<endl;

 
printHeaders(headers);
return 0;  

}




