package Box;

	import java.util.Scanner;

public class qq1 {

		static Scanner in = new Scanner(System.in);
	public static void main (String[] args){
	    String[] text = {"java", "один", "из", "языков", "программирования",",","широко","использующийся","в","мире"};
	    int k = 1;
	    char a = 'S';
	    for (int i = 0; i < text.length;i++) {
	    	StringBuilder sb = new StringBuilder(text[i]);
	        if (text[i].length() >= k) {
	        	 sb.deleteCharAt(k);
	        	sb.insert(k,a);
	        	} 
	        System.out.print(text[i] + " ");
	    }

		}
	}
