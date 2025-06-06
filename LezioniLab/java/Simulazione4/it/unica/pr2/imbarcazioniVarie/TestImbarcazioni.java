/*
*
* due in 50 minutes: filename NAME_SURNAME_STUDENTID.zip
* remeber to enable assertion using: -ea (or -enableassertions)
*
*
* Alla fine mancavano 4m e 40s
*
*/
package it.unica.pr2.imbarcazioniVarie;

import java.util.List;

public class TestImbarcazioni {

	public static void main(String[] args) {

		// 20
		Imbarcazione deriva = new Deriva(); // piccola barca a vela
		Imbarcazione barcaAVelaGrande = new BarcaGrandeVela();

		assert (deriva instanceof Vela) && !(deriva instanceof Motore);
		assert (barcaAVelaGrande instanceof Vela) && (barcaAVelaGrande instanceof Motore);


		Imbarcazione gommone = new Gommone();
		Imbarcazione nave = new Nave();

		assert gommone instanceof Motore;
		assert nave instanceof Motore;

		assert !(gommone instanceof Vela);
		assert !(nave instanceof Vela);

		
		// 24
		List<Imbarcazione> imbarcazioni = Imbarcazione.lista();
		assert imbarcazioni.get(3) == deriva;
		assert imbarcazioni.get(2) == barcaAVelaGrande;
		assert imbarcazioni.get(1) == gommone;
		assert imbarcazioni.get(0) == nave;

		Vela vela2 = new BarcaGrandeVela();

		assert imbarcazioni.get(0) == vela2;
		assert imbarcazioni.get(4) == deriva;


		// 28
		assert imbarcazioni.stream().filter(Vela::aVela).count() == 3;
		assert imbarcazioni.stream().filter(Motore::aMotore).count() == 4;


		// 30 hints: you can implement equals in Imbarcazione, hashCode not required
		assert vela2.equals(barcaAVelaGrande);
		assert !vela2.equals(deriva);
		assert !gommone.equals(nave);
		/**/
	}
}
