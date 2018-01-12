package com.cip.program;

public class Dados {

	public static void main(String[] args) {
     
		System.out.println("EL PRIMER JUGADOR HACE SU PRIMERA TIRADA");

			int dado1 =(int)( Math.random()*6)+1;
        
       System.out.println("DADO1º ES " + dado1);
        
        	int dado2 = (int)(Math.random()*6)+1;
        
        System.out.println("DADO2º ES " + dado2);
        
       
        System.out.println("EL PRIMER JUGADOR HACE SU SEGUNDA TIRADA");

        	int dado3 =(int)( Math.random()*6)+1;
        
        System.out.println("DADO1º ES " + dado3);
        
         	int dado4 = (int)(Math.random()*6)+1;
        
        System.out.println("DADO2º ES " +  dado4);
        
        	int x = dado1+dado2;
        	int y = dado3+dado4;
        
        	double valormayor1 = Math.max(x,y);

        System.out.println("El Valor Mayor jugador 1 es " + valormayor1);
             
        
        System.out.println("EL SEGUNDO JUGADOR HACE SU PRIMERA TIRADA");

        	int dado5 =(int)( Math.random()*6)+1;
        
        System.out.println("DADO1º ES " +  dado5);
        
        	int dado6 = (int)(Math.random()*6)+1;
        
        System.out.println("DADO2º ES " +   dado6);
        
        System.out.println("EL SEGUNDO JUGADOR HACE SU SEGUNDA TIRADA");

        	int dado7 =(int)( Math.random()*6)+1;
        
        System.out.println("DADO1º ES " +   dado7);
        
        int dado8 = (int)(Math.random()*6)+1;
        
        System.out.println("DADO2º ES " +   dado8);
        
        	int a = dado5+dado6;
        	int b = dado7+dado8;
        	double valormayor2 = Math.max(a,b);

        System.out.println("El Valor Mayor jugador 2 es " + valormayor2);
        
                   
            if (valormayor1>valormayor2 && valormayor1!=valormayor2){
        
            System.out.println(" EL GANADOR ES EL JUGADOR 1");
        } 
            else if (valormayor1<valormayor2 && valormayor1!=valormayor2){

            System.out.println("EL GANADOR ES EL JUGADOR 2");
        }    
            else if (valormayor1==valormayor2){
             
            System.out.println("GANAN LOS DOS");
        }
            
            
            
            int media1 = dado1+dado2+dado3+dado4/4;
        
        System.out.println("LA MEDIA DE LOS PRIMEROS 4 DADOS ES " + media1);
        
        	int media2 = dado5+dado6+dado7+dado8/4;
       
        System.out.println("LA MEDIA DE LOS PRIMEROS 4 DADOS ES " + media2);
        

	}

}
