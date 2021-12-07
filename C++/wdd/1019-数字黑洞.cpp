#include <algorithm>
#include <iostream>
#include <string>
using namespace std;

int main19()
{
    string a, temp;
    cin >> a;
    // 防止输入的数字 不满足 4位数
    a.insert(0, 4 - a.length(), '0');

    // 用 do while 先计算一遍，防止输入6174或者0000，没有结果
    do {
        // 先升序，再降序
        sort(a.begin(), a.end(), greater<int>());
        temp = a;
        sort(a.begin(), a.end());
        // stoi 可以把 string 转成 int
        int r = stoi(temp) - stoi(a);
        cout << temp << " - " << a << " = ";
        a = to_string(r);
        // 如果计算结果不够 4 位数，前面补0
        a.insert(0, 4 - a.length(), '0');
        cout << a << endl;
    } while (a != "6174" && a != "0000"); 

    return 0;
}