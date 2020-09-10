public class Fila {

    private int fila [];
    private int tamanho;
    private int indice;

    public Fila(){
        fila = new int[5];
        tamanho = 0;
        indice = 0;
    }

    public void adicionaNumero (int numero){

        indice = tamanho;

        if (tamanho < fila.length) {
            fila[indice] = numero;
            tamanho++;
        }else{
            System.out.println("A fila está cheia!");
        }

    }

    public void removeNumero (){

        if (tamanho != 0) {
            for (indice = 0; indice < 5; indice++) {

                if (indice < 4) {
                    fila[indice] = fila[indice + 1];
                } else {
                    if (fila[indice] == 4) {
                        fila[4] = 0;
                    }
                }
            }
            tamanho--;
        }else{
            System.out.println("A fila está vazia!");
        }
    }

    public void resumeFila (){
        int indiceInicio=0;
        int elementoInicio=0;
        int indiceFinal=0;
        int elementoFinal=0;

        if (tamanho == 0){
            System.out.println("A fila está vazia!");
        }else{
            indiceInicio = 0;
            elementoInicio = fila[0];
            for ( indice = 0; indice < tamanho; indice++){
                indiceFinal = indice;
                elementoFinal = fila[indice];
            }
        }

        System.out.println("O índice do início da fila é: " + indiceInicio);
        System.out.println("O elemento do início da fila é: " + elementoInicio);
        System.out.println("O índice do final da fila é: " + indiceFinal);
        System.out.println("O elemento do final da fila é: " + elementoFinal);

    }

    public void imprimeFila (){

        for ( indice = 0; indice < 5; indice++){
            System.out.println(fila[indice]);
        }

    }

}
