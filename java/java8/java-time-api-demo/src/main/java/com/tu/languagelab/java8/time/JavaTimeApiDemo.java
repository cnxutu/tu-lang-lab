package com.tu.languagelab.java8.time;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public final class JavaTimeApiDemo { public static void main(String[] args) { ZonedDateTime start = ZonedDateTime.of(2026,1,1,9,0,0,0,ZoneId.of("Asia/Shanghai")); System.out.println(DeliveryWindow.minutesBetween(start,start.plusMinutes(90))); } }
