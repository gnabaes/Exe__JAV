import java.util.Scanner;

public class tiposdatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nombre  :  ");
        String nom = sc.nextLine();
        System.out.println(" Edad  :  ");
        int edad = sc.nextInt();
        System.out.println(" Telefono :  ");
        long Telefono = sc.nextLong();
        System.out.println(" Genero  :  ");
        char genero = sc.next().charAt(0);
        System.out.println(" Promedio  :  ");
        double prom = sc.nextDouble();
        
        //salida
        
        System.out.println(" Nombre :  "+nom);
        System.out.println(" Edad :  "+edad);
        System.out.println(" Telefono :  "+Telefono);
        System.out.println(" Genero :  "+genero);
        System.out.println(" Promedio :  "+prom);
    }
    
}
