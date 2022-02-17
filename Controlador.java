/***
 * Controlador.java
 * @since 17/02/2022
 * Clase para controlar archivos
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Controlador {

    /**
     * Devuelve el arraylist con todas las operaciones a realizar
     * @return arraylist con las operaciones a realizar
     */
    public static ArrayList<String> leerArchivo(){
        ArrayList<String> operaciones = new ArrayList<String>();
        try{ //leer el archivo
            File file = new File("datos.txt");
            Scanner s = new Scanner(file);
            while (s.hasNextLine()){
                operaciones.add(s.nextLine());
            }
            s.close();
        } catch (Exception e){
            
        }
        return operaciones;
    }

    /**
     * Convierte todas las operaciones de infix a posfix
     * @param infix arraylist con operaciones en infix
     * @return posfix arraylist con operaciones en posfix
     */
    public static ArrayList<String> infixAPosfix(ArrayList<String> infix){
        ArrayList<String> posfix = new ArrayList<String>();
        for (String operacion:infix){
           posfix.add(inAPostIndividual(operacion));
        }
        return posfix;
    }

    /**
     * Calcula las respuestas de un arraylist con expresiones en posfix
     * @param operac operaciones a realizar
     * @param tipoStack tipo del stack
     * @param tipoList si el stack es list se necesita saber que tipo de list
     * @return arraylist con todas las operaciones ya calculadas, en el orden en el que estaban
     */
    public static ArrayList<String> calcular(ArrayList<String> operac,String tipoStack, String tipoList){
        ArrayList<String> respuestas = new ArrayList<String>();
        for (String a:operac) { // calcular para cada linea
        	try {
                CalculadoraGrupo10 calculadora = CalculadoraGrupo10.getInstance();
        		double resultado = calculadora.calculate(a,tipoStack,tipoList);
        		respuestas.add("El resultado de "+ a+ " es "+resultado);
        	} catch (Exception e) {
        		respuestas.add("Operacion "+ a+ " invalida");
        	}
        }
        return respuestas;
    }

    /**
     * Sirve para identificar el orden del operador
     * Tomando en cuentra la jerarquia de operandos
     * Ayuda al metodo para pasar a postfix
     * @param caracter de que se quiere saber jerarquia
     * @return int: 1 = + o -, 2 = * o / y 3 = ^
     */
    public static int importancia(char caracter) {
        if(caracter == '+' || caracter == '-') {
           return 1;             
        }else if(caracter == '*' || caracter == '/') {
           return 2;           
        }else if(caracter == '^') {
           return 3;            
        }else {
           return -1;
        }
     }
     
      /**
     * Metodo para pasar un string individual a notacion postfix desde infix
     * @param in expresion en infix
     * @return string hecho postfix
     */
     public static String inAPostIndividual(String in){

         String result = "";
         StackVector<Character> stack = new StackVector<Character>();
          
         for (int i = 0; i<in.length(); ++i){
             char c = in.charAt(i);
             if (Character.isLetterOrDigit(c)){ // si se encuentra un operando
                 result += c;
                 result += " ";
             }else if (c == '('){ // si se encuentra un parentesis asi: (
                 stack.add(c);
             }else if (c == ')'){ //  si se encuentra un parentesis asi: )
                 while (!stack.empty() &&stack.peek() != '(')
                         result += stack.remove();
                         result += " ";
                         stack.remove();
                 }
                 else{ // un operador se encuentra
                     while (!stack.empty() && importancia(c) <= importancia(stack.peek())){
                         result += stack.remove();
                         result += " ";
                  }
                     stack.add(c);
                 }
             }
             while (!stack.empty()){  // quitar todos los operandos del stack
                 if(stack.peek() == '(')
                     return "Invalid Expression";
                 result += stack.remove();
                 result += " ";
              }

              
             return result;
         }
}
