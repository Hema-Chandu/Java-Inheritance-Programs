
class Notification {
    void sendNotification() {
        System.out.println("Sending notification...");
    }
}

class EmailNotification extends Notification {
    @Override
    void sendNotification() {
        System.out.println("Email notification sent.");
    }
}

class SMSNotification extends Notification {
    @Override
    void sendNotification() {
        System.out.println("SMS notification sent.");
    }
}

class PushNotification extends Notification {
    @Override
    void sendNotification() {
        System.out.println("Push notification sent.");
    }
}

public class ex8 {
    public static void main(String[] args) {
        Notification n;

        n = new EmailNotification();
        n.sendNotification();

        n = new SMSNotification();
        n.sendNotification();

        n = new PushNotification();
        n.sendNotification();
    }
}
