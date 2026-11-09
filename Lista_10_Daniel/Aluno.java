public class Aluno {
    private String nome;
    private int matricula;
    private String curso;
    private double nota;

    public Aluno(String nome, int matricula, String curso, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void estudar() {
        System.out.println(nome + " ta estudando pq a prova nao vai passar sozinha");
    }

    public void fazerProva() {
        System.out.println(nome + " ta fazendo a prova e rezando pra dar bom");
    }

    public void verificarAprovacao() {
        if (nota >= 7) {
            System.out.println(nome + " passou! Ate que enfim esse sofrimento serviu pra algo");
        } else {
            System.out.println(nome + " rodou demais");
        }
    }
}