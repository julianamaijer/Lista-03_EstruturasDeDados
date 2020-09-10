public class PilhaLivros {

    private Livros [] livrosDados;
    private int tamanho;

    public PilhaLivros(){
        livrosDados = new Livros[5];
        tamanho = 0;
    }

    public void adicionaLivros(String titulo, int quantidade){
        Livros livro = new Livros(titulo, quantidade);
        if ( tamanho < livrosDados.length){
            livrosDados[tamanho] = livro;
            tamanho++;
        }else{
            System.out.println("A pilha de livros está cheia!");
        }
    }

    public void removeLivros(){
        if (livrosDados.length >= 1 && tamanho > 0){
            System.out.println("O livro " + livrosDados[tamanho-1].getTitulo() + " foi removido da pilha.");
            livrosDados[tamanho-1] = null;
            tamanho--;
        }else {
            System.out.println("A pilha está vazia!");
        }
    }

    public void imprimePilha(){
        for (int i = 0; i <tamanho; i++){
            System.out.println("Livro: " + livrosDados[i].getTitulo() + ". Quantidade de exemplares: " + livrosDados[i].getQtdExemplares());
        }

        if (tamanho == 0){
            System.out.println("A pilha está vazia!");
        }
    }
}
