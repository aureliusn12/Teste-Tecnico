
public class Quest5 {
    public static void main(String[] args) {
        boolean[] interruptores = new boolean[3]; 
        boolean[] lampadas = new boolean[3];  
    
        boolean lampadaAquecida = false;

        interruptores[0] = true;
        System.out.println("Interruptor A ligado por alguns minutos...");

        lampadaAquecida = true;

        interruptores[0] = false; 
        interruptores[1] = true;  
        System.out.println("Interruptor A desligado, Interruptor B ligado.");
    

        lampadas[0] = false;  
        lampadas[1] = true;  
         lampadas[2] = false; 
         System.out.println("\nAo ir para a sala das lâmpadas:");
    
         if (lampadas[1]) {
            System.out.println("Lâmpada ligada -> Interruptor B.");
        }
    
        if (!lampadas[0] && lampadaAquecida) {
            System.out.println("Lâmpada apagada, mas quente -> Interruptor A.");
        }
    
        if (!lampadas[2]) {
            System.out.println("Lâmpada apagada e fria -> Interruptor C.");
        }
    }
}