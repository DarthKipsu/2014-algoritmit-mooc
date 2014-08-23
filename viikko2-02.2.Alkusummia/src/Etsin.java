

public class Etsin {
	private int[] summat;

    public Etsin(int[] luvut) {
		summat = laskeSummat(luvut);
    }

	private int[] laskeSummat(int[] luvut) {
		int[] summat = new int[luvut.length];
		int summa = 0;
		for (int i=0; i<luvut.length; i++) {
			summa += luvut[i];
			summat[i] = summa;
		}
		return summat;
	}

    public int etsi(int haluttuSumma) {
		int pienin = 0;
		int suurin = summat.length - 1;
		int puolivali;

		while (pienin <= suurin) {
			puolivali = (pienin + suurin) / 2;

			if (summat[puolivali] < haluttuSumma) {
				pienin = puolivali + 1;
			} else if (summat[puolivali] > haluttuSumma) {
				suurin = puolivali - 1;
			} else {
				return puolivali;
			}
		}
		
        return -1;
    }

}