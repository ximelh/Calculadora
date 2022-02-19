/***
 * SimpleLinkedSimple.java
 * Clase para hacer listas simplemente encadenadas
 * @since 17/02/2022
 */

public class SimpleLinkedList<E> extends AbstractLinkedList<E>{

    private LinkSimple<E> firstLink;

    /**
     * Constructor.
     * Inicializa una lista simplemente encadenada
     */
    SimpleLinkedList(){
    }

    /**
     * Obtiene el primer link de la lista
     * @return firstLink
     */
    public LinkSimple<E> getFirstLink() {
        return firstLink;
    }

    /**
     * Establece el primer link de la lista
     * @param firstLink
     */
    public void setFirstLink(LinkSimple<E> firstLink) {
        this.firstLink = firstLink;
    }

    /**
     * Ingresa algo al primer link de la lista
     * @param obj objeto a ingresar
     */
    public void insertLink(E obj){
        LinkSimple<E> newLink = new LinkSimple<E>(obj);
        newLink.setNext(firstLink);

        firstLink = newLink;
    }

    /**
     * Quita el primer link de la lista
     * @return primer link quitado
     */
    public E removeFirst(){
        LinkSimple<E> linkReference = firstLink;
        if(!this.isEmpty()){
            firstLink = firstLink.getNext();   
        } 
        return linkReference.getObj();
    }

    /**
     * Obtiene el primer objeto de la lista
     * @return object
     */
    public E getFirstObj() {
        return firstLink.getObj();
    }

    /**
     * Encuentra el link con el objeto establecido
     * @param obj a encontrar
     * @return link con ese objeto
     */
    public LinkSimple<E> find(E obj){
        LinkSimple<E> theLink = this.firstLink;
        if(!this.isEmpty()){
            while(theLink.getObj() != obj){
                if(theLink.getNext() == null){
                    return null;
                } else {
                    theLink = theLink.getNext();
                }
            }
        }
        return theLink;
    }

    /**
     * Quita un link con un objeto establecido
     * @param obj a quitar
     * @return link del que se quito
     */
    public LinkSimple<E> removeLink(E obj){
        LinkSimple<E> currentLink = this.firstLink;
        LinkSimple<E> previousLink = this.firstLink;

        while(currentLink.getObj() != obj){
            if(currentLink.getNext() == null){
                return null;
            } else {
                previousLink = currentLink;
                currentLink = currentLink.getNext();
            }
        }
        if(currentLink == firstLink){
            firstLink = firstLink.getNext();
        } else{
            previousLink.setNext(currentLink.getNext());
        }
        return currentLink;

    }
    
}