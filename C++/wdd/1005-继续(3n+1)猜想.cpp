#include <algorithm>
#include <iostream>
#include <set>
using namespace std;

int main5()
{
    int n;
    cin >> n;

    // 先把输入所有数的数列计算出来，保存起来。 这里使用 set，因为自动排序和去重
    set<int, greater<int>> nums;
    set<int> sequence;
    for (int i = 0; i < n; i++) {
        int input;
        cin >> input;
        nums.insert(input);

        int count = 0;
        int temp = input;
        while (temp != 1) {
            if (temp % 2 == 0) {
                temp /= 2;
            } else {
                temp = (3 * temp + 1) / 2;
            }
            sequence.insert(temp);
            count++;
        }
    }

    // 再循环所有输入的数，判断是否在数列集合中存在
    // 如果不存在，则为 “关键数”
    set<int, greater<int>> results;
    for (set<int>::iterator it = nums.begin(); it != nums.end(); it++) {
        set<int>::iterator sf = find(sequence.begin(), sequence.end(), *it);
        if (sf == sequence.end()) {
            results.insert(*it);
        }
    }

    // 输出关键数
    for (set<int>::iterator it = results.begin(); it != results.end(); ++it) {
        cout << *it;
        auto temp = it;
        if (++temp != results.end()) {
            cout << " ";
        }
    }
    cout << endl;

    return 0;
}