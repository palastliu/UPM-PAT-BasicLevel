#include <iostream>
#include <stack>
#include <string>
using namespace std;

int main9() 
{
    string str;
    stack<string> sentence;
    // 反向输出，直接使用stack
    while (cin >> str) {
        sentence.push(str);
        if (cin.get() == '\n') {
            break;
        }
    }

    // 每次弹出最后一个单词
    while (!sentence.empty()) {
        cout << sentence.top();
        if (sentence.size() != 1) {
            cout << " ";
        }
        sentence.pop();
    }
    cout << endl;

    return 0;
}