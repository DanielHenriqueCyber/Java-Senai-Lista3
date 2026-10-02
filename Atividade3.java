package AtividadeLista3If;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dist, cons, total;
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);

        System.out.println("insira a distancia da viagem");
        dist = sc.nextInt();
        System.out.println("digite o consumo de combustivel do seu carro");
        cons = sc.nextInt();
        total = dist / cons;

        javax.swing.JOptionPane.showMessageDialog(frame,
                "voce esta para fazer uma viagem de: " + dist + " o consumo do carro é: " + cons+" voce ira precisar de "+ total+" litros",
                "Exercicio 1",
                javax.swing.JOptionPane.QUESTION_MESSAGE);

    }
}
