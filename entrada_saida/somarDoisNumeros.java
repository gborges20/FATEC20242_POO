
import java.util.Scanner;

public class somarDoisNumeros{
    public static void main(String[] args) {
        //declaracao de variaveis
        Scanner leitor = new Scanner(System.in);
        //int a, b, soma;
        int a;
        int b;
        int resultadoDaSoma;
        //entrada de dados
        System.out.println("Digite um valor");
        a = leitor.nextInt();
        System.out.println("Digite outro valor");
        b = leitor.nextInt();
        //processamento
        resultadoDaSoma = a + b;

        //saida
        //System.out.println(a + "+" + b + "=" + resultadoDaSoma);
        System.out.printf("%d + %d = %d\n", a,b,resultadoDaSoma);

        //java SomarDoisNumeros.java  = compila e executa
    
    }
}