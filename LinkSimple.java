/***
 * LinkSimple.java
 * Clase para hacer links a las listas simples
 * @since 17/02/2022
 */

public class LinkSimple<E> {
    
    private E obj;
    private LinkSimple<E> next;

    /**
     * Constructor.
     * Inicializa un link simple
     */
    LinkSimple(E obj){
        this.setObj(obj);
    }

    /**
     * Obtiene el objeto en el espacio
     * @return object
     */
    public E getObj() {
        return obj;
    }

    /**
     * Obtiene el link siguiente
     * @return link next
     */
    public LinkSimple<E> getNext() {
        return next;
    }

    /**
     * Establece el link siguiente
     * @param next
     */
    public void setNext(LinkSimple<E> next) {
        this.next = next;
    }

    /**
     * Establece el objeto en el espacio
     * @param object
     */
    public void setObj(E obj) {
        this.obj = obj;
    }

}
