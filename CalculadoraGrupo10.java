/****
 * CalculadoraGrupo10.java
 * @since 17/02/2022
 * Clase de la calculadora
 */

public class CalculadoraGrupo10 implements Calculator {

    //esta es la variable que nos ayuda a aplicar el patron de singleton
    private static CalculadoraGrupo10 calculadora;

    /**
     * Constructor de la calculadora
     */
    private CalculadoraGrupo10(){
    }

    /**
     * Aplicacion del patron singleton
     */
    public static CalculadoraGrupo10 getInstance(){
        return calculadora == null ? calculadora = new CalculadoraGrupo10() : calculadora;
    }

    /***
    * Metodo que calcula la respuesta de un string dado en posfix
    * @param operation string con la operacion a realizar
    * @param tipoStack el tipo del stack a instanciar
    * @param tipoList si se hace list, se necesita el parametro
    */
    @Override
    public double calculate(String operation, String tipoStack, String tipoList) throws Exception{
        // TODO Auto-generated method stub
        String[] caracteres = operation.split(" ");
        StackFactory<Double> stackF = new StackFactory<Double>();
        Stack<Double> stack = stackF.getStack(tipoStack,tipoList);
        double res = 0.0;

        for (String caracter:caracteres){
            try { // si es numero
                stack.add(Double.valueOf(Integer.parseInt(caracter)));

            } catch (Exception e){  //si es caracter + - * /
                if (caracter.equalsIgnoreCase("+")){ //sumar	
                		double num1 = stack.remove();
                		double num2 = stack.remove();
                		stack.add(num1+num2);
                		res = num1+num2;
                
                } else if (caracter.equalsIgnoreCase("-")){ // restar
                		double num1 = stack.remove();
                		double num2 = stack.remove();
                		stack.add(num2-num1);
                		res = num2-num1;
                	
                } else if (caracter.equalsIgnoreCase("/")){ //dividir
                		double num1 = stack.remove();
                		double num2 = stack.remove();
                		stack.add(num2/num1);
                		res = num2/num1;
                	
                } else if (caracter.equalsIgnoreCase("*")){ // multiplicar
                		double num1 = stack.remove();
                		double num2 = stack.remove();
                		stack.add(num2*num1);
                		res = num2*num1;
                } else {
                	throw e;
                }
            }
        }
        return res;
    }
}

    

