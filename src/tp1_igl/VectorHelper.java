/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_igl;

import java.util.ArrayList;

/**
 *
 * @author Abdelaziz Ghanemi
 */

public class VectorHelper {
    
    
   protected void Trier(ArrayList<Integer> Vecteur){ 
   int cpt;
   int element;
 
    for (int i = 1; i < Vecteur.size() ; i++)
    {    
        element = Vecteur.get(i);
        cpt = i - 1;
        while (cpt >= 0 && Vecteur.get(cpt) > element)
        {
           Vecteur.set(cpt+1,Vecteur.get(cpt));
           cpt--;
        }
        Vecteur.set(cpt+1,element);
    }
    }
   
   protected ArrayList<Integer> Sommer(ArrayList<Integer> Vecteur1,ArrayList<Integer> Vecteur2) throws TaillesDifferentesException{
      
       int i=0,taille=Vecteur1.size();
       ArrayList<Integer> Vecteur3 = new ArrayList<>();
       if (Vecteur1.size()!=Vecteur2.size()) throw new TaillesDifferentesException();
       else{
          while(i<taille){
           Vecteur3.add(Vecteur1.get(i)+Vecteur2.get(i));
           i++;
       }
   }
       return Vecteur3;
}
   
   protected void MaxMin(ArrayList<Integer> Vecteur){
       int min=Vecteur.get(0),max=Vecteur.get(0);
       
       for(int i=1;i<Vecteur.size();i++){
           if (min > Vecteur.get(i)) min=Vecteur.get(i);
           if (max<Vecteur.get(i)) max=Vecteur.get(i);
       }
       System.out.println(min + " " + max);
   }
}