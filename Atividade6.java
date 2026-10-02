package AtividadeLista3If;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um preço: ");
        double price = sc.nextDouble();
        double desc = (price > 50) ? price * 0.10 : price * 0.05;
        System.out.println("O preço do desconto é : " + desc + " E o valor total é: " + (price-desc));

    }
}
