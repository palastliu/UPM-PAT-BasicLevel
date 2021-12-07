#include <iostream>
#include <map>
using namespace std;

int main18()
{
    int n;
    cin >> n;

    char gesture_A, gesture_B;
    int win_A = 0, tie_A = 0, lose_A = 0;

    // C 代表“锤子”、
    // J 代表“剪刀”、
    // B 代表 “布”、
    // 使用键值对的 map 来存储 剪刀石头布 和 对应的胜利次数
    map<char, int> win_gesture_A;
    map<char, int> win_gesture_B;
    for (int i = 0; i < n; i++) {
        cin >> gesture_A >> gesture_B;
        // 只需要判断 平手 和 某一方的输赢次数，即可求出双方的 输平赢次数
        if (gesture_A == gesture_B) {
            tie_A++;
        } else if ((gesture_A == 'C' && gesture_B == 'J') || (gesture_A == 'J' && gesture_B == 'B')
            || (gesture_A == 'B' && gesture_B == 'C')) {
            win_A++;
            win_gesture_A[gesture_A]++;
        } else {
            lose_A++;
            win_gesture_B[gesture_B]++;
        }
    }
    // 胜、平、负
    cout << win_A << " " << tie_A << " " << lose_A << endl;
    cout << lose_A << " " << tie_A << " " << win_A << endl;

    // 在 map A队中找出最多胜利次数的 石头剪刀布，如果胜率次数一样，那么按照字母排序
    // 如果都是平手，那么双方的胜利最多的默认是 B-布
    int top_count_A = 0;
    char top_gesture_A = 'B';
    for (map<char, int>::iterator it = win_gesture_A.begin(); it != win_gesture_A.end(); it++) {
        if (it->second > top_count_A) {
            top_count_A = it->second;
            top_gesture_A = it->first;
        }
    }
    cout << top_gesture_A << " ";

    int top_count_B = 0;
    char top_gesture_B = 'B';
    for (map<char, int>::iterator it = win_gesture_B.begin(); it != win_gesture_B.end(); it++) {
        if (it->second > top_count_B) {
            top_count_B = it->second;
            top_gesture_B = it->first;
        }
    }
    cout << top_gesture_B;
    cout << endl;
    return 0;
}