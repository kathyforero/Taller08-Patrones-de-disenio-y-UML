/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.taller8;

/**
 *
 * @author Kathy
 */
public class AutomaticoHandler implements Handler{
    
    private Handler next;
    
    @Override
    public void setNext(Handler h) {
       this.next = h;
    }

    @Override
    public boolean request(float request) {
       // Acepta el pago automáticamente si es de $500 USD. Siempre retorna true.
       if(request<=500){           
        return true;
       } else {
           setNext(next); //Se define en el Main, el siguiente sería el supervisor.
           return false;
       }
    }
    
}
