/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author T-107
 */
public class Probar {
    public static void main(String[] args) {
        Persona p=new Persona();
        p.altura=1.95f;
        p.peso=98;
        
        Imc x=new Imc();
        x.p=p;
        x.calcular();
        System.out.println("El valor del imc es "+x.valor);
    }
}
