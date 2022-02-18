import java.util.Vector;


/***
 * ListDouble.java
 * @since 17/02/2022
 * Clase para hacer una lista doble
 */

public class ListDouble<E> extends AbstractList<E> {

    private Vector<String> vector = new Vector<String>();
	
	/** 
	 * @param item
	 * Inserta un objeto dentro del Stack
	 */
	public void push(String item) {
		// TODO Auto-generated method stub
		vector.add(0, item);
	}
	
	/** 
	 * @return String
	 * Elimina y devuelve la variable que se encuentra en el top del Stack
	 */
	public String pop() {
		// TODO Auto-generated method stub
		String value = peek();
		vector.remove(0);
		return value;
	}
	
	/** 
	 * @return String
	 * Devuelve la variable que se encuentre en el top del Stack
	 */
	public String peek() {
		// TODO Auto-generated method stub
		return vector.get(0);
	}
	
	/** 
	 * @return boolean
	 * Devuelve un valor booleano para reconocer si la pila se encuentra vacia o no
	 */
	public boolean empty() {
		// TODO Auto-generated method stub
		return vector.isEmpty();
	}
	
	/** 
	 * @return int
	 * Devuelve el tamano de la pila
	 */
	public int size() {
		// TODO Auto-generated method stub
		return vector.size();
	}
	
	/** 
	 * @param input
	 * @return Double
	 */
     
	public Double resolver(String input) {
		// TODO Auto-generated method stub
		Double resultado = 0.0;
		input = input.replaceAll(" ","");
		for(String ch: input.split("")) {
		//Funcion que va provando los valores dentro de la pila
			try {
				//Condicional que almacena los posibles casos
				switch(ch){
				//Recorre el string para encontrar un operando
				//Suma, resta, multiplicacion, division, potencia
				case "+":
					operandoA = Double.parseDouble(pop());
					operandoB = Double.parseDouble(pop());
					resultado = operandoA + operandoB;
					push(resultado.toString());
					break;
				case "-":
					operandoA = Double.parseDouble(pop());
					operandoB = Double.parseDouble(pop());
					resultado = operandoA - operandoB;
					push(resultado.toString());
					break;
				case "*":
					operandoA = Double.parseDouble(pop());
					operandoB = Double.parseDouble(pop());
					resultado = operandoA * operandoB;
					push(resultado.toString());
					break;
				//Caso para division
				case "/":
					operandoA = Double.parseDouble(pop());
					operandoB = Double.parseDouble(pop());
					if(operandoB == 0) {
						resultado = 0.0;
					}
					resultado = operandoA / operandoB;
					push(resultado.toString());
					break;
				//Caso contrario a los anteriores,
				//se pasa al siguiente char y se determina
				//su clasificacion.
				default:
					try {
						Double test = Double.parseDouble(ch);
						push(ch);
					}catch(Exception e) {}
				}
			}catch(Exception NoSuchElementException) {}
		}
		//Retorna el resultado postfix
		return resultado;
	}

}
