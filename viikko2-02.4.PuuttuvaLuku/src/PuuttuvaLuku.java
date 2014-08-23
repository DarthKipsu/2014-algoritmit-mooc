import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PuuttuvaLuku {
    public static Scanner lukija = new Scanner(System.in);

    public static int puuttuvaLuku(int[] luvut) {
		int summa = 0;
		int vaadittuSumma = 0;
		int i = 1;
		for (int luku : luvut) {
			summa += luku;
			vaadittuSumma += i;
			i++;
		}
		vaadittuSumma += i;
        return vaadittuSumma - summa;
    }

    public static void main(String[] args) {
        System.out.print("Suurin luku? ");
        int suurin = lukija.nextInt();
        int luvut[] = new int[suurin-1];

        System.out.println("Anna luvut:");

        for ( int i=0; i<suurin-1; i++ )
            luvut[i] = lukija.nextInt();
        
        int puuttuva = puuttuvaLuku( luvut );

        System.out.println("Puuttuva luku: "+ puuttuva );
    }
}
