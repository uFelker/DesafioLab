public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco(){

        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public Data getDataValidade(){
        return dataValidade;
    }

    public void setDataValidade(Data data){
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(Data data){
        if (data.getAno() > dataValidade.getAno()){
            System.out.println("Produto vencido");
            return false;
        }
        else if (data.getAno() == dataValidade.getAno() && data.getMes() > dataValidade.getMes()){
            System.out.println("Produto vencido");
            return false;
        }
        else if (data.getAno() == dataValidade.getAno() && data.getMes() == dataValidade.getMes()
                && data.getDia() > dataValidade.getDia()){
            System.out.println("Produto vencido");
            return false;
        }
        else {
            System.out.println("Produto não vencido");
            return true;
        }
    }



    @Override
    public String toString(){
        return "Nome: " + this.nome + "Preço: " + this.preco + "Data de validade: " + this.dataValidade;
    }
}
