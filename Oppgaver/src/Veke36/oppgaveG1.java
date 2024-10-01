package Veke36;

public class oppgaveG1 {

		public static void main(String[] args) {
			 // a) Deklarasjon av variabel n
			int n;
			
			 // b) For-løkke som skriver ut tallene fra 1 til 10
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(i);
	        }

	        // c) Modifiser for-løkken til å bruke verdien av n
	        n = 7; // Du kan endre verdien av n her til ønsket verdi

	        for (int i = 1; i < n; i++) {
	            System.out.println(i);
	        }

	        // Hva skjer hvis n settes til en negativ verdi?
	        n = -3;

	        for (int i = 1; i < n; i++) {
	            System.out.println(i);
	        }
	        // Når n er negativ, vil ikke for-løkken kjøre fordi betingelsen i < n er usann fra starten.
	    }
		 
}
