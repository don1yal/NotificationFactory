package org.terenorda.main;

public class NotificationFactory implements Factory {


    @Override
    public Notification createNotification(NotificationType type, String message) {
        return switch (type.toString().toLowerCase()) {
            case "email" -> new EmailNotification(message);
            case "sms" -> new SMSNotification(message);
            case "push" -> new PushNotification(message);
            default -> throw new Error("Invalid notification type: " + type);
        };
    }
}
