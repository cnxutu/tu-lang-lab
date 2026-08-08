package com.tu.languagelab.java8.fundamentals.collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CollectionCatalogTest {
    @Test
    void demonstratesCollectionRoles() {
        assertEquals("3:2:2", CollectionCatalog.summarize());
    }
}
