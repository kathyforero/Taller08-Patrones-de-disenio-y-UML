package espol.taller8.Strategy;

public class NotificationContext {
    
    private NotificationStrategy notification;
    
    public void setNotificationStrategy(NotificationStrategy _notification){
        notification = _notification;
    }
    
    public void sendNotification(){
        notification.Notify();
    }
}
