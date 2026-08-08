package com.tu.languagelab.java25.objectheaders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ObjectHeaderWorkloadTest { @Test void allocatesObjects() { assertEquals(4, ObjectHeaderWorkload.allocate(4)); } }
