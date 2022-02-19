/***
 * AbstractStack.java
 * Clase abstracta de los stack
 * @since 17/02/2022
 */

public abstract class AbstractStack<E> implements Stack<E>{
    
    public boolean empty()
    // post: regresa true si el stack esta vacio
    {
       return size() == 0;
    }
}
