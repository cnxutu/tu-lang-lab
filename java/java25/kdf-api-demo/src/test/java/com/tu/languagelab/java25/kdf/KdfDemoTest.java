package com.tu.languagelab.java25.kdf;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class KdfDemoTest {
    @Test void exposesHkdfProvider() throws Exception { assertTrue(KdfDemo.hkdfAvailable()); }
}
