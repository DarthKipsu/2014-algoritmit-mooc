
import java.util.Scanner;

public class Palindromi {
    static Scanner lukija = new Scanner(System.in);

    static boolean palindromi(String sana) {
		if (sana.length() == 0) return true;
		for (int i=0; i<=sana.length()/2; i++) {
			if(sana.charAt(i) != sana.charAt(sana.length()-1-i)) {
				return false;
			}
		}
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Anna sana: ");
        String sana = lukija.nextLine();
        
        if ( palindromi(sana) )
            System.out.print("Sana on palindromi.");
        else
            System.out.print("Sana ei ole palindromi.");
    }
}
