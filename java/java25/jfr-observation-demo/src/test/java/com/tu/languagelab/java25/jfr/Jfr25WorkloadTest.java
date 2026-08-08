package com.tu.languagelab.java25.jfr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Jfr25WorkloadTest { @Test void createsDeterministicWorkload() { assertEquals(4_999_950_000L, Jfr25Workload.compute()); } }
