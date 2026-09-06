#include <iostream>
#include <cstring>

using namespace std;

class LogBuffer
{
private:
    char* buffer;
    int capacity;
    int size;
    static int instanceCount;

public:
    LogBuffer(int cap)
    {
        capacity = cap;
        size = 0;
        buffer = new char[capacity];
        buffer[0] = '\0';
        instanceCount++;

        cout << "[LogBuffer Created]" << endl;
    }

    LogBuffer(const LogBuffer& other)
    {
        capacity = other.capacity;
        size = other.size;
        buffer = new char[capacity];
        strcpy(buffer, other.buffer);
        instanceCount++;

        cout << "[LogBuffer Copied]" << endl;
    }

    LogBuffer& operator=(const LogBuffer& other)
    {
        if (this != &other)
        {
            delete[] buffer;

            capacity = other.capacity;
            size = other.size;

            buffer = new char[capacity];
            strcpy(buffer, other.buffer);
        }

        return *this;
    }

    ~LogBuffer()
    {
        delete[] buffer;
        instanceCount--;

        cout << "[LogBuffer Destroyed]" << endl;
    }

    void append(const char* msg)
    {
        int msgLength = strlen(msg);

        if (size + msgLength < capacity)
        {
            strcpy(buffer + size, msg);
            size += msgLength;
        }
        else
        {
            cout << "Not enough space in buffer." << endl;
        }
    }

    void print() const
    {
        cout << buffer << endl;
    }

    void clear()
    {
        buffer[0] = '\0';
        size = 0;
    }

    static int getInstanceCount()
    {
        return instanceCount;
    }
};

int LogBuffer::instanceCount = 0;

int main()
{
    LogBuffer log1(256);

    log1.append("Server started. ");
    log1.append("Request received.");

    cout << "log1: ";
    log1.print();

    LogBuffer log2 = log1;

    log2.append(" Cached response sent.");

    cout << "log1 after copy: ";
    log1.print();

    cout << "log2 after modification: ";
    log2.print();

    LogBuffer log3(128);

    log3 = log1;

    cout << "log3: ";
    log3.print();

    log1 = log1;

    cout << "log1 after self assignment: ";
    log1.print();

    cout << "Instance Count: "
         << LogBuffer::getInstanceCount()
         << endl;

    return 0;
}