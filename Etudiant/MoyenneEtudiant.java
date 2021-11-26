import java.util.Scanner;
public class MoyenneEtudiant{

  public static void main(String[]args){
       int i,nbreEleve,nbreElevesupMoy;
        double somme=0;
        double moyenne;
        double note[];
        String tab[];
      
      Scanner saisie = new Scanner(System.in);
      System.out.println("entrer le nombre d eleve");
      nbreEleve=saisie.nextInt();
         tab= new String [nbreEleve];
         note= new double [nbreEleve];
      for( i=0;i< nbreEleve;i++){
          saisie.nextLine();
          System.out.println("L eleve numero "+(i+1)+": ");
          System.out.print("Nom:");
          tab[i]=saisie.nextLine();
          System.out.print("Note:");
         note[i]=saisie.nextDouble();  
      }
       for(int v=0;v<tab.length;v++){
           System.out.println(tab[v]);
       }
       for( i=0;i<nbreEleve;i++){
                somme=somme+note[i];
        }

         moyenne=somme/nbreEleve;
        System.out.println("moyenne de la classe:"+ moyenne+ ".");
           double max=note[0];
            double min=note[0];
            String premier="";
            String dernier="";
          for( i=0 ,nbreElevesupMoy=0; i<nbreEleve; i++){
           if(note[i] > max){
               max=note[i];
               premier= tab[i];
           }
            else  if(note[i] < min){
               min=note[i];
               dernier=tab[i];
           }
        }
    
       System.out.println( "l eleve " +premier+ " a la moyenne maximun de :" + max);
       System.out.println( "l eleve " +dernier+ " a la moyenne minimun de :" + min);

        for( i=0,nbreElevesupMoy=0; i<nbreEleve; i++){
            if(note[i]>moyenne){
                nbreElevesupMoy+=1;
            }
        }
        System.out.println(nbreElevesupMoy + " eleve(s) ayant une note superieur a la moyenne" );
        

  }

}