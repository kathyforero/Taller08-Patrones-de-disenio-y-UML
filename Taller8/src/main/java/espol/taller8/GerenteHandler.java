/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.taller8;

/**
 *
 * @author Kathy
 */
public class GerenteHandler implements Handler{
    
    private Handler next;
    
    @Override
    public void setNext(Handler h) {
       
    }

    @Override
    public boolean request(float request) {
       // Pago de más de $2000 USD. Acepta el pago si el gerente manda su autorización y retorna true, caso contrario lo declina y retorna false.
       //Lógica condicional si el gerente acepta retornamos true, sino se retorna false. Ya no setteamos next en este caso ya que gerente es el último handler y hasta aquí quedaría el manejo de requests.      
       return true;
    }
}
