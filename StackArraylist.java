/***
 * StackArraylist.java
 * @since 17/02/2022
 * Clase stack con arraylist
 */

import java.util.ArrayList;

public class StackArraylist<E> extends AbstractStack<E> {

    private ArrayList<E> stack;

    /**
     * Constructor.
     * Inicializa el stack
     * 
     */
    public StackArraylist(){
        this.stack = new ArrayList<E>();
    }

    /**
     * Indica el stack
     * @return stack arraylist
     */
    public ArrayList<E> getStack() {
        return stack;
    }

    /**
     * Establece el stack
     * @return stack arraylist
     */
    public void setStack(ArrayList<E> stack) {
        this.stack = stack;
    }

        
    /**
     * Agrega un elemento al stack
     * @param item a agregar
     */
    @Override
    public void add(E item) {
        // TODO Auto-generated method stub
        this.stack.add(item);
        
    }

    /**
     * Elimina un elemento del stack
     * regresa el elemento eliminado
     */
    @Override
    public E remove() {
        // TODO Auto-generated method stub
        if (stack.isEmpty()){
            return null;
        } else {
            return stack.remove(this.size()-1);
        }
    }

    /**
     * Regresa el ultimo elemento del stack
     */
    @Override
    public E peek() {
        // TODO Auto-generated method stub
        return stack.get(this.size()-1);
    }

    /**
     * Revisa cuantos elementos hay en el stack
     */
    @Override
    public int size() {
        // TODO Auto-generated method stub
        return stack.size();
    }
    
}
