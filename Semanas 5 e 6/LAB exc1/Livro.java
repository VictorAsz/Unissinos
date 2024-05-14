public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double preco;
    private int paginas;
    
    public Livro(String titulo, String autor, int anoPublicacao, int paginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
        this.paginas = paginas;
    }
    
    public void imprimeInfo(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + anoPublicacao);
        System.out.println("Quantidade de páginas: " + paginas);
        System.out.println("Preço: R$" + preco);
    }
    public double calcularPrecoPorPagina(){
        double soma = preco/paginas;
        return soma;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public int getPaginas() {
        return paginas;
    }
    
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}