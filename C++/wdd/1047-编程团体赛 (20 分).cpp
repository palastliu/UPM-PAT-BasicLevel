#include <iostream>
#include <string>
#include <map>
using namespace std;

int main47()
{
    int n;
    cin >> n;

    // 使用键值对 来存储 值和对应的次数
    string no;
    int score;
    map<int, int> counts;
    for (int i = 0; i < n; i++) {
        cin >> no >> score;
        int token = stoi(no.substr(0, no.find('-')));
        counts[token] += score;
    }
    
    // 找出最高分
    int top_no = 0;
    int top_score = 0;
    for (map<int, int>::iterator it = counts.begin(); it != counts.end(); it++) {
        if (it->second > top_score) {
            top_no = it->first;
            top_score = it->second;
        }
    }
    cout << top_no << " " << top_score << endl;
    return 0;
}