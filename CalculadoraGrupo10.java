/******************************************************************
Ultima modificacion: 27/01/2022
Clase calculadora grupo 10
@file CalculadoraGrupo10.java
******************************************************************/

public class CalculadoraGrupo10 implements Calculator{

    @Override
    public double calculate(String operation) throws Exception{
        // TODO Auto-generated method stub
        String[] caracteres = operation.split(" ");
        StackGrupo10<Double> stack = new StackGrupo10<Double>();
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
