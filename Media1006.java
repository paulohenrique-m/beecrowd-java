import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

/*
    Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um 
    aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, 
    a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir 
    de 0 até 10.0, sempre com uma casa decimal.
*/
public class Media1006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat aux = new DecimalFormat("0.0");
        // this is what happening on the line below
        // String aux = sc.nextLine();
        // double a = Double.parseDouble(aux);
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double c = Double.parseDouble(sc.nextLine());
        System.out.println("MEDIA = " + aux.format(((a * 2) + (b * 3) + (c * 5)) / 10));

    }
}