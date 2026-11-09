public class Main {
    public static void main(String[] args) {

        System.out.println("===== TESTANDO PESSOAS =====");
        Pessoa pessoa = new Pessoa("Arthur", 20, "12345678900", "arthur@email.com");
        pessoa.andar();
        pessoa.falar();

        System.out.println("\n===== TESTANDO CARROS =====");
        Carro carro = new Carro("Toyota", "Corolla", 2024, "Preto");
        carro.acelerar();
        carro.buzinar();

        System.out.println("\n===== TESTANDO ANIMAIS =====");
        Animal animal = new Animal("Scooby", "Cachorro", 3, "Casa");
        animal.comer();
        animal.emitirSom();

        System.out.println("\n===== TESTANDO PRODUTOS =====");
        Produto produto = new Produto("Notebook", 3500, 10, "Eletronicos");
        produto.vender(2);
        System.out.println("Ainda temos " + produto.getQuantidade() + " unidades no estoque");

        System.out.println("\n===== TESTANDO LIVROS =====");
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 256, "Principis");
        livro.abrir();
        livro.ler();

        System.out.println("\n===== TESTANDO ALUNOS =====");
        Aluno aluno = new Aluno("Arthur", 12345, "Engenharia de Software", 8.5);
        aluno.estudar();
        aluno.verificarAprovacao();

        System.out.println("\n===== TESTANDO PROFESSORES =====");
        Professor professor = new Professor("Daniel", "Programacao", 40, 5000);
        professor.ensinar();
        professor.corrigirProva();

        System.out.println("\n===== TESTANDO CONTA BANCARIA =====");
        ContaBancaria conta = new ContaBancaria("Arthur", 123, 1000, "Banco do Brasil");
        conta.depositar(500);
        conta.sacar(200);
        conta.consultarSaldo();

        System.out.println("\n===== TESTANDO COMPUTADORES =====");
        Computador computador = new Computador("Dell", "Intel i7", 16, "Windows 11");
        computador.ligar();
        computador.executarPrograma();

        System.out.println("\n===== TESTANDO JOGOS =====");
        Jogo jogo = new Jogo("Minecraft", "Sandbox", "PC", 99.90);
        jogo.iniciar();
        jogo.pausar();
        jogo.encerrar();

        System.out.println("\n===== TODOS OS TESTES FINALIZADOS =====");
        System.out.println("Pelo menos o codigo funcionou!");
    }
}