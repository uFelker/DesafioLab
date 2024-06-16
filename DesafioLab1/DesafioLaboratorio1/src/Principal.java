import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        int i = 0;
        while (i != 3){
            System.out.println("Menu do Usuário. Por favor, escolha sua opção de acordo com o número:\n" +
                    " (1) Criar uma loja\n" +
                    "(2) Criar um produto\n" +
                    "(3)Sair do menu");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            scanner.nextLine();
            if (number ==1){
                System.out.println("Digite o nome da nova loja");
                String nome = scanner.nextLine();
                System.out.println("Digite a quantidade de funcionários");
                int quantidadeFuncionarios = scanner.nextInt();
                System.out.println("Digite o salário base dos funcionários");
                double salarioBaseFuncionario = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Preencha as informações de endereço da loja");
                System.out.println("Rua:");
                String nomeDaRua = scanner.nextLine();
                System.out.println("Cidade: ");
                String cidade = scanner.nextLine();
                System.out.println("Estado: ");
                String estado = scanner.nextLine();
                System.out.println("País: ");
                String pais = scanner.nextLine();
                System.out.println("CEP: ");
                String cep = scanner.nextLine();
                System.out.println("Número: ");
                String numero = scanner.nextLine();
                System.out.println("Complemento: ");
                String complemento = scanner.nextLine();
                Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
                System.out.println("Preencha as informações sobre a data de fundação da loja:");
                System.out.println("Dia: ");
                int dia = scanner.nextInt();
                System.out.println("Mês: ");
                int mes = scanner.nextInt();
                System.out.println("Ano: ");
                int ano = scanner.nextInt();
                System.out.println("Insere o número do estoque:");
                int tamanhoEstoque = scanner.nextInt();
                Data dataFundacao = new Data(dia, mes, ano);
                Loja loja = new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
                System.out.println("Loja criada!");
                System.out.println(loja.toString());
                }

            else if (number == 2){
                System.out.println("Digite as informações do novo produto:");
                System.out.println("Nome: ");
                String nome = scanner.nextLine();
                System.out.println("Preço: ");
                double preco = scanner.nextDouble();
                System.out.println("Preencha as informações referentes à data de validade: ");
                System.out.println("Dia: ");
                int dia = scanner.nextInt();
                System.out.println("Mês: ");
                int mes = scanner.nextInt();
                System.out.println("Ano");
                int ano = scanner.nextInt();
                Data dataValidade = new Data(dia, mes, ano);
                Produto produto = new Produto(nome, preco, dataValidade);
                produto.estaVencido(new Data(20,10,2023));
            }

            else if (number == 3){
                break;
            }

        }
        }
}
