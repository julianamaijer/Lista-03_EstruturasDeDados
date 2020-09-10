public class FilaLivros {

    private Livros [] livrosDados;
    private int tamanho;

    public FilaLivros(){
        livrosDados = new Livros[5];
        tamanho = 0;
    }

    public void adicionaLivrosFila(String titulo, int quantidade){
        Livros livro = new Livros(titulo, quantidade);
        if ( tamanho < livrosDados.length){
            livrosDados[tamanho] = livro;
            tamanho++;
        }else{
            System.out.println("A fila de livros está cheia!");
        }
    }

    public void removeLivros(int tamanhoPilha){
        PilhaLivros pilhaLivros = new PilhaLivros();
        if (livrosDados.length >= 1 && tamanho > 0){
            System.out.println("O livro " + livrosDados[0].getTitulo() + " foi removido da fila e adicionado na pilha.");
            pilhaLivros.adicionaLivrosPilha(livrosDados[0].getTitulo(), livrosDados[0].getQtdExemplares(),tamanhoPilha);
            for ( int i = 0; i < 5; i++){
                if (i < 4){
                    livrosDados[i] = livrosDados[i+1];
                }else {
                    livrosDados[i] = null;
                }
            }
            tamanho--;
        }else {
            System.out.println("A fila está vazia!");
        }
    }

    public void imprimeFila(){
        for (int i = 0; i <tamanho; i++){
            System.out.println("Livro: " + livrosDados[i].getTitulo() + ". Quantidade de exemplares: " + livrosDados[i].getQtdExemplares());
        }

        if (tamanho == 0){
            System.out.println("A fila está vazia!");
        }
    }

}