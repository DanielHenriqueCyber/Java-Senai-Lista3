package AtividadeLista3If;
import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        int pont1,pont2,total1,total2;
        Scanner sc = new Scanner(System.in);
        System.out.println("insira os pontos do jogador 1");
        pont1 = sc.nextInt();
        System.out.println("insira o ponto do jogador 2");
        pont2 = sc.nextInt();
        total1=pont1*10;
        total2=pont2*5;
        System.out.println("o jogador um ganhou um total de "+pont1+"ganhando im total de "+ total1);
        System.out.println("o jogador dois ganhou um total de "+pont2+"ganhando im total de "+ total2);
        System.out.println("o jogador um total "+ total1);
        System.out.println("o jogador dois total "+ total1);
        if (total1>total2){
            System.out.println("o jogador um ganhou mais pontos"+total1);
        }
        else {
            System.out.println("o jogador 2 ganhou mais pontos"+total2);
        }
    }
}
