import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);        
        
        System.out.print("Digite a primeira nota: ");
        int nota01 = sc.nextInt();

        System.out.print("Digite a segunda nota: ");
        int nota02 = sc.nextInt();

        System.out.print("Digite a terceira nota: ");
        int nota03 = sc.nextInt();

        System.out.print("Digite a quarta nota: ");
        int nota04 = sc.nextInt();
        
        sc.close();

        double media = (nota01+nota02+nota03+nota04)/4;

        System.out.println("A média das notas é: "+media);
    }
}