package com.tu.languagelab.java8.time;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import org.junit.jupiter.api.Test;
class DeliveryWindowTest { @Test void calculatesTypedDuration() { ZonedDateTime start = ZonedDateTime.of(2026,1,1,9,0,0,0,ZoneId.of("Asia/Shanghai")); assertEquals(90, DeliveryWindow.minutesBetween(start,start.plusMinutes(90))); } }
