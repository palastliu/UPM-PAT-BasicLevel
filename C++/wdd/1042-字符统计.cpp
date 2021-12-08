#include <algorithm>
#include <iostream>
#include <string>
using namespace std;

int main42()
{
    string a;
    getline(cin, a);

    // 先把string 转换成 小写
    transform(a.begin(), a.end(), a.begin(), ::tolower);

    char counts[27] = { 0 }; // 一共26个字母，0-26，27的下标为26
    for (int i = 0; i < a.length(); i++) {
        // 如果是字母，就统计
        if (a[i] >= 'a' && a[i] <= 'z') {
            // 转换成 0-26，存起来
            counts[a[i] - 'a']++;
        }
    }

    // 找出次数最多的下标，最后加 'a'
    char max = 'a';
    int max_count = 0;
    for (int i = 0; i < 27; i++) {
        if (counts[i] > max_count) {
            max = i;
            max_count = counts[i];
        }
    }

    printf("%c %d\n", max + 'a', max_count);

    return 0;
}