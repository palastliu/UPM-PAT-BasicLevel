#include <iostream>
using namespace std;

int main26()
{
    int c1, c2;
    cin >> c1 >> c2;

    // 123 4577973
    // (4577973-123) / 100 = 45778.5(秒)
    // hh:mm:ss 12:42:59
    // (12 * 60 + 42) * 60 + 59 = 45779(秒-四舍五入)
    // 1h = 3600s（60m * 60）
    // 方法1：
    // h: 12 = 45779 / 60 / 60
    // m: 42 = 45779 / 60 % 60
    // s: 59 = 45779 % 60 % 60 % 60
    // 方法2：
    // h: 12 = 45779 / 60 / 60
    // m: 42 = 45779 / 60 - hh * 60
    // s: 59 = (45779 - 42 * 60) % 60

    // 总运行时间（秒）
    int runTime = (c2 - c1 + 50) / 100;
    int hh = runTime / 60 / 60;
    int mm = runTime / 60 - hh * 60;
    int ss = (runTime - mm * 60) % 60;

    /*  cout << hh << ":" << mm << ":" << ss << endl;*/
    // 个位数，前面需要补 0
    printf("%02d:%02d:%02d\n", hh, mm, ss);
    return 0;
}