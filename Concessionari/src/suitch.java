import funcions.llegir;


public class suitch {
	 switch (llegir.enter()){
     
     case 1: 
         System.out.println("Introdueix el numero de revisió:");
         numrev = llegir.enter();
         c1.revisar(numrev);
         break;
         
     case 2: c1.mostrarRevisions();
     System.out.println("Has fet "+c1.quantitatRevisions()+" revisions");
         break;
     case 3:
         System.out.println("Indica el percentatge que vols que augmente el preu:");
            c1.augmentarPercentatgePreu(llegir.enter());
         break;
         
     case 4: c1.mostrarDades();
        break;
         
     case 5: eixir = true;
     break;
         
         
         
     case 9: // Cotxe cotxeProva = new Cotxe(12349587);
     break;
     case 10: cotxeMeu.preu = 10000;
         break;
         
     case 11: 
         String matric = new String();
         System.out.println("Posa la matricula");
         matric = llegir.Cadena();
         break;
     case 12:
         cotxeMeu.pintar("groc");
         cotxeTeu.pintar("lila");
         break;
     case 13:
     //    cotxeMeu.color = "Verd cuquet";
     //    cotxeTeu.color = "Verd cuquet";
         break;
     case 14:
         cotxeMeu.revisar(1);
         cotxeMeu.revisar(2);
         cotxeMeu.revisar(7);
         cotxeTeu.revisar(2);
         
         break;
     case 15:
         break;
         
     case 16:
         Cotxe cotxeAparador[] = new Cotxe[5];
         for (int i = 0; i < cotxeAparador.length; i++){
         cotxeAparador[i] = new Cotxe();
         }
         
         break;
         
     case 17:
         cotxeAparador[0].revisions[1] = true;
         //si està en privat no deixa fer res des de fora, ha de ser en public.
        
         cotxeAparador[0].revisar(1);
         //en aquest metode et deixa sempre. ja siga public o privat
         
         break;
         
     case 22:
         Cotxe2aMa cotxeAntic = new Cotxe2aMa(3456778, "12345fg", "Ford", "Focus", "verd", 2000, 128000);
         break;
         
     case 23:
 cotxeAntic.mostrardades();
         break;
     
     case 25:
 cotxeAntic.mostrardades();
         break;       

          case 28:
 cotxeAntic.revisar(1);
 break;
     
     default: System.out.println("La opció no és correcta.");
         break;

}
