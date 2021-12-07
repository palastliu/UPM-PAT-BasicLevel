#include <iostream>
using namespace std;

int main6()
{
    int num;
    cin >> num;

    // 先取出该数字的 个位数，十位数和百位数
    int bai = num / 100;
    int shi = num % 100 / 10;
    int ge = num % 10;

    // 分别循环个位，十位和百位数
    for (int i = 0; i < bai; i++) {
        cout << 'B';
    }
    for (int i = 0; i < shi; i++) {
        cout << 'S';
    }
    for (int i = 0; i < ge; i++) {
        cout << i + 1;
    }
    cout << endl;
    return 0;
}