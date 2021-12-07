#include <iostream>
using namespace std;

int main1()
{
    int n;
    cin >> n;

    // 统计计算了多少步
    int count = 0;
    while (n != 1) {
        // 如果是偶数，取一半
        if (n % 2 == 0) {
            n /= 2;
        } else {
            // 否则 取（3 * n + 1）的一半
            n = (3 * n + 1) / 2;
        }
        count++;
    }

    cout << count << endl;
    return 0;
}