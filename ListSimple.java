/***
 * ListSimple.java
 * @since 17/02/2022
 * Clase para hacer una lista simple
 */


public class ListSimple<E> extends AbstractList<E> {
        
    private ArrayList<String> simple = new ArrayList<String>();
	
	/** 
	 * @param item
	 * Inserta un objeto dentro del Stack
	 */
	public void push(String item) {
		// TODO Auto-generated method stub
		simple.add(0, item);
	}
	
	/** 
	 * @return String
	 * Elimina y devuelve la variable que se encuentra en el top del Stack
	 */
	public String pop() {
		// TODO Auto-generated method stub
		String value = peek();
		simple.remove(0);
		return value;
	}
	
	/** 
	 * @return String
	 * Devuelve la variable que se encuentre en el top del Stack
	 */
	public String peek() {
		// TODO Auto-generated method stub
		return simple.get(0);
	}
	
	/** 
	 * @return boolean
	 * Devuelve un valor booleano para reconocer si la lista se encuentra vacia o no
	 */
	public boolean empty() {
		// TODO Auto-generated method stub
		return simple.isEmpty();
	}
	
	/** 
	 * @return int
	 * Devuelve el tamano de la lista
	 */
	public int size() {
		// TODO Auto-generated method stub
		return simple.size();
	}
	
	/** 
	 * @param input
	 */
     
	public Double resolver(String input) {
		// TODO Auto-generated method stub
		Double resultado = 0.0;
		input = input.replaceAll(" ","");
		for(String ch: input.split("")) {
			try {
				//Condicional que analiza el operador
				//Suma, resta, multiplicacion, division, potencia
				switch(ch){
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
				//Condicional de division
				case "/":
					operandoA = Double.parseDouble(pop());
					operandoB = Double.parseDouble(pop());
					//Condicional para verificar que no haya
					//una división inválida.
					if(operandoB == 0) {
						resultado = 0.0;
					}
					resultado = operandoA / operandoB;
					push(resultado.toString());
					break;
				//Funciion que recorre el String
				default:
					try {
						Double test = Double.parseDouble(ch);
						push(ch);
					}catch(Exception e) {}
				}
			}catch(Exception NoSuchElementException) {}
		}
		//Retorna la variable resultado
		return resultado;
	}

}
