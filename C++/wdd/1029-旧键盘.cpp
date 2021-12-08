#include <algorithm>
#include <iostream>
#include <string>
using namespace std;

int main29()
{
    string a, b;
    cin >> a >> b;

    // 先把两个string 都转换成 大写，然后比较
    transform(a.begin(), a.end(), a.begin(), ::toupper);
    transform(b.begin(), b.end(), b.begin(), ::toupper);

    string brokens;
    for (int i = 0; i < a.length(); i++) {
        // 先判断是否在 string b中，再判断答案中是否已经有了
        if (b.find(a[i]) == -1) {
            if (brokens.find(a[i]) == -1) {
                brokens.push_back(a[i]);
            }
        }
    }

    for (int i = 0; i < brokens.length(); i++) {
        cout << brokens[i];
    }
    cout << endl;

    return 0;
}