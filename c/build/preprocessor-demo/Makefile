CC ?= cc
CFLAGS ?= -std=c11 -Wall -Wextra -Wpedantic

all: demo

demo: src/main.c
	$(CC) $(CFLAGS) -DLESSON_VERSION=5 -o demo src/main.c

test: tests/test_preprocessor.c src/main.c
	$(CC) $(CFLAGS) -DUNIT_TEST -DLESSON_VERSION=5 -o test_runner tests/test_preprocessor.c src/main.c
	./test_runner

clean:
	rm -f demo test_runner
