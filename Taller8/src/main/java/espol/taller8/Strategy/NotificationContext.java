package espol.taller8.Strategy;

public class NotificationContext {
    
    private NotificationStrategy notification;
    private Cliente cliente;
    
    public void setNotificationStrategy(NotificationStrategy _notification, Cliente _cliente){
        notification = _notification;
        cliente = _cliente;
    }
    
    public void sendNotification(){
        notification.Notify();
    }
}
