/***
 * AbstractList.java
 * @since 17/02/2022
 * Clase abstracta de las listas
 */

public abstract class AbstractList<E> implements List<E> {

     public boolean empty()
    // post: regresa true si la list esta vacia
    {
       return size() == 0;
    }

}
