/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s15ejercicio01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S15ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> lista = new ArrayList<Integer>();
        
        System.out.print("Ingrese una secuencia de numeros y finalizando con 0: ");
        
        Integer numero = input.nextInt();
        
        while (numero.intValue() != 0) {
            lista.add(numero);
            numero = input.nextInt();            
        }                       
        
        System.out.println("El mayor numero es: " + max(lista));
        
        System.out.println("");
        System.out.println("");        
        
        System.out.println("lista.size() -> " + lista.size());        
        System.out.println("lista.contains(10) -> " + lista.contains(10));        
        System.out.println("lista.get(0) -> " + lista.get(0));
        System.out.println("lista.get(1) -> " + lista.get(1));
        System.out.println("lista.get(2) -> " + lista.get(2));
        System.out.println("lista.get(3) -> " + lista.get(3));
        System.out.println("lista.indexOf(10) -> " + lista.indexOf(10));
        System.out.println("lista.indexOf(20) -> " + lista.indexOf(20));
        System.out.println("lista.indexOf(100) -> " + lista.indexOf(100));
        System.out.println("lista.isEmpty() -> " + lista.isEmpty());
        lista.clear();
        System.out.println("lista.clear() -> ... ");        
        System.out.println("lista.isEmpty() -> " + lista.isEmpty());
        System.out.println("lista.size() -> " + lista.size());                
        
        
        
        
    }

    public static Integer max(ArrayList<Integer> lista) {
        if (lista.size() == 0) {
            return null;            
        }
        
        Integer max = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > max) {
                max = lista.get(i);                
            }
        }
        return max; 
    }
    
}
