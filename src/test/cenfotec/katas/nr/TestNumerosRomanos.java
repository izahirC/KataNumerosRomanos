package test.cenfotec.katas.nr;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import cenfotec.katas.nr.Convertidor;

public class TestNumerosRomanos {
	
	@Test
	public void convertirUnidades() {
		int romanoU = 9;
		assertEquals("IX",  Convertidor.Convertir(romanoU));
	}
	
	@Test
	public void convertirDecenas() {
		int romanoD = 85;
		assertEquals("LXXXV",  Convertidor.Convertir(romanoD));
	}
	
	@Test
	public void convertirCentenas() {
		int romanoC = 426;
		assertEquals("CDXXVI",  Convertidor.Convertir(romanoC));
	}
	
	@Test
	public void convertirUnidadesMillar() {
		int romanoUM = 1000;
		assertEquals("M",  Convertidor.Convertir(romanoUM));
	}
	

}
