#include <iostream>
using namespace std;

int main27()
{
    int n;
    char symble;
    cin >> n >> symble;

    // 算出 需要打印的星号数量 和 行数
    // 循环求出 1-n 之间的 奇数，并每次 判断 (奇数总和) * 2 - 1 是否 小于等于 n，
    // 如果是，就更新 星号的数量 行数，否则就结束，n-all_symbols 就是 没有出现在沙漏里的
    int temp = 0, all_symbols = 0, rows = 0;
    for (int i = 1; i <= n; i += 2) {
        temp += i;
        if (temp * 2 - 1 <= n) {
            all_symbols = temp * 2 - 1;
            rows = i;
        } else {
            break;
        }
    }
    /* 19
    *空格 星号 行号     空格计算
        0 5   0       5 - 5 /2
        1 3   1       5 - 3 /2
        2 1   2       5 - 1 /2
        ---------------------
        1 3   3       5 - 3 /2
        0 5   4       5 - 5 /2
    */
    int row_symbles = rows; // 每行的星号数，初始化 = 行数
    int output_symbles = 0; // 总共输出的星号数
    for (int i = 0; i < rows; i++) {
        output_symbles += row_symbles;

        for (int j = 0; j < (rows - row_symbles) / 2; j++) {
            cout << ' ';
        }

        for (int j = 1; j <= row_symbles; j++) {
            cout << symble;
        }

        if (output_symbles <= all_symbols / 2) {
            row_symbles -= 2;
        } else {
            row_symbles += 2;
        }

        cout << endl;
    }

    // 要求的数量 减去 已打印的星号数
    cout << n - output_symbles << endl;

    return 0;
}