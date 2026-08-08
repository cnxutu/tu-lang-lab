package com.tu.languagelab.java25.moduleimports;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ModuleImportDemoTest {
    @Test void resolvesModuleType() { assertEquals("Driver", ModuleImportDemo.driverType()); }
}
