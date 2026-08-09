#include <assert.h>

int lesson_version(void);

int main(void) {
    assert(lesson_version() == 5);
    return 0;
}
