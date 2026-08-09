#include <stddef.h>
#include <stdio.h>

void increment(int *value) {
    /* 指针让函数修改调用方变量，但有效期和非空约束由程序员负责。 */
    if (value != NULL) {
        (*value)++;
    }
}

#ifndef UNIT_TEST
int main(void) {
    int value = 1;
    increment(&value);
    printf("%d\n", value);
    return 0;
}
#endif
