package com.tu.languagelab.java17.textblock;
public final class NotificationTemplate { private NotificationTemplate() { } public static String render(String user) { return """
                Hello, %s!
                Your learning task is ready.
                """.formatted(user); } }
