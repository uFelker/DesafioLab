public class Shopping {
    String nome;
    Endereco endereco;
    Loja[] lojas;

    Shopping(String nome, Endereco endereco, int numeroMaximoLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[numeroMaximoLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public boolean insereLoja(Loja loja){
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja){
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int contar = 0;
        if (tipoLoja == null) {
            return -1;
        }

        for (int i = 0; i < lojas.length; i++) {
            if (tipoLoja != null) {
                switch (tipoLoja.toLowerCase().trim()) {
                    case "cosmetico":
                        if (lojas[i] instanceof Cosmetico) {
                            contar++;
                        }
                        break;
                    case "vestuario":
                        if (lojas[i] instanceof Vestuario) {
                            contar++;
                        }
                        break;
                    case "bijuteria":
                        if (lojas[i] instanceof Bijuteria) {
                            contar++;
                        }
                        break;
                    case "alimentacao":
                        if (lojas[i] instanceof Alimentacao) {
                            contar++;
                        }
                        break;
                    case "informatica":
                        if (lojas[i] instanceof Informatica) {
                            contar++;
                        }
                        break;
                    default:
                        return -1;
                }
            }
        }

        return contar;
    }
}


