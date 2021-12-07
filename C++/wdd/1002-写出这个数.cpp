#include <iostream>
#include <string>
using namespace std;

int main2()
{
    string n;
    cin >> n;
    string pinyin[] = { "ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu" };

    int sum = 0;
    // string 转 int，求出 sum
    for (int i = 0; i < n.length(); i++) {
        n[i] -= '0';
        sum += n[i];
    }

    // int 转 string，方便循环，映射pinyin数组
    string sum_pinyin = to_string(sum);
    for (int i = 0; i < sum_pinyin.length(); i++) {
        cout << pinyin[sum_pinyin[i] - '0'];
        if (i < sum_pinyin.length() - 1) {
            cout << " ";
        }
    }
    cout << endl;

    return 0;
}