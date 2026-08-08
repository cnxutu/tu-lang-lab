package com.tu.languagelab.java17.sealed;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
class ApprovalMessagesTest { @Test void describesClosedResultSet() { assertEquals("approved", ApprovalMessages.describe(new Approved("Ada"))); assertEquals("rejected", ApprovalMessages.describe(new Rejected("missing"))); } }
