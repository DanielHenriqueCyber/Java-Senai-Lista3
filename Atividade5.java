package JavaLista3;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        double salario, imposto;
        System.out.println("informe seu salario bruto");
        salario = sc.nextDouble();
        imposto = salario * 0.10;

        javax.swing.JOptionPane.showMessageDialog(frame,
                "O seu salario bruto é: " + salario + " seu salario vem com um imposto de: " + imposto + " seu salario liquido vai ser de: " + (salario - imposto),
                "Exercicio 1",
                javax.swing.JOptionPane.QUESTION_MESSAGE);


    }
}
