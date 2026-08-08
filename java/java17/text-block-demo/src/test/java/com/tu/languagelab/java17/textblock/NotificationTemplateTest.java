package com.tu.languagelab.java17.textblock;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
class NotificationTemplateTest { @Test void preservesReadableMultilineTemplate() { assertEquals("Hello, Ada!\nYour learning task is ready.\n", NotificationTemplate.render("Ada")); } }
