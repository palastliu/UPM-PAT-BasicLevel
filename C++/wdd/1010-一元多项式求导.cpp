#include <iostream>
#include <queue>
using namespace std;

int main()
{
    // 比如：a = 3; n = 4;
    // 3 * x ^ 4; 一阶导数 = 12 x ^ 3
    int n;
    queue<int> nums;
    while (cin >> n) {
        nums.push(n);
        if (cin.get() == '\n') {
            break;
        }
    }

    // 使用队列来存储输入的数字
    // 按顺序弹出前面的数字
    // 如果 指数为0 且 没有任何输出的话，输出 0 0
    unsigned size = nums.size();
    unsigned flag = 1;
    while (!nums.empty()) {
        int coefficient = nums.front();
        nums.pop();
        int index = nums.front();
        nums.pop();

        if (index != 0) {
            if (size - 2 > nums.size()) {
                cout << " ";
            }
            cout << coefficient * index << " " << index - 1;
            flag = 0;
        }
    }

    if (flag) {
        cout << "0 0";
    }

    return 0;
}
