#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

class Product
{
private:
    int productId;
    string name;
    double price;
    int quantity;

public:
    void acceptDetails()
    {
        cout << "Enter Product ID: ";
        cin >> productId;

        cout << "Enter Product Name: ";
        cin >> name;

        cout << "Enter Price: ";
        cin >> price;

        cout << "Enter Quantity: ";
        cin >> quantity;
    }

    void displayDetails() const
    {
        cout << left << setw(8) << productId
             << setw(15) << name
             << setw(10) << fixed << setprecision(2) << price
             << setw(8) << quantity
             << setw(15) << totalValue();

        cout << endl;
    }

    double totalValue() const
    {
        return price * quantity;
    }

    bool isLowStock(int threshold) const
    {
        return quantity < threshold;
    }

    string getName() const
    {
        return name;
    }
};

double reorderCost(int qty, double unitPrice)
{
    return qty * unitPrice;
}

double reorderCost(double qty, double unitPrice)
{
    return qty * unitPrice;
}

double reorderCost(int qty, double unitPrice, double taxRate)
{
    double cost = qty * unitPrice;
    return cost + (cost * taxRate / 100);
}

double applyDiscount(double price, double discountPercent = 10.0)
{
    return price - (price * discountPercent / 100);
}

int main()
{
    Product products[5];

    cout << "===== ENTER PRODUCT DETAILS =====\n";

    for (int i = 0; i < 5; i++)
    {
        cout << "\nProduct " << i + 1 << endl;
        products[i].acceptDetails();
    }

    cout << "\n===== INVENTORY REPORT =====\n";

    cout << left << setw(8) << "ID"
         << setw(15) << "Name"
         << setw(10) << "Price"
         << setw(8) << "Qty"
         << setw(15) << "Total Value"
         << endl;

    cout << "----------------------------------------------------------\n";

    for (int i = 0; i < 5; i++)
    {
        products[i].displayDetails();
    }

    int highestIndex = 0;

    for (int i = 1; i < 5; i++)
    {
        if (products[i].totalValue() > products[highestIndex].totalValue())
        {
            highestIndex = i;
        }
    }

    cout << "\nHighest Value Product: "
         << products[highestIndex].getName()
         << " (Rs. "
         << fixed << setprecision(2)
         << products[highestIndex].totalValue()
         << ")\n";

    int threshold;

    cout << "\nEnter stock threshold: ";
    cin >> threshold;

    cout << "\nLow Stock Products: ";

    bool found = false;

    for (int i = 0; i < 5; i++)
    {
        if (products[i].isLowStock(threshold))
        {
            cout << products[i].getName() << " ";
            found = true;
        }
    }

    if (!found)
    {
        cout << "None";
    }

    cout << "\n\n===== FUNCTION OVERLOADING =====\n";

    cout << "Reorder Cost (int quantity): "
         << reorderCost(10, 100.0) << endl;

    cout << "Reorder Cost (double quantity): "
         << reorderCost(10.5, 100.0) << endl;

    cout << "Reorder Cost (with tax): "
         << reorderCost(10, 100.0, 18.0) << endl;

    cout << "\n===== DEFAULT ARGUMENT =====\n";

    cout << "Discount with default 10%: "
         << applyDiscount(1000) << endl;

    cout << "Discount with 20%: "
         << applyDiscount(1000, 20) << endl;

    return 0;
}