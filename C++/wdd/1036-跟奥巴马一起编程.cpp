#include <iostream>
using namespace std;

int main36()
{
    int n;
    char symbol;
    cin >> n >> symbol;

    // 目的是为了 四舍五入，如果是奇数 9：9/2 + 9%2 = 4+1= 5
    int rows = n / 2 + n % 2;

    // 先输出第一列和最后一列 都是 symbol，
    // 除了第一行和最后一行，中间列都用 空格代替
    for (int i = 0; i < rows; i++) {
        cout << symbol;
        for (int j = 1; j < n - 1; j++) {
            if (i == 0 || i == rows - 1) {
                cout << symbol;
            } else {
                cout << ' ';
            }
        }
        cout << symbol << endl;
    }

    return 0;
}