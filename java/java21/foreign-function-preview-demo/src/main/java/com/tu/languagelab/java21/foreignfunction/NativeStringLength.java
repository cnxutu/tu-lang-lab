package com.tu.languagelab.java21.foreignfunction;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public final class NativeStringLength {
    private NativeStringLength() {
    }

    public static long length(String text) throws Throwable {
        Linker linker = Linker.nativeLinker();
        var strlen = linker.downcallHandle(
                linker.defaultLookup().find("strlen").orElseThrow(),
                FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        try (Arena arena = Arena.ofConfined()) {
            // Arena 绑定 native 内存生命周期，作用域结束后自动释放字符串内存。
            MemorySegment cString = arena.allocateUtf8String(text);
            return (long) strlen.invokeExact(cString);
        }
    }
}
