#include <iostream>
#include <cmath>
using namespace std;

inline double distanceBetween(double x1, double y1, double x2, double y2)
{
    return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
}

inline double toRadians(double degrees)
{
    return degrees * (M_PI / 180.0);
}

inline double clamp(double value, double minVal, double maxVal)
{
    if (value < minVal)
        return minVal;

    if (value > maxVal)
        return maxVal;

    return value;
}

inline bool isInSafeZone(double x, double y, double cx, double cy, double radius)
{
    return distanceBetween(x, y, cx, cy) <= radius;
}

int main()
{
    double homeX = 0.0;
    double homeY = 0.0;
    double safeRadius = 50.0;

    double x1 = 30.0, y1 = 40.0;
    double x2 = 10.0, y2 = 10.0;
    double x3 = 60.0, y3 = 0.0;

    cout << "Waypoint 1 Distance: "
         << distanceBetween(homeX, homeY, x1, y1) << endl;

    cout << "Waypoint 1 Safe Zone: "
         << (isInSafeZone(x1, y1, homeX, homeY, safeRadius) ? "Inside" : "Outside") << endl;

    cout << "Waypoint 2 Distance: "
         << distanceBetween(homeX, homeY, x2, y2) << endl;

    cout << "Waypoint 2 Safe Zone: "
         << (isInSafeZone(x2, y2, homeX, homeY, safeRadius) ? "Inside" : "Outside") << endl;

    cout << "Waypoint 3 Distance: "
         << distanceBetween(homeX, homeY, x3, y3) << endl;

    cout << "Waypoint 3 Safe Zone: "
         << (isInSafeZone(x3, y3, homeX, homeY, safeRadius) ? "Inside" : "Outside") << endl;

    return 0;
}