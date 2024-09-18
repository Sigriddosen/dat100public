package Del2;
import javax.swing.JOptionPane;
public class Oppg3 {
	public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int number;
        
        while (true) {
            
            String input = JOptionPane.showInputDialog("Skriv inn et heltall (eller 0 for å avslutte):");
            number = Integer.parseInt(input);

            if (number == 0) {
                break;
            }
            sum += number;
            count++;
        }
        JOptionPane.showMessageDialog(null, "Antall tall: " + count + "\nSum: " + sum);
    }
}
