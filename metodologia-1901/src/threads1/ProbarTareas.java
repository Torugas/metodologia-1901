/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads1;

/**
 *
 * @author T-107
 */
public class ProbarTareas {
    
    public static void main(String[] args) {
        
       //creamos el thread
       TareaBasica t1=new TareaBasica();
       t1.start();
        TareaHora t2=new TareaHora();
        t2.start();
    }
    
}
