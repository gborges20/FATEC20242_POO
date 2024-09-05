
import javax.swing.JOptionPane;

public class TesteLivroDeNotas {
    static public void main(String args []){
        //construir livro de notas
        var meuLivro = new LivroDeNotas();
        var disciplina1 = JOptionPane.showInputDialog("Digite o nome da disciplina");
        //anotar o comportamento sobre ele
        meuLivro.nomeDisciplina = disciplina1;
        meuLivro.exibirMensagem(disciplina1);

        var disciplina2 = JOptionPane.showInputDialog("Digite o nome da disciplina 2");
        var meuLivro1 = new LivroDeNotas();

        meuLivro1.nomeDisciplina = disciplina2;
        meuLivro1.exibirMensagem(disciplina2);
    }
}
