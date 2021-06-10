package Ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CovidTest {

	@Test
	void testCalcularPrioridadVacunacion() {
		Covid covid1= new Covid();
		Assertions.assertEquals(covid1.calcularPrioridadVacunacion(56, 1), 2);
		
		Assertions.assertEquals(covid1.calcularPrioridadVacunacion(40, 1) , 3);
		
		Assertions.assertEquals(covid1.calcularPrioridadVacunacion(32 ,1) , 1);
	}

}
