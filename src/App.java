import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner (System.in);
        int numero;
        System.out.println("Coloque o numero: ");
       numero = entrada.nextInt(); 
       System.out.println("O numero informado foi: "+numero);
    }
}
