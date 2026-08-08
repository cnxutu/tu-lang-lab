package com.tu.languagelab.java25.vector;

import jdk.incubator.vector.IntVector;
import jdk.incubator.vector.VectorOperators;

public final class VectorSum {
    private VectorSum() { }
    public static int sum(int[] values) {
        var species = IntVector.SPECIES_PREFERRED;
        int bound = species.loopBound(values.length);
        int result = 0;
        for (int i = 0; i < bound; i += species.length()) {
            result += IntVector.fromArray(species, values, i).reduceLanes(VectorOperators.ADD);
        }
        for (int i = bound; i < values.length; i++) result += values[i];
        // 向量 API 将同一操作映射到 SIMD，尾部元素仍需标量处理。
        return result;
    }
    public static void main(String[] args) { System.out.println(sum(new int[]{1, 2, 3})); }
}
