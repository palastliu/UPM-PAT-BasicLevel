#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
using namespace std;

// 使用 map，vector 和数组都超时
// 解决办法：使用 scanf 来获取用户输入，并引用 #include <stdio.h>
int main38()
{
    int n, score;
    scanf("%d", &n);

    // 创建一个 长度为101的数组，因为分数最多1-100，而101的下标为100
    int score_counts[101] = {0};
    for (int i = 0; i < n; i++) {
        scanf("%d", &score);
        score_counts[score]++;
    }

    int search_n, search_score;
    scanf("%d", &search_n);
    for (int i = 0; i < search_n; i++) {
        scanf("%d", &search_score);
        printf("%d", score_counts[search_score]);
        if (i < search_n - 1) {
            printf(" ");
        }
    }
    printf("\n");

    return 0;
}