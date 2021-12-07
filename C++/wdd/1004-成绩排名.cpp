#include <iostream>
#include <string>
using namespace std;

int main4()
{
    int n;
    cin >> n;

    int top;
    int lowest;
    string topStudent;  // 直接用 string 存储学生信息
    string lowestStudent;   

    for (int i = 0; i < n; i++) {
        string name;
        string matricNo;
        int score;

        cin >> name;
        cin >> matricNo;
        cin >> score;

        if (i == 0) {
            top = score;
            lowest = score;
            topStudent = name + " " + matricNo;
            lowestStudent = name + " " + matricNo;
        } else {
            if (score > top) {
                top = score;
                topStudent = name + " " + matricNo;
            }

            if (score < lowest) {
                lowest = score;
                lowestStudent = name + " " + matricNo;
            }
        }
    }

    cout << topStudent << endl;
    cout << lowestStudent << endl;

    return 0;
}