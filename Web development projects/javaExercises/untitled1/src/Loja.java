public class Loja {
    public String nome;
    public int quantidadeFuncionarios;
    public double salarioBaseFuncionarios;

     Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionarios){
            this.nome = nome;
            this.quantidadeFuncionarios = quantidadeFuncionarios;
            this.salarioBaseFuncionarios = salarioBaseFuncionarios;
        }

     Loja(String nome, int quantidadeFuncionarios){
         this.nome = nome;
         this.quantidadeFuncionarios = quantidadeFuncionarios;
         salarioBaseFuncionarios = -1;
     }

}
