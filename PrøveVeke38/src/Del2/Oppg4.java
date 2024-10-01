package Del2;

public class Oppg4 {
	   public static void main(String[] args) {
	        int a = 5;
	        int b = 2;
	        int c = 7;
	        
	        int minste = min(a, b, c);
	        System.out.println("Det minste tallet er: " + minste);
	    }
	    
	    public static int min(int x, int y, int z) {
	        int m = x;
	        
	        if (y < m) {
	            m = y;
	        }
	        
	        if (z < m) {
	            m = z;
	        }
	        
	        return m;
	    }
	    
}
