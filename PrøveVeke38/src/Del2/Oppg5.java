package Del2;

public class Oppg5 {
	public static void main(String[] args) {
        double radius = 7.0;
        double areal = beregnAreal(radius);
        System.out.println("Arealet av sirkelen med radius " + radius + " er: " + areal);
    }

    public static double beregnAreal(double radius) {
        return Math.PI * radius * radius;
    }
}
