package animal;

import java.util.Scanner;

public class FinalFile {
	 static Scanner in = new Scanner(System.in);
	 public static void main(String[] args) {
		 com kk = new com();
		 com pp = new com();
		 com gg = new com();
		 int x;
		 System.out.println(" input the number: ");
		 do {
			 System.out.println("1 = crocodile, 2 = lion, 3 = giraffe, 0 = exit" );
			 x = in.nextInt();
			 switch (x){
			 case 1:
				 	kk.cc();	
				 break;
			 case 2:
				 	pp.ll();
				 break;
			 case 3:
				 	gg.ee();
				 break;
			 }
				 
		 } while (x != 0);	
	 }
}