/***
 * Main.java
 * @since 16/02/2022
 * Clase main del programa de la HDT4
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora infix\n");
        //iniciar variables de apoyo
        boolean valida1 = false;
        String tipoStack = "";
        String tipoList = "";

        //obtener el tipo de stack, y si es list el tipo de list
        while(!valida1){
            System.out.println("Escriba el tipo de stack que quiere:\n1. Escriba AL si quiere con arraylist\n2. Escriba VE si quiere con vector\n3. Escriba LI si quiere con lista\n");
            tipoStack=scan.nextLine();
            if (tipoStack.equalsIgnoreCase("Al")){
                valida1=true;
            } else if (tipoStack.equalsIgnoreCase("VE")){
                valida1=true;
            } else if (tipoStack.equalsIgnoreCase("LI")){
                boolean valida2 = false;
                while(!valida2){
                    System.out.println("Escriba el tipo de lista que quiere:\n1. Escriba S si quiere simple\n2. Escriba D si quiere dooble\n");
                    tipoList=scan.nextLine();
                    if (tipoList.equalsIgnoreCase("S")){
                        valida2=true;
                    } else if (tipoList.equalsIgnoreCase("D")){
                        valida2=true;
                    } else{
                        System.out.println("\nIngrese una opcion valida\n");
                    }
                }
                valida1=true;
            } else{
                System.out.println("\nIngrese una opcion valida\n");
            }
        }

        //obtener las operaciones pasadas ya a postfix y operadas
        ArrayList<String> operaciones = Controlador.calcular(Controlador.infixAPosfix(Controlador.leerArchivo()),tipoStack,tipoList);
        
        //imprimir resultados
        for (String operacion:operaciones){
            System.out.println(operacion);
        }
        scan.close();
    }
}
