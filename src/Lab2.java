this is my solution interface Notification {
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


// TODO: Implement EmailFactory
public class EmailFactory extends NotificationFactory{
    @Override
    public Notification createNotification(){return new EmailNotification() }
    
}

// TODO: Implement SMSFactory
public class SMSFactory extends NotificationFactory{
    @Override
    public Notification createNotification(){return new NotificationFactory() }
}

// TODO: Implement PushFactory
public class PushFactory extends NotificationFactory{
    @Override
    public Notification createNotification(){return new PushFactory() }
}
