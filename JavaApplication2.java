/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;


import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Buatois Noe
 */

class MyTask extends TimerTask {
        int times = 6;
       
        public void run() {
            times--;
            
            if (times > 0) {
                System.out.println("il te reste "+times +" minutes avant l'arrive de la police");
            } else {
                System.out.println("Perdu la police vous a trouver faillais etre plus rapide");
            //Stop Timer.
            this.cancel();
            System.exit(0);
            }
        }
    }

public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Timer timer = new Timer("Printer");
        MyTask t = new MyTask();
       
        
        
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int nb1,nb2,nb3; // on declare les variable des trois nombres du cadenas
        int tr1,tr2,tr3;//on declare les variable qui vont etre joué par le user
       
        
        nb1=rand.nextInt(100)+1; // car le rand va de 0 à 99 de base et pas 100
        nb2=rand.nextInt(100)+1;
        nb3=rand.nextInt(100)+1;
        
        System.out.println("votre missions si vous l'accepter est de pirater le code d'un trésor il comporte 3 cadenas pouvant aller de 1 a 100, n'ayer pas peur");
        System.out.println(" vous allez maintenant choisir la difficulté pour l'effraction, facile tapez 1, methodique tapez 2, rapide tapez 3, difficile tapez 4");
        int difficulte=sc.nextInt();
        
        switch(difficulte){
            
            case 1://facile
                timer.schedule(t, 0,60000);
                System.out.println("Vous avez choissis la difficulte facile, par chance le coffre ne se bloque pas au bout d'un certain nombre de tentative, par contre vous disoser de 5 minutes avant de vous faire arreter, bonne chance !");
                int fois=0;
                System.out.println("rentrez le premier nombres qui est entre 1 et 100 :");

                tr1=sc.nextInt();
                while (tr1 != nb1){
                    if(tr1>nb1)
                       System.out.println("le nombre secret est plus petit, reessayer a nouveau :");
                    if(tr1<nb1)
                       System.out.println("le nombre secret est plus grand, reessayer a nouveau :");
                    tr1=sc.nextInt();
                    fois++;
                }
                if (tr1==nb1){
                    System.out.println("bravo vous avez trouvé le premier nombre");
                }

                System.out.println("rentrez le deuxieme nombres qui est entre 1 et 100 :");
                tr2=sc.nextInt();

                while (tr2 != nb2){
                    if(tr2>nb2)
                       System.out.println("le nombre secret est plus petit, reessayer a nouveau :");
                    if(tr2<nb2)
                       System.out.println("le nombre secret est plus grand, reessayer a nouveau :");
                    tr2=sc.nextInt();
                    fois++;
                }
                if (tr2==nb2){
                    System.out.println("bravo vous avez trouvé le second nombre");
                }

                System.out.println("rentrez le troisieme nombres qui est entre 1 et 100 :");
                tr3=sc.nextInt();

                while (tr3 != nb3){
                    if(tr3>nb3)
                       System.out.println("le nombre secret est plus petit, reessayer a nouveau :");
                    if(tr3<nb3)
                       System.out.println("le nombre secret est plus grand, reessayer a nouveau :");
                    tr3=sc.nextInt();
                    fois++;
                }
                if (tr3==nb3){
                    System.out.println("bravo vous avez trouvé le troisieme nombre");
                }

                System.out.println("bravo vous avez trouvé le trésor en "+fois+" tentatives");
                System.exit(0);
            break;
            
            case 2://methodique
                timer.schedule(t, 0,60000);
               System.out.println("Vous avez choissis la difficulte methodique, malheureusement le coffre dispose d'une securite qui se bloque au bout de 20 tentative, de plus vous disoser de 5 minutes avant de vous faire arreter, bonne chance !");
                int reste=30;
                System.out.println("rentrez le premier nombres qui est entre 1 et 100 :");

                tr1=sc.nextInt();
                while (tr1 != nb1){
                    if(reste==0){
                        System.out.println("vous avez echoué trop de fois, le coffre c'est bloqué, vous avez perdu");
                        System.exit(0);
                    } 
                    if(tr1>nb1)
                       System.out.println("le nombre secret est plus petit, il reste "+reste+" essais, reessayer a nouveau :");
                    if(tr1<nb1)
                       System.out.println("le nombre secret est plus grand, il reste "+reste+" essais, reessayer a nouveau :");
                    reste--;
                    tr1=sc.nextInt();
                    
                }
                if (tr1==nb1){
                    System.out.println("bravo vous avez trouvé le premier nombre");
                }

                System.out.println("rentrez le deuxieme nombres qui est entre 1 et 100 :");
                tr2=sc.nextInt();

                while (tr2 != nb2){
                    if(reste==0){
                        System.out.println("vous avez echoué trop de fois, le coffre c'est bloqué, vous avez perdu");
                        System.exit(0);
                    }    
                    if(tr2>nb2)
                       System.out.println("le nombre secret est plus petit, il reste "+reste+" essais, reessayer a nouveau :");
                    if(tr2<nb2)
                       System.out.println("le nombre secret est plus grand, il reste "+reste+" essais, reessayer a nouveau :");
                    reste--;
                    tr2=sc.nextInt();
                    
                }
                if (tr2==nb2){
                    System.out.println("bravo vous avez trouvé le second nombre");
                }

                System.out.println("rentrez le troisieme nombres qui est entre 1 et 100 :");
                tr3=sc.nextInt();

                while (tr3 != nb3){
                    if(reste==0){
                        System.out.println("vous avez echoué trop de fois, le coffre c'est bloqué, vous avez perdu");
                        System.exit(0);
                    } 
                    if(tr3>nb3)
                       System.out.println("le nombre secret est plus petit, il reste "+reste+" essais, reessayer a nouveau :");
                    if(tr3<nb3)
                       System.out.println("le nombre secret est plus grand, il reste "+reste+" essais, reessayer a nouveau :");
                    reste--;
                    tr3=sc.nextInt();
                    
                }
                if (tr3==nb3){
                    System.out.println("bravo vous avez trouvé le troisieme nombre");
                }

                System.out.println("bravo vous avez trouvé le trésor en "+(30-reste)+" tentatives");
                System.exit(0);
            break;
            
            case 3://rapide
                t.times=4;
                timer.schedule(t, 0,60000);
                System.out.println("Vous avez choissis la difficulte rapide, par chance le coffre ne se bloque pas au bout d'un certain nombre de tentative, par contre vous disoser de 3 minutes avant de vous faire arreter, bonne chance !");
                int foi=0;
                
                System.out.println("rentrez le premier nombres qui est entre 1 et 100 :");

                tr1=sc.nextInt();
                while (tr1 != nb1){
                    if(tr1>nb1)
                       System.out.println("le nombre secret est plus petit, reessayer a nouveau :");
                    if(tr1<nb1)
                       System.out.println("le nombre secret est plus grand, reessayer a nouveau :");
                    tr1=sc.nextInt();
                    foi++;
                }
                if (tr1==nb1){
                    System.out.println("bravo vous avez trouvé le premier nombre");
                }

                System.out.println("rentrez le deuxieme nombres qui est entre 1 et 100 :");
                tr2=sc.nextInt();

                while (tr2 != nb2){
                    if(tr2>nb2)
                       System.out.println("le nombre secret est plus petit, reessayer a nouveau :");
                    if(tr2<nb2)
                       System.out.println("le nombre secret est plus grand, reessayer a nouveau :");
                    tr2=sc.nextInt();
                    foi++;
                }
                if (tr2==nb2){
                    System.out.println("bravo vous avez trouvé le second nombre");
                }

                System.out.println("rentrez le troisieme nombres qui est entre 1 et 100 :");
                tr3=sc.nextInt();

                while (tr3 != nb3){
                    if(tr3>nb3)
                       System.out.println("le nombre secret est plus petit, reessayer a nouveau :");
                    if(tr3<nb3)
                       System.out.println("le nombre secret est plus grand, reessayer a nouveau :");
                    tr3=sc.nextInt();
                    foi++;
                }
                if (tr3==nb3){
                    System.out.println("bravo vous avez trouvé le troisieme nombre");
                }

                System.out.println("bravo vous avez trouvé le trésor en "+foi+" tentatives");
                System.exit(0);
            break;
            
            
            case 4://difficile
                t.times=3;
                timer.schedule(t, 0,60000);
               System.out.println("Vous avez choissis la difficulte difficile,vous pensez vraiment reussir permettez moi d'en douter, le coffre dispose d'une securite qui se bloque au bout de 20 tentative, de plus vous disoser de 2 minutes avant de vous faire arreter, bonne chance !");
                int restes=20;
                System.out.println("rentrez le premier nombres qui est entre 1 et 100 :");

                tr1=sc.nextInt();
                while (tr1 != nb1){
                    if(restes==0){
                        System.out.println("vous avez echoué trop de fois, le coffre c'est bloqué, vous avez perdu");
                        System.exit(0);
                    } 
                    if(tr1>nb1)
                       System.out.println("le nombre secret est plus petit, il reste "+restes+" essais, reessayer a nouveau :");
                    if(tr1<nb1)
                       System.out.println("le nombre secret est plus grand, il reste "+restes+" essais, reessayer a nouveau :");
                    restes--;
                    tr1=sc.nextInt();
                    
                }
                if (tr1==nb1){
                    System.out.println("bravo vous avez trouvé le premier nombre");
                }

                System.out.println("rentrez le deuxieme nombres qui est entre 1 et 100 :");
                tr2=sc.nextInt();

                while (tr2 != nb2){
                    if(restes==0){
                        System.out.println("vous avez echoué trop de fois, le coffre c'est bloqué, vous avez perdu");
                        System.exit(0);
                    } 
                    if(restes==0){
                        System.out.println("vous avez echoué trop de fois, le coffre c'est bloqué, vous avez perdu");
                        System.exit(0);
                    }    
                    if(tr2>nb2)
                       System.out.println("le nombre secret est plus petit, il reste "+restes+" essais, reessayer a nouveau :");
                    if(tr2<nb2)
                       System.out.println("le nombre secret est plus grand, il reste "+restes+" essais, reessayer a nouveau :");
                    restes--;
                    tr2=sc.nextInt();
                    
                }
                if (tr2==nb2){
                    System.out.println("bravo vous avez trouvé le second nombre");
                }

                System.out.println("rentrez le troisieme nombres qui est entre 1 et 100 :");
                tr3=sc.nextInt();

                while (tr3 != nb3){
                    if(restes==0){
                        System.out.println("vous avez echoué trop de fois, le coffre c'est bloqué, vous avez perdu");
                        System.exit(0);
                    } 
                    if(tr3>nb3)
                       System.out.println("le nombre secret est plus petit, il reste "+restes+" essais, reessayer a nouveau :");
                    if(tr3<nb3)
                       System.out.println("le nombre secret est plus grand, il reste "+restes+" essais, reessayer a nouveau :");
                    restes--;
                    tr3=sc.nextInt();
                    
                }
                if (tr3==nb3){
                    System.out.println("bravo vous avez trouvé le troisieme nombre");
                }

                System.out.println("bravo vous avez trouvé le trésor en "+(20-restes)+" tentatives");
                System.exit(0);
            break;
        
      
    }
    }
    
}

