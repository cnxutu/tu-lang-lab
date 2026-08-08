package com.tu.languagelab.java8.optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Collections;
import org.junit.jupiter.api.Test;
class UserDirectoryTest { @Test void makesMissingValueExplicit() { assertEquals("anonymous", new UserDirectory(Collections.<String,String>emptyMap()).findDisplayName("u1").orElse("anonymous")); } }
