/***
 * List.java
 * @since 17/02/2022
 * Clase para hacer list
 */


public interface List<E> {

     public void push(String item);
	   // La expresion se agrega a la lista
	   
	   public String pop();
	   // La expresión se remueve de la lista y se retorna el valor de dicha funcion. 

	   public String peek();
	   // Se devuelve la ultima expresión que se encuentre en la lista
	   
	   public boolean empty();
	   // Devuelve si la lista se enecuentra vacia o no
	   
	   public int size();
	   // Devuelve la cantidad de elementos dentro de la lista

	   public Double resolver(String input);
	   // Devuelve el calculo resuelto
}
