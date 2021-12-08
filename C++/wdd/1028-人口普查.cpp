#include <iostream>
#include <string>
using namespace std;

int main28()
{
    int n;
    cin >> n;

    // 初始化 题目给定的 最年轻的和最老的生日
    int valid_birthday = 0;
    string name, birthday;
    string oldest_birthday = "1814/09/06", youngest_birthday = "2014/09/06";
    string oldest_name, youngest_name;
    for (int i = 0; i < n; i++) {
        cin >> name >> birthday;
        if (birthday >= "1814/09/06" && birthday <= "2014/09/06") {
            valid_birthday++;

            if (birthday >= oldest_birthday) {
                oldest_birthday = birthday;
                oldest_name = name;
            } 
            if (birthday <= youngest_birthday) {
                youngest_birthday = birthday;
                youngest_name = name;
            }
        }
    }

    // 这里要注意，有可能都不是有效生日
    cout << valid_birthday;
    if (valid_birthday > 0) {
        cout << " " << youngest_name << " " << oldest_name << endl;
    }

    return 0;
}