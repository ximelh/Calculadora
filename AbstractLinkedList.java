/***
 * AbstractLinkedList.java
 * Clase abstracta de las list
 * @since 19/02/2022
 */

public abstract class AbstractLinkedList<E> implements LinkedList<E> {
    
    /**
     * Regresa si la lista esta vacia
     * @return true vacia, false no vacia
     */
    public boolean isEmpty(){
        return(getFirstLink()==null);
    }

}
