/***
 * AbstractStack.java
 * @since 17/02/2022
 * Clase abstracta de los stack
 */

public abstract class AbstractStack<E> implements Stack<E>{
    
    public boolean empty()
    // post: regresa true si el stack esta vacio
    {
       return size() == 0;
    }
}
