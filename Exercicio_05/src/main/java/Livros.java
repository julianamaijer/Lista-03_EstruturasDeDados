public class Livros {

    private String titulo;
    private int qtdExemplares;

    public Livros(String titulo, int qtdExemplares){
        this.titulo = titulo;
        this.qtdExemplares = qtdExemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQtdExemplares() {
        return qtdExemplares;
    }

    public void setQtdExemplares(int qtdExemplares) {
        this.qtdExemplares = qtdExemplares;
    }
}