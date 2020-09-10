public class Lista {

    private int lista [];
    private int tamanhoLista;
    private int indiceLista;

    public Lista(){

        lista = new int[5];
        tamanhoLista = 0;
        indiceLista = 0;

    }

    public void adicionaElemento(int numero, int posicaoLista){
        indiceLista = (posicaoLista - 1);
        if (posicaoLista <= 5 && posicaoLista > 0){
            lista[indiceLista] = numero;
            tamanhoLista++;
        }else {
            System.out.println("A posição não existe na lista!");
        }
    }

    public int removeElemento(int posicaoLista){
        int numero=0;
        indiceLista = (posicaoLista - 1);
        if (posicaoLista <= 5 && posicaoLista > 0){
            numero = lista[indiceLista];
            lista[indiceLista] = 0;
            tamanhoLista--;
        }
        return numero;
    }

    public void imprimeLista(){
        for (indiceLista = 0; indiceLista < 5; indiceLista++){
            System.out.println(lista[indiceLista]);
        }
    }

}
