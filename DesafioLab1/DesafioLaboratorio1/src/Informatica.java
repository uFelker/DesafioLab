public class Informatica extends Loja{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private double seguroEletronicos;

    Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
                Data dataFundacao, double seguroEletronicos, int tamanhoEstoque){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.seguroEletronicos = seguroEletronicos;
    }

    public String getNome () {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataDeFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }



    @Override
    public String toString(){
        return "Nome: return \"Nome da Loja: \" + this.nome + \"Tamanho da Loja: \" + this.tamanhoDaLoja() + \"Gastos com Salário:\"\n" +
                " + this.gastosComSalario() + \"Endereço: \" + this.endereco + \"Data de Fundação: \" + this.dataFundacao"
                + "Seguro Eletrônicos: " + this.seguroEletronicos;
    }

}
