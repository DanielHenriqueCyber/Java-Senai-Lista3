package AtividadeLista3If;

import java.util.Scanner;
import java.time.LocalDate;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, ano,idade;
        String maior="";
        System.out.println("insira seu dia de nascimento");
        dia = sc.nextInt();
        System.out.println("digite o mes do seu nascimento");
        mes = sc.nextInt();
        System.out.println("digite o ano");
        ano = sc.nextInt();
        LocalDate dataAtual = LocalDate.now();
        int diaa = dataAtual.getDayOfMonth();
        int mesa = dataAtual.getMonthValue(); // Retorna o número (1 a 12)
        int anoa = dataAtual.getYear();
        idade=anoa-ano;
        if (ano<2008) {
            System.out.println("maior de idade");
            maior = "maior";
        } else if (ano==2008) {
            if(mes==mesa){
                if(dia<diaa){
                    System.out.println("maior de idade");
                    idade++;
                    maior = "maior";
                    if(dia>diaa){
                        System.out.println("menor de idade");
                        idade--;
                        maior = "menor";
                    }

                    }
            } else if (mes>mesa) {
                idade--;
                maior = "menor";
            } else if (mes<mesa) {
                maior="maior";
            }

        }else {
            maior="menor";
        }
        System.out.println(idade);
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "voce tem"+idade+"voce é "+ maior,
                "Exercicio 1" ,
                javax.swing.JOptionPane.QUESTION_MESSAGE);




    }
}
