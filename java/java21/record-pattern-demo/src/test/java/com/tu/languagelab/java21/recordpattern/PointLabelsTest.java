package com.tu.languagelab.java21.recordpattern;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
class PointLabelsTest { @Test void destructuresRecordComponents() { assertEquals("diagonal", PointLabels.label(new Point(2,2))); assertEquals("unknown", PointLabels.label("point")); } }
