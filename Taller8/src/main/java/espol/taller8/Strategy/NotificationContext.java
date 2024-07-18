package espol.taller8.Strategy;

import espol.taller8.Cliente;

public class NotificationContext {

    private NotificationStrategy notification;
    private Cliente cliente;

    public void setNotificationStrategy(NotificationStrategy _notification) {
        notification = _notification;
    }

    public void setCliente(Cliente _cliente) {
        cliente = _cliente;
    }

    public void sendNotification() {
        notification.Notify(cliente);
    }
}
