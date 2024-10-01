package Veke36;

public class oppgaveG3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a) for løkke som skriver ut tallene 1-20
      	for(int i = 1; i <= 20; i++) {
      		
      	// b) switch-setning bytter ut noken tall med bokstaver
//			switch (i) {
//			case 1:
//				System.out.println(i+"A");
//				break;
//			case 2:
//				System.out.println(i+"B");
//				break;
//			case 3:
//				default:
//				System.out.println(i+"C");
//				break;
//			}
			
		//c) if-setning bytter ut noken tall med bokstaver
			if (i==1) {
			System.out.println(i+"A");
			} else if (i==2){
			System.out.println(i+"B");
			}else {
			System.out.println(i+"C");
			}
		}
	}
}
