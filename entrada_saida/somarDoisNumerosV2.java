import javax.swing.JOptionPane;
public class somarDoisNumerosV2{
    public static void main(String[] args){
        //declaracao de variaveis
        double a, b , resultado;
        //entrada de dados
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        //Double.parseDouble(); - converte uma string em double
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor"));
        //processamento
        resultado = a + b;

        //saida de  dados
        JOptionPane.showMessageDialog(null, String.format("%.2f + %.2f = %.2f", a, b, resultado));
    }
}