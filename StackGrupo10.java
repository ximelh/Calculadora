/******************************************************************
Ultima modificacion: 27/01/2022

Clase stack grupo 10
@file StackGrupo10.java

******************************************************************/
import java.util.*;

public class StackGrupo10<E> implements Stack<E> {

    private Vector<E> stack;// = new Vector<E>();
    private int top;

    /**
     * Constructor.
     * Inicializa el stack
     * Top es -1
     */
    public StackGrupo10(){
        this.stack = new Vector<E>();
        this.top = -1;
    }

    /**
     * Indica el stack
     * @return stack vector
     */
    public Vector<E> getStack() {
        return this.stack;
    }

    /**
     * Indica el top
     * @return top int
     */
    public int getTop() {
        return this.top;
    }

    /**
     * Establece el stack
     * @param stack
     */
    public void setStack(Vector<E> v) {
        this.stack = v;
    }

    /**
     *  Establece el top
     * @param int
     */
    public void setTop(int i) {
        this.top = i;
    }

        
    /**
     * Agrega un elemento al stack
     */
    @Override
    public void add(E item) {
        // TODO Auto-generated method stub
        this.stack.addElement(item);
        this.top++;
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
            E e = stack.lastElement();
            this.stack.removeElementAt(top);
            this.top--;
            return e;
        }

    }

    /**
     * Regresa el ultimo elemento del stack
     */
    @Override
    public E peek() {
        // TODO Auto-generated method stub
        if (stack.isEmpty()){
            return null;
        } else {
            return stack.lastElement();
        }
    }


    /**
     * Revisa si el stack esta vacio
     */
    @Override
    public boolean empty() {
        // TODO Auto-generated method stub
        return stack.isEmpty();
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
