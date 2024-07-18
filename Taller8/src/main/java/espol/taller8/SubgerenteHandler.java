/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.taller8;

/**
 *
 * @author Kathy
 */
public class SubgerenteHandler implements Handler{
    
    private Handler next;
    
    @Override
    public void setNext(Handler h) {
       
    }

    @Override
    public boolean request(float request) {
       // Pago entre $1000 y $2000 USD. Acepta el pago si el subgerente y retorna true, caso contrario lo declina y retorna false.
       if(request>1000 && request<=2000){
        //Lógica condicional si el subgerente acepta retornamos true, sino se retorna false.   
        return true;
       } else {
           setNext(next); //Se define en el Main, el siguiente sería el gerente.
           return false;
       }
    }
}
