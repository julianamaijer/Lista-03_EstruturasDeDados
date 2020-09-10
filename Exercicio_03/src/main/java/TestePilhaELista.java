import javax.swing.*;

public class TestePilhaELista {

    public static void main(String[] args) {
        Lista lista = new Lista();
        Pilha pilha = new Pilha();
        int opcao=0;
        int posicaoLista;
        int numero;

        while (opcao != 99){
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Cadastro de Pilha e Lista: \n"+
                    "1 - Adiciona um elemento na lista\n" +
                    "2 - Adiciona um elemento na pilha\n" +
                    "3 - Remove um elemento da lista e coloca no final da pilha\n" +
                    "4 - Remove um elemento do final da pilha e coloca em uma posição desejada da lista\n" +
                    "5 - Imprime a lista\n" +
                    "6 - Imprime a pilha\n" +
                    "99 - Sair"));
            switch (opcao){
                case 1:
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento que deseja inserir na lista"));
                    posicaoLista = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição em que deseja inserir: "));
                    lista.adicionaElemento(numero,posicaoLista);
                    break;
                case 2:
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento que deseja inserir na pilha"));
                    pilha.adicionaElemento(numero);
                    break;
                case 3:
                    posicaoLista = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da lista que deseja remover"));
                    numero = lista.removeElemento(posicaoLista);
                    pilha.adicionaElemento(numero);
                    break;
                case 4:
                    posicaoLista = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da lista que você deseja adicionar"));
                    numero = pilha.removeElemento();
                    lista.adicionaElemento(numero,posicaoLista);
                    break;
                case 5:
                    System.out.println("Lista:");
                    lista.imprimeLista();
                    break;
                case 6:
                    System.out.println("Pilha:");
                    pilha.imprimePilha();
                    break;
                case 99:
                    JOptionPane.showMessageDialog(null, "Você saiu do cadastro!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}
