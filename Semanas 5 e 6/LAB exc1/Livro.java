public class Livro {
    private String titulo;
    private String autor;
    private String anoPublicacao;
    private float preco;
    private int paginas;
    
    public Livro(String titulo, String autor, String anoPublicacao, float preco, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
        this.paginas = paginas;
    }
    
    public void ImprimeInfo(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + anoPublicacao);
        System.out.println("Quantidade de páginas: " + paginas);
        System.out.println("Preço: R$" + preco);
    }
    public float calcularPrecoPorPagina(){
        float soma = preco/paginas;
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
    
    public String getAnoPublicacao() {
        return anoPublicacao;
    }
    
    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
    public float getPreco() {
        return preco;
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public int getPaginas() {
        return paginas;
    }
    
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}