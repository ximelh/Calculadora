/******************************************************************
Ultima modificacion: 27/01/2022

Clase main grupo 10
@file MainGrupo10.java

******************************************************************/
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MainGrupo10 {
    public static void main(String[] args){
    	
    	ArrayList<String> operaciones = new ArrayList<String>();
        CalculadoraGrupo10 calculadora = new CalculadoraGrupo10();
        try{ //leer el archivo
            File file = new File("datos.txt");
            Scanner s = new Scanner(file);
            while (s.hasNextLine()){
                operaciones.add(s.nextLine());
            }
            s.close();
        } catch (Exception e){
            System.out.println("Error: archivo no encontrado");
        }
        
        for (String a:operaciones) { // calcular para cada linea
        	try {
        		double resultado = calculadora.calculate(a);
        		System.out.println("El resultado de "+ a+ " es "+resultado);
        	} catch (Exception e) {
        		System.out.println("Operacion "+ a+ " invalida");
        	}
        }
        
    }
}
