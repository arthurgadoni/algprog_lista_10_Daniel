public class Professor {
    private String nome;
    private String disciplina;
    private int idade;
    private double salario;

    public Professor(String nome, String disciplina, int idade, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void ensinar() {
        System.out.println(nome + " ta ensinando " + disciplina + " e tentando fazer a galera entender");
    }

    public void corrigirProva() {
        System.out.println(nome + " ta corrigindo prova");
    }

    public void prepararAula() {
        System.out.println(nome + " ta preparando aula");
    }
}