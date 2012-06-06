
import funcions.llegir;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * 
 * @author ruben
 * @category Exercicis abdó
 * 
 *
 */
 class Cotxe{
	 static int contador = 0;
	 
     int numBastidor;
   private String matricula;
   private String marca;
   private String model;
   private String color;
    int preu;
    public boolean revisions[] = new boolean[7];
    
 //metodes   
   void setBastidor(int bastidor){
   this.numBastidor = bastidor;
   }
   void setModel (String model){
       this.model = model;
   } 
   void setMarca (String marca){
       this.marca = marca;
   }
   void setPreu (int preu){
       this.preu = preu;
   }
    
    void setMatricula(String matricula){
        this.matricula = matricula;
    }
    void mostrarRevisions(){
    
        for (int i = 0; i < 5; i++ ){
            
            if (revisions[i]) System.out.println("La revisió "+i+" està passada");
            else System.out.println("La revisió "+i+" NO està passada");
        }
    System.out.println("");
    }
    int quantitatRevisions(){
        int cont = 0;
        for (int i = 0; i < 5; i++ ){
            if (revisions[i]) cont++;
        }
return cont;
    }
    
    void mostrarDades(){
    System.out.println("El numero de bastidor es: "+numBastidor);
    System.out.println("La matricula es: "+matricula);    
    System.out.println("La marca del cotxe es: "+marca);    
    System.out.println("el model del cotxe es: "+model);
    System.out.println("El color del cotxe es: "+color);  
    System.out.println("El preu del cotxe es: "+preu);
    }
 void pintar(String color){
 this.color = color;
 
 }
 void augmentarPercentatgePreu(int percentatge){
     preu = preu + (preu * percentatge / 100);
 
 }
 void revisar (int revisio){
  if (revisio < 8 && revisio >= 0) revisions[revisio-1] = true;
 
 }
 
 void revisar (boolean revisio[]){
 System.arraycopy(revisio, 0, this.revisions, 0, revisio.length);
 
 }
 
 //CONSTRUCTOR
 
 Cotxe(int numBastidor, String matricula, String marca, String model, String color, int preu){
 contador++;
	 
	 this.numBastidor = numBastidor;
 this.color = color;
 this.marca = marca;
 this.model = model;
 this.matricula = matricula;
 this.preu = preu;
 
 for (int i=0; i < revisions.length; i++){
 revisions[i] = false;
 
 }
 }
 
 Cotxe(){
  System.out.println("Introdueix la matricula");
    matricula = llegir.Cadena();

        System.out.println("Introdueix la marca");
    marca = llegir.Cadena();
    
        System.out.println("Introdueix el model");
    model = llegir.Cadena();
    
        System.out.println("Introdueix el color");
    color = llegir.Cadena();
    
        System.out.println("Introdueix el preu");
    preu = llegir.enter();
    
        System.out.println("Introdueix el numero de bastidor");
    numBastidor = llegir.enter();
  
    for (int i=0; i < revisions.length; i++){
 revisions[i] = false;
    }
 }
 
 
 }


class Cotxe2aMa extends Cotxe{
private int kms;


//Constructors.

Cotxe2aMa(int bastidor, String matricula, String marca, String model, String color, int preu, int km){

    super(bastidor, matricula, marca, model, color, preu);

    this.kms = km;
}

// metodes.
int getKms(){
return this.kms;
}
void setKms(int km){
    this.kms = km;

}

void mostrardades(){
super.mostrarDades();
System.out.println("Els kms que té son: "+kms);
}

}
/**
 *
 * @author Ruben
 */
public class Concessionari {

    /**
     * Un concessionari vol una aplicació per a tindre un control dels 
     * vehicles que ven. Crea una aplicació anomenada Concessionari. 
     * Allí crea la classe Cotxe. De moment, sense atributs ni mètodes. 
     * Ja anirem ampliant-la conforme anem veient més temari.
     */
    
    /* 
     * Posa els següents atributs a la classe Cotxe:
     * numBastidor, matricula, marca, model, color, preu. 
     * També l’atribut privat revisions (vector de 5 booleans).
     */
    
   
    public static void main(String[] args) {
String matricula, marca, model, color;
int preu, numBastidor, numrev;
boolean eixir = false;
Cotxe c1 = new Cotxe();

Cotxe cotxeMeu = new Cotxe();

   Cotxe cotxeTeu = new Cotxe(34645646, "", "Ford", "Focus", "Verd", 10000);
    
    }
}
