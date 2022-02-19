/**
 * LinkDouble.java
 * Clase para hacer links dobles
 * @since 19/02/2022
 */


public class LinkDouble<E> {
    private E obj;
    private LinkDouble<E> next;
    private LinkDouble<E> previous;

    /**
     * Constructor.
     * Inicializa un link doble
     */
    LinkDouble(E obj){
        this.setObj(obj);
    }

    /**
     * Obtiene el link anterior
     * @return link previous
     */
    public LinkDouble<E> getPrevious() {
        return previous;
    }
    
    /**
     * Establece el link anterior
     * @param previous
     */
    public void setPrevious(LinkDouble<E> previous) {
        this.previous = previous;
    }

    /**
     * Obtiene el link siguiente
     * @return link next
     */
    public LinkDouble<E> getNext() {
        return next;
    }

    /**
     * Establece el link siguiente
     * @param next
     */
    public void setNext(LinkDouble<E> next) {
        this.next = next;
    }

    /**
     * Obtiene el objeto en el espacio
     * @return object
     */
    public E getObj() {
        return obj;
    }

    /**
     * Establece el objeto en el espacio
     * @param object
     */
    public void setObj(E obj) {
        this.obj = obj;
    }
}
