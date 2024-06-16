public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int tamanhoEstoque){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[tamanhoEstoque];

    }

    Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int tamanhoEstoque){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[tamanhoEstoque];
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

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
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
    public void imprimeProdutos(){
        for (Produto produto: estoqueProdutos
             ) {
            if (produto != null)
            System.out.println(produto);
        }
    }

    public boolean insereProduto(Produto produto){
        for (int i = 0; i < estoqueProdutos.length; i++) {
                if (estoqueProdutos[i] == null) {
                    estoqueProdutos[i] = produto;
                    return true;
                }
            }
            return false;
        }

    public boolean removeProduto(String nomeProduto){
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }


    @Override
    public  String toString(){
        return "Nome da Loja: " + this.nome + "Tamanho da Loja: " + this.tamanhoDaLoja() + "Gastos com Salário:"
                + this.gastosComSalario() + "Endereço: " + this.endereco + "Data de Fundação: " + this.dataFundacao + "Quantidade de Estoque: "+ this.estoqueProdutos;
    }
}



