package com.tu.languagelab.java25.jfraot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class StartupWorkloadTest { @Test void hasStableMarker() { assertEquals("startup-observation", StartupWorkload.marker()); } }
