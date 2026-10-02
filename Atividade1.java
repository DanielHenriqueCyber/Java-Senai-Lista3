package AtividadeLista3If;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        Scanner sc = new Scanner(System.in);
        double resulOne = 0;
        double resulTwo = 0;
        double soma = 0;
        double resul = 0;
        String fin;
        System.out.println("Digite sua nota das atividade:");
        double notes = sc.nextDouble();
        System.out.println("Digite sua nota da prova: ");
        double proof = sc.nextDouble();
        System.out.println("A nota ponderada das atividades é " + notes+(notes*1.3) +
                " e a media ponderada das notas é " + proof+(proof*1.7));
        resulOne = notes*1.3;
        resulTwo = proof*1.7;
        soma=resulTwo+resulOne;
        resul=soma/3;
        if (resul>=6){
            System.out.println("Aprovado");
            fin = "aprovado";
        } else{
            System.out.println("Reprovado");
            fin="reprovado";
        }
        javax.swing.JOptionPane.showMessageDialog(frame,
                "O resultado das notas das atividades são: " + soma + " e o resultado da nota das provas são " + resul+ " o aluno esta"+ fin,
                "Exercicio 1" ,
                javax.swing.JOptionPane.QUESTION_MESSAGE);

    }
}
