package com.tu.languagelab.java25.pem;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class PemDemoTest { @Test void formatsPemBoundary() { assertTrue(PemDemo.encodeRecord().contains("BEGIN K5 DATA")); } }
