package no.hvl.dat100;

public class Velkommen {
    public static void main(String[] args){
    	System.out.println("********** Nå virker det! **********");
    }
    
    { 
    	int antal = 0;
    int i = 1;
    
    while (i < 5) {
         antal++;
         if ((i % 2) == 0) {
            i++;
         }
         i++;
         System.out.println(antal);
    }
    }}
