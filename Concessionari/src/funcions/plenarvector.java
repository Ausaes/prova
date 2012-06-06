/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package funcions;

/**
 *
 * @author Ruben
 */
public class plenarvector {
    public static void intordenat(int vector[], int inici){
    for (int i = 0; i < vector.length; i++){
        vector[i] = inici;
        inici++;
    
    }

    }
    public static void intigual (int vector[], int numero){
        for (int i = 0; i < vector.length; i++){
            vector[i] = numero;
            }
    
    
    
    
    }    
public static void intdesordenat (int vector[], int maxim){
       for (int i= 0; i < vector.length; i++){
       vector[i] = (int)(Math.random()* maxim);
       }    
    }
public static void intplenatmanual (int vector[]){
System.out.println("Introdueix la grandaria del vector: ");
    int grandaria = llegir.enter();
    vector = new int [grandaria];

    for (int i = 0; i < vector.length; i++){
    System.out.print("\nIntrodueix el numero de la posicio:\t");
    vector[i] = llegir.enter();
    }

}
//Plenar els vectors float 
    public static void floatigual (float vector[], float numero){
        for (int i = 0; i < vector.length; i++){
            vector[i] = numero;
            }
    
    
    
    
    }    
public static void floatdesordenat (float vector[], float maxim){
       for (int i= 0; i < vector.length; i++){
       vector[i] = (float)(Math.random()* maxim);
       }    
    }

public static void floatplenatmanual (float vector[]){
System.out.println("Introdueix la grandaria del vector: ");
    int grandaria = llegir.enter();
    vector = new float [grandaria];

    for (int i = 0; i < vector.length; i++){
    System.out.print("\nIntrodueix el numero de la posicio:\t");
    vector[i] = llegir.decimal();
    }
}
}