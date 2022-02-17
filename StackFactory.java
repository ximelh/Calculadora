/***
 * StackFactory.java
 * @since 17/02/2022
 * Clase factory de los stack 
 */

public class StackFactory<E> {

    /***
     * Metodo para obtener el stack
     * @param entry tipo de stack AL - arraylist, LI - list, VE - vector
     * @param list tipo de list si se elige list S - Single, D - double 
     */
    public Stack<E> getStack(String entry, String list) {
        // seleccion de la implementacion a utilizar:
        if (entry.equalsIgnoreCase("AL"))
          return new StackArraylist<E>(); //regresa ArrayList
        else if (entry.equalsIgnoreCase("LI"))
            return new StackList<E>(list); //regresa List
        else 
            return new StackVector<E>(); //regresa Vector
    }

    
}
