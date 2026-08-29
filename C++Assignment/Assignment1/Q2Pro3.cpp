#include <iostream>
using namespace std;

int main()
{
    int statusReg = 0b10110001;
    int controlReg = 0b01001100;
    int dataReg = 0b01100100;

    const int* regPtr1 = &statusReg;

    cout << "Status Register: " << *regPtr1 << endl;

    // *regPtr1 = 10;
    // regPtr1 = &dataReg;

    int* const regPtr2 = &controlReg;

    *regPtr2 = 25;
    cout << "Control Register: " << *regPtr2 << endl;

    // regPtr2 = &dataReg;

    const int* const regPtr3 = &statusReg;

    cout << "Status Register: " << *regPtr3 << endl;

    // *regPtr3 = 20;
    // regPtr3 = &dataReg;

    return 0;
}