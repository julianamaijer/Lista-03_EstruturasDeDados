import javax.swing.*;

public class TesteFilaLivros {

    public static void main(String[] args) {
        FilaLivros livros = new FilaLivros();

        int opcao = 0;
        String titulo;
        int quantidade;

        while (opcao != 99){
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu\n" +
                    "1 - Adicionar livro\n" +
                    "2 - Remover livro\n" +
                    "3 - Imprimir a fila\n" +
                    "99 - Sair"));

            switch (opcao){
                case 1:
                    titulo = JOptionPane.showInputDialog("Digite o título do livro: ");
                    quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de exemplares: "));
                    livros.adicionaLivros(titulo,quantidade);
                    break;
                case 2:
                    livros.removeLivros();
                    break;
                case 3:
                    livros.imprimeFila();
                    break;
                case 99:
                    JOptionPane.showMessageDialog(null,"Você saiu do menu!");
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }

    }
}