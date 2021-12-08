#include <iostream>
#include <vector>
using namespace std;

int main23()
{
    int n;
    vector<int> positions;
    while (cin >> n) {
        positions.push_back(n);
        if (cin.get() == '\n') {
            break;
        }
    }
    
    int min = 0;
    if (positions[0] != 0) {
        // 找到除 0 之外的 最小值。如果找到，相应的位置次数减 1 
        for (int i = 1; i < positions.size(); i++) {
            if (positions[i] != 0) {
                min = i;
                positions[i]--;
                break;
            }
        }
        cout << min;
    }

    // 嵌套循环输出对应的数组坐标
    for (int i = 0; i < positions.size(); i++) {
        for (int j = 0; j < positions[i]; j++) {
            cout << i;
        }
    }
    cout << endl;
    return 0;
}