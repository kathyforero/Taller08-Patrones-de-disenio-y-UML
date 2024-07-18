/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.taller8;

/**
 *
 * @author Kathy
 */
public class SupervisorHandler implements Handler{
    
    private Handler next;
    
    @Override
    public void setNext(Handler h) {
       this.next = h;
    }

    @Override
    public boolean request(float request) {
       // Pago entre $500 y $1000 USD. Acepta el pago si el supervisor manda su autorización y retorna true, caso contrario lo declina y retorna false.
       if(request>500 && request<=1000){
        //Lógica condicional si el supervisor acepta retornamos true, sino se retorna false.    
        return true;
       } else {
           setNext(next); //Se define en el Main, el siguiente sería el subgerente.
           return false;
       }
    }
}
