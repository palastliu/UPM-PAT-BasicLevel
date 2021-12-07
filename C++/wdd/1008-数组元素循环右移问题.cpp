#include <iostream>
using namespace std;

// 数组元素循环右移问题 
int main8()
{
    // n 为数组size，m 为移动的位数
    int n, m;
    cin >> n;
    cin >> m;

    // 在输入的时候，进行移位输入
    // 从 第 m 位开始，循环 n + m 次
    int* nums = new int[n];
    for (int i = m; i < n + m; i++) {
        // 每次在第 (n + i) % n 的位置上输入，这里形成了一个环
        cin >> nums[(n + i) % n];
    }

    // 循环打印
    for (int i = 0; i < n; i++) {
        cout << nums[i];
        if (i < n - 1) {
            cout << " ";
        }
    }
    cout << endl;

    return 0;
}