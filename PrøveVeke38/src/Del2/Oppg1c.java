package Del2;

public class Oppg1c {
	public static void main(String[] args) {
        int tall = 4;
        String svar;

        switch (tall) {
            case 0:
                svar = "null";
                break;
            case 1:
                svar = "en";
                break;
            case 2:
                svar = "to";
                break;
            case 3:
                svar = "tre";
                break;
            case 4:
                svar = "fire";
                break;
            default:
                svar = "ulovlig verdi";
                break;
        }

        System.out.println(svar);
    }
}
