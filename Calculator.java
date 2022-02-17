/**
 * Defines all the methods that a Calculator should have
 */
public interface Calculator {
    /**
     * Calculates an entire operation.
     * @param operation String containing the operation to be calculated.
     * @param tipoStack el tipo de stack a ser implementado
     * @param tipoList el tipo de lista si se necesita
     * @return double with the result of the operation
     */
    public double calculate(String operation,String tipoStack, String tipoList) throws Exception;
}
