import javax.swing.*;

public class TestePilhaLivros {

    public static void main(String[] args) {
        PilhaLivros livros = new PilhaLivros();

        int opcao = 0;
        String titulo;
        int quantidade;

        while (opcao != 99){
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu\n" +
                    "1 - Adicionar livro\n" +
                    "2 - Remover livro\n" +
                    "3 - Imprimir a pilha\n" +
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
                    livros.imprimePilha();
                    break;
                case 99:
                    JOptionPane.showMessageDialog(null,"Você saiu do menu!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }

    }
}
