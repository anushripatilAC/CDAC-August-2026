#include <iostream>
#include <memory>
#include <string>

using namespace std;
class Texture
{
private:
    string name;
    int width;
    int height;

public:

    Texture(string n, int w, int h)
    {
        name = n;
        width = w;
        height = h;

        cout << "[Texture Loaded]" << endl;
    }

    ~Texture()
    {
        cout << "[Texture Released]" << endl;
    }

    void display() const
    {
        cout << "Texture Name: " << name << endl;
        cout << "Size: " << width << " x " << height << endl;
    }
};

// Shader class
class Shader
{
private:
    string name;
    string type;

public:

    Shader(string n, string t)
    {
        name = n;
        type = t;

        cout << "[Shader Compiled]" << endl;
    }

    ~Shader()
    {
        cout << "[Shader Destroyed]" << endl;
    }
};


// ==========================================
// PART C - weak_ptr : Non-owning Observer
// ==========================================

// AudioClip class
class AudioClip
{
private:
    string name;
    double duration;

public:

    AudioClip(string n, double d)
    {
        name = n;
        duration = d;

        cout << "[AudioClip Loaded]" << endl;
    }

    ~AudioClip()
    {
        cout << "[AudioClip Unloaded]" << endl;
    }

    string getName() const
    {
        return name;
    }
};


// ==========================================
// MAIN FUNCTION
// ==========================================

int main()
{
    auto tex1 = make_unique<Texture>(
        "player_sprite", 512, 512
    );

    tex1->display();


    // unique_ptr<Texture> tex2 = tex1;


    unique_ptr<Texture> tex2 = move(tex1);


    cout << "tex1 is null: "
         << (tex1 == nullptr ? "YES" : "NO")
         << endl;


    cout << endl;


    // =====================================
    // PART B - shared_ptr
    // =====================================

    auto shader = make_shared<Shader>(
        "main_vert", "vertex"
    );

    cout << "Ref count: "
         << shader.use_count()
         << endl;


    {
        auto rendererRef = shader;

        cout << "Ref count: "
             << shader.use_count()
             << endl;


        auto editorRef = shader;

        cout << "Ref count: "
             << shader.use_count()
             << endl;

    }


    cout << "Ref count: "
         << shader.use_count()
         << endl;


    cout << endl;


    // =====================================
    // PART C - weak_ptr
    // =====================================

    auto audio = make_shared<AudioClip>(
        "explosion", 3.5
    );


    weak_ptr<AudioClip> observer = audio;


    if (auto clip = observer.lock())
    {
        cout << "Clip alive: "
             << clip->getName()
             << endl;
    }


    audio.reset();


    if (observer.expired())
    {
        cout << "Clip already unloaded." << endl;
    }


    return 0;
}
