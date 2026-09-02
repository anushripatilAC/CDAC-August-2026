#include <iostream>
#include <string>
#include <cstdlib>
#include <ctime>
#include <algorithm>
using namespace std;

int level = 1;

// Part A: Entity Class
class Entity
{
private:
    string name;
    int health;
    int level;
    string type;

public:
    Entity()
    {
        name = "";
        health = 0;
        level = 0;
        type = "";
    }

    Entity& setName(const string& name)
    {
        this->name = name;
        return *this;
    }

    Entity& setHealth(int health)
    {
        this->health = health;
        return *this;
    }

    Entity& setLevel(int level)
    {
        this->level = level;
        return *this;
    }

    Entity& setType(const string& type)
    {
        this->type = type;
        return *this;
    }

    string getName() const
    {
        return name;
    }

    int getHealth() const
    {
        return health;
    }

    int getLevel() const
    {
        return level;
    }

    string getType() const
    {
        return type;
    }

    void displayInfo() const
    {
        cout << "Name   : " << name << endl;
        cout << "Health : " << health << endl;
        cout << "Level  : " << level << endl;
        cout << "Type   : " << type << endl;
        cout << endl;
    }
};

// Part B: Namespaces

namespace Physics
{
    double clamp(double val, double min, double max)
    {
        return std::max(min, std::min(val, max));
    }

    double lerp(double a, double b, double t)
    {
        return a + (b - a) * t;
    }
}

namespace GameMath
{
    int clamp(int val, int min, int max)
    {
        return std::max(min, std::min(val, max));
    }

    double lerp(double a, double b, double t)
    {
        return a + (b - a) * t;
    }
}

// Limited scope using namespace
void scopeDemo()
{
    using namespace GameMath;

    cout << "Using namespace GameMath:" << endl;
    cout << "Clamp: " << clamp(15, 0, 10) << endl;
}

// Nested namespace
namespace Engine
{
    namespace Audio
    {
        void playSound(string name)
        {
            cout << "Playing: " << name << endl;
        }
    }
}

// Part C: Dynamic 2D Game Map
void gameMap()
{
    int R, C;

    cout << "\nEnter number of rows: ";
    cin >> R;

    cout << "Enter number of columns: ";
    cin >> C;

    int** map = new int*[R];

    for (int i = 0; i < R; i++)
    {
        map[i] = new int[C];
    }

    srand(time(0));

    for (int i = 0; i < R; i++)
    {
        for (int j = 0; j < C; j++)
        {
            map[i][j] = rand() % 5;
        }
    }

    cout << "\n===== GAME MAP (" << R << " x " << C << ") =====\n";

    for (int i = 0; i < R; i++)
    {
        for (int j = 0; j < C; j++)
        {
            cout << map[i][j] << " ";
        }
        cout << endl;
    }

    cout << "\nLegend: 0=Grass  1=Water  2=Mountain  3=Forest  4=Dungeon\n";

    int count[5] = {0};

    for (int i = 0; i < R; i++)
    {
        for (int j = 0; j < C; j++)
        {
            count[map[i][j]]++;
        }
    }

    cout << "\nTile Count:\n";
    cout << "  Grass    : " << count[0] << endl;
    cout << "  Water    : " << count[1] << endl;
    cout << "  Mountain : " << count[2] << endl;
    cout << "  Forest   : " << count[3] << endl;
    cout << "  Dungeon  : " << count[4] << endl;

    for (int i = 0; i < R; i++)
    {
        delete[] map[i];
    }

    delete[] map;
}

int main()
{
    // Part A: Method Chaining
    Entity player, enemy, item;

    player.setName("Aragon")
          .setHealth(100)
          .setLevel(10)
          .setType("Player");

    enemy.setName("Orc")
         .setHealth(60)
         .setLevel(5)
         .setType("Enemy");

    item.setName("HealthPotion")
        .setHealth(0)
        .setLevel(1)
        .setType("Item");

    cout << "===== ENTITIES =====\n\n";

    player.displayInfo();
    enemy.displayInfo();
    item.displayInfo();

    // Part B
    cout << "===== NAMESPACE FUNCTIONS =====\n";

    cout << "Physics clamp: "
         << Physics::clamp(15.5, 0.0, 10.0) << endl;

    cout << "GameMath clamp: "
         << GameMath::clamp(15, 0, 10) << endl;

    cout << "Physics lerp: "
         << Physics::lerp(10.0, 20.0, 0.5) << endl;

    cout << "GameMath lerp: "
         << GameMath::lerp(10.0, 20.0, 0.25) << endl;

    scopeDemo();
    cout << "\n===== SCOPE RESOLUTION BONUS =====\n";
    int level = 5;

    cout << "Local level  : " << level << endl;
    cout << "Global level : " << ::level << endl;

    Engine::Audio::playSound("sword_clash");

    // Part C
    gameMap();

    return 0;