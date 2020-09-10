public class PilhaLivros {

    private Livros[] livrosDadosPilha;

    public PilhaLivros(){
        livrosDadosPilha = new Livros[5];
    }

    public void adicionaLivrosPilha(String titulo, int quantidade, int tamanhoPilha){
        Livros livro = new Livros(titulo, quantidade);
        if ( tamanhoPilha < livrosDadosPilha.length){
            livrosDadosPilha[tamanhoPilha] = livro;
            tamanhoPilha++;
        }else{
            System.out.println("A pilha de livros está cheia!");
        }
    }

    public void imprimePilha(int tamanhoPilha){
        for (int i = 0; i <tamanhoPilha; i++){
            System.out.println("Livro: " + livrosDadosPilha[i].getTitulo() + ". Quantidade de exemplares: " + livrosDadosPilha[i].getQtdExemplares());
        }

        if (tamanhoPilha == 0){
            System.out.println("A pilha está vazia!");
        }
    }
}
