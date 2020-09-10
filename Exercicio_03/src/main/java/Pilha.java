public class Pilha {

    private int pilha [];
    private int tamanhoPilha;
    private int indicePilha;

    public Pilha(){
        pilha = new int[5];
        tamanhoPilha = 0;
        indicePilha = 0;
    }

    public void adicionaElemento(int numero){

        indicePilha = tamanhoPilha;

        if (tamanhoPilha < pilha.length) {
            pilha[indicePilha] = numero;
            tamanhoPilha++;
        }else{
            System.out.println("A pilha está cheia!");
        }
    }

    public int removeElemento(){
        int numero = 0;
        indicePilha = (tamanhoPilha - 1);
        numero = pilha[indicePilha];
        pilha[indicePilha] = 0;
        tamanhoPilha--;
        return numero;
    }

    public void imprimePilha(){

        for ( indicePilha = 0; indicePilha < 5; indicePilha++){
            System.out.println(pilha[indicePilha]);
        }
    }
}
