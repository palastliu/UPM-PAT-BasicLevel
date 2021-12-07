#include <iostream>
using namespace std;

int isPrimeNumber(const int& num);

int main7()
{
    int n, count = 0;
    cin >> n;
    for (int i = 3; i <= n; i++) {
        // 判断 当前素数 和 素数- 2，如果都是素数，那么就是一对
        if (isPrimeNumber(i - 2) && isPrimeNumber(i)) {
            count++;
        }
    }

    cout << count << endl;

    return 0;
}

// 判断是否是素数
int isPrimeNumber(const int& num)
{
    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return num != 1;
}