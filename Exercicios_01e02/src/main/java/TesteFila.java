import javax.swing.*;

public class TesteFila {
    public static void main(String[] args) {
        Fila fila = new Fila();
        int opcao=0;
        int numero;
        while (opcao != 99){
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Cadastro fila: \n" +
                    "1 - Adicionar um elemento no início da fila\n" +
                    "2 - Remover um número na fila\n" +
                    "3 - Imprimir a fila\n" +
                    "4 - Resumo da fila \n" +
                    "99 - Sair"));

            switch (opcao){
                case 1:
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número na fila"));
                    fila.adicionaNumero(numero);
                    break;
                case 2:
                    System.out.println("Primeiro número da fila removido!");
                    fila.removeNumero();
                    break;
                case 3:
                    fila.imprimeFila();
                    break;
                case 4:
                    System.out.println("Resumo dos resultados da fila: ");
                    fila.resumeFila();
                    break;
                case 99:
                    JOptionPane.showMessageDialog(null,"Você saiu do cadastro!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }

}
