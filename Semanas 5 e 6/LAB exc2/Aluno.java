public class Aluno{
 private String nome;
 private double notaA, notaB;


    public Aluno(String nome, double notaA, double notaB){
        this.nome = nome;
        this.notaA = notaA;
        this.notaB = notaB;
        
    }
    
    public double calculaMediaFinal(){
        return (notaA * 0.33) + (notaB * 0.67);
    }
    
    
   public void imprimeInfo(){
        System.out.println("Nome do aluno: "+nome);
        System.out.println("Nota do GA: "+notaA);
        System.out.println("Nota do GB: "+notaB);
        System.out.println("Média final: "+calculaMediaFinal());
    }
    
    public String getNome(){
        return nome;
}
    public void setNome(String nome){
        this.nome = nome;
    }
    
      public double getNotaA() {
        return notaA;
    }

    public void setNotaA(double notaA) {
        this.notaA = notaA;
    }

    public double getNotaB() {
        return notaB;
    }

    public void setNotaB(double notaB) {
        this.notaB = notaB;
    }
}