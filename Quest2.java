import java.util.Scanner;

public class Quest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a frase ou palvara que voce deseja saber se existe ou quantas letras 'a' existem nela: ");
        String palavra = scanner.nextLine();

        char letra = 'a';
        int contador = 0;
        palavra = palavra.toLowerCase();
        
        if(palavra.contains("a")){
            System.out.println("Tem a letra'a'. ");

        } else{
            System.out.println("Nào tem a letra 'a'. ");
        }

        for(int i = 0; i < palavra.length(); i++){
            if(palavra.charAt(i) == letra){
                contador++;
            }
        }
        System.out.println("Existem " + contador + " letra(s) 'a'. ");
        scanner.close();
    }
}
