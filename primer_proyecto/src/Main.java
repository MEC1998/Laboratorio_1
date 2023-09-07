import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int numero;
        String calle;

        Scanner lector=new Scanner(System.in);

        System.out.println("Ingrese calle: ");
        calle=lector.nextLine();

        System.out.println("Ingrese un número: ");
        numero= lector.nextInt();

        System.out.println("La calle es  "+calle);
        System.out.println("El número es "+numero);
        }
    }