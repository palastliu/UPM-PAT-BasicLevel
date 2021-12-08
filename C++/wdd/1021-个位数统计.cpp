#include <iostream>
#include <map>
using namespace std;

int main21()
{
    string n;
    cin >> n;
    // 使用键值对 来存储 值和对应的次数
    map<int, int> counts;
    for (int i = 0; i < n.length(); i++) {
        counts[(n[i] - '0')]++;
    }
    for (map<int, int>::iterator it = counts.begin(); it != counts.end(); it++) {
        cout << it->first << ":" << it->second << endl;
    }
    return 0;
}