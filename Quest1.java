import java.util.Scanner;

public class Quest1 {
        public static boolean checarNumero(int numero){
            int a = 0;
            int b = 1;
            if (numero == a || numero == b) {
                return true;
        }
            int proximoNumero = a + b;
            while (proximoNumero <= numero) {
                if (proximoNumero == numero) {
                    return true; 
                }
            a = b;
            b = proximoNumero;
            proximoNumero = a + b;
        }
        return false;
    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe um número: ");
            int numero = scanner.nextInt();

            if (checarNumero(numero)) {
                System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
            }
            
            scanner.close();
    }
}