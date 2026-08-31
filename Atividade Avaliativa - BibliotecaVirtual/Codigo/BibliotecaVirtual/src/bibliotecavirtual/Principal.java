package bibliotecavirtual;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Membro> clientes = new ArrayList<>();
        int opcao;
        
        do {
            System.out.println("\nEscolha a opção "
                    + "\n1- Cadastrar Funcionario \n2-Cadatrar Cliente \n3-Cadatrar Ebook "
                    + "\n4- Cadastrar Livro fisico \n5-Listar Funcionarios \n 6-Listar Criente \n7-Listar Livros \n0-Sair"
            + "\nOPÇÃO: ");
            opcao = input.nextInt();
            input.nextLine(); // Limpa o buffer do scanner após ler a opção numérica

            switch (opcao) {
                case 1:
                    System.out.println("Nome: ");
                    String nomeFunc = input.nextLine();

                    System.out.println("CPF: ");
                    String cpfFunc = input.nextLine();

                    System.out.println("Idade: ");
                    int idadeFunc = input.nextInt();
                    input.nextLine();

                    System.out.println("Endereco: ");
                    String enderecoFunc = input.nextLine();

                    System.out.println("Telefone: ");
                    String telefoneFunc = input.nextLine();

                    System.out.println("Cargo: ");
                    String cargoFunc = input.nextLine();

                    System.out.println("Salario: ");
                    double salarioFunc = input.nextDouble();
                    

                    funcionarios.add(new Funcionario(salarioFunc, cargoFunc, 
                            nomeFunc, enderecoFunc, cpfFunc, idadeFunc, telefoneFunc));
                    break;

                case 2:
                    System.out.println("Nome: ");
                    String nomeCliente = input.nextLine();

                    System.out.println("CPF: ");
                    String cpfCliente = input.nextLine();

                    System.out.println("Idade: ");
                    int idadeCliente = input.nextInt();
                    input.nextLine();

                    System.out.println("Endereco: ");
                    String enderecoCliente = input.nextLine();

                    System.out.println("Telefone: ");
                    String telefoneCliente = input.nextLine();

                    System.out.println("Matricula: ");
                    String matriculaCliente = input.nextLine();

                    System.out.println("Data de cadastro: ");
                    String dataCadastroCliente = input.nextLine();

                    clientes.add(new Membro(matriculaCliente, dataCadastroCliente, nomeCliente, 
                            enderecoCliente, cpfCliente, idadeCliente, telefoneCliente));
                    break;

                case 3:
                    System.out.println("Titulo: ");
                    String tituloEbook = input.nextLine();

                    System.out.println("Autor: ");
                    String autorEbook = input.nextLine();

                    System.out.println("Paginas: ");
                    int paginasEbook = input.nextInt();
                    input.nextLine();

                    System.out.println("Tamanho (MB): ");
                    double tamanhoEbook = input.nextDouble();
                    input.nextLine();

                    biblioteca.adicionarLivro(new Ebook(tituloEbook,autorEbook,paginasEbook,tamanhoEbook));
                   
                    break;

                case 4:
                    System.out.println("Titulo: ");
                    String tituloFisico = input.nextLine();

                    System.out.println("Autor: ");
                    String autorFisico = input.nextLine();

                    System.out.println("Paginas: ");
                    int paginasFisico = input.nextInt();
                    input.nextLine();

                    System.out.println("Peso (g): ");
                    double pesoFisico = input.nextDouble();
                    input.nextLine();

                    biblioteca.adicionarLivro(new LivroFisico(tituloFisico,autorFisico,paginasFisico,pesoFisico));
                    break;

                case 5: 
                    for(Funcionario funcionario: funcionarios){
                       funcionario.exibirInformações();
                    }
                    break;
                case 6: 
                    for(Membro cliente: clientes){
                       cliente.exibirInformações();
                    }
                    break;
                case 7: 
                    biblioteca.listarLivro();
                    break;
                default: 
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);
        input.close();
    }
    
    
}
