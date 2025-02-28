import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String questao;

        do{
            System.out.println("DIGITE UMA TEMPERATURA:");
            double x = sc.nextDouble();

            double f = (9 * x) / 5 + 32;
            System.out.printf("A TEMPERATUDA EM FARENHEIT É %.2f\n", f);

            System.out.println("DESEJA CONTINUAR? [s] / [n]");
            sc.nextLine();
            questao = sc.nextLine();
        } while (questao.equals("s"));
        sc.close();
	}
    }