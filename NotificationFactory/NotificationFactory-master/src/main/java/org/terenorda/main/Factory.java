package org.terenorda.main;

public interface Factory {
    Notification createNotification(NotificationType type, String message);
}
