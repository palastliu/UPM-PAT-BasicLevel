#include <iostream>
using namespace std;

int main11() 
{
    //这里需要使用long，因为int在64位机器上的取值范围为（-2^32～2^32-1）
    int row;
    long int a, b, c;

    cin >> row;
    for (int i = 0; i < row; i++) {
        cin >> a >> b >> c;
        // boolalpha 可以把 1 0 转成 true false 输出
        cout << "Case #" << i + 1 << ": " << boolalpha << (a + b > c) << endl;
    }

    return 0;
}