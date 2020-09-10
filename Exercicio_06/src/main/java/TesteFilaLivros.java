import javax.swing.*;

public class TesteFilaLivros {

    public static void main(String[] args) {
        FilaLivros livros = new FilaLivros();
        PilhaLivros pilhaLivros = new PilhaLivros();

        int opcao = 0;
        String titulo;
        int quantidade;

        while (opcao != 99){
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu\n" +
                    "1 - Adicionar livro na fila\n" +
                    "2 - Remover livro da fila e adicionar em uma pilha\n" +
                    "3 - Imprimir a fila\n" +
                    "4 - Imprimir pilha\n" +
                    "99 - Sair"));

            switch (opcao){
                case 1:
                    titulo = JOptionPane.showInputDialog("Digite o título do livro: ");
                    quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de exemplares: "));
                    livros.adicionaLivrosFila(titulo,quantidade);
                    break;
                case 2:
                    titulo = livros.removeLivros();
                    pilhaLivros.adicionaLivrosPilha(titulo,quantidade);
                    break;
                case 3:
                    livros.imprimeFila();
                    break;
                case 4:
                    pilhaLivros.imprimePilha();
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