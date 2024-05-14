public class PrincipalAluno{
    public static void main(String[] args){
        
         Aluno aluno1 = new Aluno(
             Teclado.leString("digite o nome do aluno:"),
             Teclado.leDouble("digite a nota do grau A:"),
             Teclado.leDouble("digite a nota do grau B"));
             
             
        System.out.println("Informações do aluno:");
        aluno1.imprimeInfo();
        
    }
    
    
}