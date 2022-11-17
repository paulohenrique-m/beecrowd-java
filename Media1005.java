import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

/*
 * Leia 2 valores de ponto flutuante de dupla precisão A e B, 
 * que correspondem a 2 notas de um aluno. A seguir, calcule a média do 
 * aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos 
 * pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com 
 * uma casa decimal.
 */
public class Media1005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat aux = new DecimalFormat("0.00000");
        // this is what happening on the line below
        // String aux = sc.nextLine();
        // double a = Double.parseDouble(aux);
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("MEDIA = " + aux.format(((a * 3.5) + (b * 7.5)) / 11));

    }
}