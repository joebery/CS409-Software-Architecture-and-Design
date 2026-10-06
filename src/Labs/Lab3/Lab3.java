package Labs.Lab3;

interface Notification {

    void send(String message);
}


class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}


class SMSNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}


class PushNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Push: " + message);
    }
}


abstract class NotificationFactory {

    public abstract Notification createNotification();
}


class EmailFactory extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}


class SMSFactory extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}


class PushFactory extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}


public class Lab3 {

    public static void main(String[] args) {

        // Create an Email factory
        NotificationFactory emailNotificationFactory = new EmailFactory();

        // Ask the factory to create an EmailNotification
        Notification emailNotification =
                emailNotificationFactory.createNotification();

        // Use the notification
        emailNotification.send("Hello from email!");


        // Create an SMS factory
        NotificationFactory smsNotificationFactory = new SMSFactory();

        Notification smsNotification =
                smsNotificationFactory.createNotification();

        smsNotification.send("Hello from SMS!");


        // Create a Push factory
        NotificationFactory pushNotificationFactory = new PushFactory();

        Notification pushNotification =
                pushNotificationFactory.createNotification();

        pushNotification.send("Hello from Push!");
    }
}