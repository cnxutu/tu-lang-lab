CC ?= cc
CFLAGS ?= -std=c11 -Wall -Wextra -Wpedantic

all: demo

demo: src/main.c
	$(CC) $(CFLAGS) -o demo src/main.c

test: tests/test_pointer.c src/main.c
	$(CC) $(CFLAGS) -DUNIT_TEST -o test_runner tests/test_pointer.c src/main.c
	./test_runner

clean:
	rm -f demo test_runner
