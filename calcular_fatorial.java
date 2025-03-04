import java.util.Scanner;

public class calcular_fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String questao;

        do {
            System.out.println("DIGITE UM NÚMERO INTEIRO PARA CALCULARMOS O FATORIAL:");
            int n = sc.nextInt();

            int fatorial = 1;
            for (int i = 1; i <= n; i++) {
                fatorial = fatorial * i;
            }
            System.out.printf("O FATORIAL DE %d É: %d\n", n, fatorial);

            System.out.println("DESEJA CONTINUAR? [s] / [n]");
            sc.nextLine();
            questao = sc.nextLine();
        } while (questao.equals("s"));
        sc.close();
    }
}