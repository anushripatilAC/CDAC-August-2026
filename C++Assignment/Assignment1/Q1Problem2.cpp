#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    int N;
    double temp[100];

    cout << "Enter number of readings: ";
    cin >> N;

    int skipped = 0;
    int validCount = 0;

    // Read temperature values
    for (int i = 0; i < N; i++)
    {
        cin >> temp[i];
    }

    cout << "Readings entered : " << N << endl;

    cout << "Valid readings : ";

    // Print valid readings
    for (int i = 0; i < N; i++)
    {
        // Negative value = sensor error
        if (temp[i] < 0)
        {
            skipped++;
            continue;
        }

        cout << fixed << setprecision(1) << temp[i] << " ";
        validCount++;
    }

    cout << endl;
    cout << "Skipped (errors) : " << skipped << endl;

    // Find first reading >= 45
    for (int i = 0; i < N; i++)
    {
        if (temp[i] < 0)
            continue;

        if (temp[i] >= 45)
        {
            cout << "\nFirst CRITICAL : Index "
                 << i + 1 << " -> "
                 << fixed << setprecision(1)
                 << temp[i] << "°C" << endl;

            break;
        }
    }

    // Find min, max and average
    double minTemp = 9999;
    double maxTemp = -9999;
    double sum = 0;

    for (int i = 0; i < N; i++)
    {
        if (temp[i] < 0)
            continue;

        if (temp[i] < minTemp)
            minTemp = temp[i];

        if (temp[i] > maxTemp)
            maxTemp = temp[i];

        sum += temp[i];
    }

    double average = sum / validCount;

    cout << "\nMin : " << fixed << setprecision(1) << minTemp << "°C";
    cout << "  Max : " << maxTemp << "°C";
    cout << "  Avg : " << setprecision(2) << average << "°C" << endl;

    // Category counters
    int normal = 0;
    int warning = 0;
    int critical = 0;
    int shutdown = 0;

    for (int i = 0; i < N; i++)
    {
        if (temp[i] < 0)
            continue;

        if (temp[i] < 25)
            normal++;
        else if (temp[i] < 40)
            warning++;
        else if (temp[i] >= 40)
            critical++;

        // 0 can be treated as shutdown if required
        if (temp[i] == 0)
            shutdown++;
    }

    cout << "\nNormal: " << normal;
    cout << "   Warning: " << warning;
    cout << "   Critical: " << critical;
    cout << "   Shutdown: " << shutdown << endl;

    return 0;
}