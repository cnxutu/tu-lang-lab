package com.tu.languagelab.java25.shenandoah;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ShenandoahWorkloadTest { @Test void createsAllocationChurn() { assertEquals(0, ShenandoahWorkload.churn(10)); } }
