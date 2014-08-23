import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Anagrammit {
    public static Scanner lukija = new Scanner(System.in);

    public static boolean anagrammit(String sana1, String sana2) {
		if (sana1.length() != sana2.length()) return false;
		for (int kirjain1 = 0; kirjain1 < sana1.length(); kirjain1++) {
			String haettu = sana1.substring(kirjain1, kirjain1+1);
			sana2 = poistaKirjainJosLoytyy(sana2, haettu);
		}
        return sana2.length() == 0;
    }

	private static String poistaKirjainJosLoytyy(String sana2, String haettu) {
		for (int kirjain2 = 0; kirjain2 < sana2.length(); kirjain2++) {
			String testattava = sana2.substring(kirjain2, kirjain2+1);
			if (testattava.equals(haettu)) {
				sana2 = sana2.replaceFirst(haettu, "");
				break;
			}
		}
		return sana2;
	}

    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
              
            SecureRandom random = new SecureRandom();
            System.out.println(new BigInteger(130, random).toString(32));
  

        }
        System.out.print("Anna 1. sana: ");
        String sana1 = lukija.nextLine();
        System.out.print("Anna 2. sana: ");
        String sana2 = lukija.nextLine();

        if ( anagrammit(sana1, sana2) )
            System.out.print("Annoit anagrammit.");
        else
            System.out.println("Et antanut anagrammeja.");
    }
}
