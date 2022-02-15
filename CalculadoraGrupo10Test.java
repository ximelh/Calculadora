/******************************************************************
 Ultima modificacion: 30/01/2022

 Clase para probar la calculadora
 @file CalculadoraGrupo10Test.java

 ******************************************************************/
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraGrupo10Test {
	
	/**
	 * Evalua el metodo de calculate
	 * @throws Exception 
	 */
	@Test
	void testCalculate() throws Exception {
		CalculadoraGrupo10 calculadora = new CalculadoraGrupo10();
		try {
			assertEquals(15,calculadora.calculate("1 2 + 4 * 3 +"),0.001,"Error en Calculate");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(30,calculadora.calculate("6 2 3 + *"),0.001,"Error en Calculate");
		assertEquals(11,calculadora.calculate("10 3 5 + - 2 + 3 * 4 5 - +"),0.001,"Error en Calculate");
	}
	
	/**
	 * Evalua agregar y quitar elementos del stack
	 */
	@Test
	void testAddRemove() {
		StackGrupo10<Double> stack = new StackGrupo10<Double>();
		stack.add(1.0);
		stack.add(2.0);
		assertEquals(2,stack.remove(),0.001,"Error al quitar elemento del stack");
		assertEquals(1,stack.remove(),0.001,"Error al quitar elemento del stack");
		
	}
	
	/**
	 * Evalua obtener elementos del stack y cuantos elementos hay
	 */
	@Test
	void testPeekSize() {
		StackGrupo10<Double> stack = new StackGrupo10<Double>();
		stack.add(1.0);
		stack.add(2.0);
		assertEquals(2,stack.peek(),0.001,"Error al obtener objeto del stack");
		assertEquals(2,stack.size(),0.001,"Error al obtener objeto del stack");
	}
}
