public class PilhaLivros {

    private Livros [] livrosDadosPilha;
    private int tamanhoPilha;

    public PilhaLivros(){
        livrosDadosPilha = new Livros[5];
        tamanhoPilha = 0;
    }

    public void adicionaLivrosPilha(String titulo, int quantidade){
        Livros livro = new Livros(titulo, quantidade);
        if ( tamanhoPilha < livrosDadosPilha.length){
            livrosDadosPilha[tamanhoPilha] = livro;
            tamanhoPilha++;
        }else{
            System.out.println("A pilha de livros está cheia!");
        }
    }

    public void imprimePilha(){
        for (int i = 0; i <tamanhoPilha; i++){
            System.out.println("Livro: " + livrosDadosPilha[i].getTitulo() + ". Quantidade de exemplares: " + livrosDadosPilha[i].getQtdExemplares());
        }

        if (tamanhoPilha == 0){
            System.out.println("A pilha está vazia!");
        }
    }
}
