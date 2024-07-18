/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package espol.taller8;

/**
 *
 * @author Kathy
 */
public interface Handler {
    public void setNext(Handler h);
    public boolean request(float request);
}
