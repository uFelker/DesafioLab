public class Produto {
    private String nome;
    private double preco;

    Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double Preco){
        this.preco = preco;
    }


    @Override
    public String toString(){
        return "Nome: " + this.nome + "Preço: " + this.preco;
    }
}
