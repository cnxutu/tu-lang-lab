#include <assert.h>

enum lesson_state { LESSON_DRAFT, LESSON_PUBLISHED };
const char *lesson_label(enum lesson_state state);

int main(void) {
    assert(lesson_label(1)[0] == 'p');
    return 0;
}
