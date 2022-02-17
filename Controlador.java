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
    public ArrayList<String> leerArchivo(){
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
    public ArrayList<String> infixAPosfix(ArrayList<String> infix){
        ArrayList<String> posfix = new ArrayList<String>();
        for (String operacion:infix){

        }

        return posfix;
    }

    /**
     * Calcula las respuestas de un arraylist con expresiones en posfix
     * @param 
     */
    public ArrayList<String> calcular(ArrayList<String> operac,String tipoStack, String tipoList){
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
    
}
