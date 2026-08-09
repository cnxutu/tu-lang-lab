#include <assert.h>
#include <stddef.h>

void increment(int *value);

int main(void) {
    int value = 1;
    increment(&value);
    assert(value == 2);
    increment(NULL);
    return 0;
}
