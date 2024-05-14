public class Computador{
    private String marca;
    private float velocidade;
    private int anoFabricacao;
    private boolean novo;

    public Computador(String marca, float velocidade, int anoFabricacao, boolean novo){
        this.marca = marca;
        this.velocidade = velocidade;
        this.anoFabricacao = anoFabricacao;
        this.novo = novo;

    }

    public String getMarca(){
        return marca;
    }

    public Void setMarca(String marca){
        this.marca = marca;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

  
    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }


}