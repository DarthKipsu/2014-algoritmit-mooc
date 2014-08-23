
import java.util.Scanner;

public class PieninSuurin {
    public static Scanner lukija = new Scanner(System.in);

    public static void pieninSuurin(int lukuja) {
		int annettuLuku = lukija.nextInt();
        int pienin = annettuLuku;
        int suurin = annettuLuku;

		for (int i=1; i<lukuja; i++) {
			annettuLuku = lukija.nextInt();
			if (annettuLuku < pienin) {
				pienin = annettuLuku;
			}
			if (annettuLuku > suurin) {
				suurin = annettuLuku;
			}
		}


        System.out.println("Pienin: " + pienin);
        System.out.print("Suurin: " + suurin);
    }

    public static void main(String[] args) {
        System.out.print("Kuinka monta? ");
        int lukuja = lukija.nextInt();
        System.out.println("Anna luvut:");
        pieninSuurin( lukuja );
    }
}
