package com.tu.languagelab.java21.sequence;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
class RecentEventsTest { @Test void exposesReverseEncounterOrder() { assertEquals(List.of("third","second","first"), RecentEvents.latestFirst(List.of("first","second","third"))); } }
