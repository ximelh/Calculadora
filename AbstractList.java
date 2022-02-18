

/***
 * AbstractList.java
 * @since 17/02/2022
 * Clase abstracta de las listas
 */

public abstract class AbstractList<E> implements List<E> {

   protected double operandoA;
	protected double operandoB;
	
   public boolean empty()
   // post: regresa true si el stack esta vacio
   {
      return size() == 0;
   }

}
