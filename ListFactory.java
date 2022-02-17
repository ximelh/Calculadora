/***
 * ListFactory.java
 * @since 17/02/2022
 * Clase factory de las list
 */

public class ListFactory<E> {

    /***
     * Metodo para obtener el stack
     * @param list tipo de list si se elige list S - Simple, D - double 
     */
    public List<E> getList(String entry) {
        // seleccion de la implementacion a utilizar:
        if (entry.equalsIgnoreCase("S"))
          return new ListSimple<E>(); //regresa Simple
        else 
            return new ListDouble<E>(); //regresa Vector
       }
}
