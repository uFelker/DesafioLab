public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco enderecoLoja;
    private Data dataDeFundacao;

    Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionarios){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionarios;
    }

    Loja(String nome, int quantidadeFuncionarios){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
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

    public Endereco getEnderecoLoja() {
        return enderecoLoja;
    }

    public void setEnderecoLoja(Endereco enderecoLoja) {
        this.enderecoLoja = enderecoLoja;
    }

    public Data getDataDeFundacao() {
        return dataDeFundacao;
    }

    public void setDataDeFundacao(Data dataDeFundacao) {
        this.dataDeFundacao = dataDeFundacao;
    }

    public char tamanhoDaLoja(){
        if (quantidadeFuncionarios > 0 && quantidadeFuncionarios < 10 ){
            return 'P';
        }
        else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30){
            return 'M';
        }
        else {
            return 'G';
        }
    }

    public double gastosComSalario(){
        if (salarioBaseFuncionario == -1){
            return -1;
        }
        else{
            double gastosComSalario = salarioBaseFuncionario * quantidadeFuncionarios;
            return gastosComSalario;
        }

    }
    @Override
    public String toString(){
        return "Nome da Loja: " + this.nome + "Tamanho da Loja: " + this.tamanhoDaLoja() + "Gastos com Salário:"
                + this.gastosComSalario();
    }
}



