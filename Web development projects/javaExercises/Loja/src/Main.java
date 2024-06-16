//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     public class Loja {
         private String nome;
         private int quantidadeFuncionarios;
         private double salarioBaseFuncionario;

         public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario){
             this.nome = nome;
             this.quantidadeFuncionarios = quantidadeFuncionarios;
             this.salarioBaseFuncionario = salarioBaseFuncionario;
         }

         public Loja(String nome, int quantidadeFuncionarios){
             this.nome = nome;
             this.quantidadeFuncionarios = quantidadeFuncionarios;
         }

         public String getNome(){return nome;}
         public int getQuantidadeFuncionarios (){return quantidadeFuncionarios;}
         public double getSalarioBaseFuncionario(){return salarioBaseFuncionario;}
     }
}