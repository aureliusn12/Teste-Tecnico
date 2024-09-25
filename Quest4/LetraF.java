package Quest4;

public class LetraF {
    public static void main(String[] args) {
        int n1 = 2, n2 = 10, n3 = 12, n4 = 16;

        System.out.print(n1 + ", " + n2 + ", " + n3 + ", " + n4);
        
        for (int i = 0; i < 4 ; i++) {
            n4 += 1;
            System.out.print(", " + n4);
        }
    }
}
