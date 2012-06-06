package funcions;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruben
 * @version 1.0
 * @category funcions
 */
public class Ordenar {

   
    public static void bombolla(float vector[]) {
        float temp;
        boolean ord;
        {
        for (int ordenat = 0; ordenat < vector.length-1; ordenat++){
            for (int desor = vector.length-1; desor > 0; desor--){
                ord = true;
                if (vector[desor]< vector[desor-1]) {
                    ord = false;
                    temp= vector[desor];
                    
                    vector[desor]= vector[desor - 1];
                    vector[desor - 1] = temp;
                    
                }
        if (ord == true) break;
            }
        }
        
        

    }
}
    public static float [] bombollaretorna (float vector[]){
    float vectormodif [] = new float [vector.length];
    System.arraycopy(vector, 0, vectormodif, 0, vector.length) ;
    bombolla(vectormodif);
    
    return vectormodif;
    }
public static void ordenainsercio (float vector[]){
float aux;
int i;
int f;
int minima = 0;
for (i = 0; i < vector.length -1; i++){
   minima = i;
   
    for ( f = i + 1; f < vector.length; f++){
           if (vector[f]< vector[minima]){
               minima = f;
           }  
    }       
         aux = vector[i];
         vector[i] = vector[minima];
    vector[minima] = aux;
                   
    
    }
}

public static void ordenaseleccio (float vector[]){
float aux;
int i;
int f;
    for (i = 1; i < vector.length; i++){
        aux = vector[i];
        f = i-1;
        while((f>=0) && (aux < vector[f])){
        vector[f+1] = vector[f];
        f--;
        }
        vector[f+1] = aux;
    }




}



}








