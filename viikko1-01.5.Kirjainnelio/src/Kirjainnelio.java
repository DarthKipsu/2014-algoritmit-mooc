
import java.util.Scanner;

public class Kirjainnelio {

    public static Scanner lukija = new Scanner(System.in);

    public static void tulostaKirjainnelio(int eriKirjaimia) {
		for (int rivi=0; rivi<eriKirjaimia; rivi++) {
			tulostaRivi(eriKirjaimia, rivi);
		}
		for (int rivi=eriKirjaimia-2; rivi>=0; rivi--) {
			tulostaRivi(eriKirjaimia, rivi);
		}
    }

	private static void tulostaRivi(int eriKirjaimia, int rivi) {
		String rivinKirjaimet = "";
		rivinKirjaimet = muodostaAlkupuolisko(eriKirjaimia, rivi, rivinKirjaimet);
		rivinKirjaimet = kopioiAlkuLoppupuoliskoksi(eriKirjaimia, rivinKirjaimet);
		System.out.println(rivinKirjaimet);
	}

	private static String muodostaAlkupuolisko(int eriKirjaimia, int rivi, String rivinKirjaimet) {
		for (int kirjaimia=0; kirjaimia<eriKirjaimia; kirjaimia++) {
			if (kirjaimia<=rivi) {
				rivinKirjaimet += haeKirjain(kirjaimia);
			} else {
				rivinKirjaimet += haeKirjain(rivi);
			}
		}
		return rivinKirjaimet;
	}

	private static String kopioiAlkuLoppupuoliskoksi(int eriKirjaimia, String rivinKirjaimet) {
		for (int kirjaimia=eriKirjaimia-2; kirjaimia>=0; kirjaimia--) {
			rivinKirjaimet += rivinKirjaimet.charAt(kirjaimia);
		}
		return rivinKirjaimet;
	}

	public static char haeKirjain(int i) {
		String kirjaimet = "ABCDEFGHIJKLMNOPQRSTUVXXYZ";
		return kirjaimet.charAt(i);
	}

    public static void main(String[] args) {
        System.out.print("Anna koko: ");
        int eriKirjaimia = lukija.nextInt();
        tulostaKirjainnelio(eriKirjaimia);
        // huom: oletetaan että myös viimeisen rivin jälkeen on rivinvaihto
    }

}