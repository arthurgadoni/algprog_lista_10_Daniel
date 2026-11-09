public class Jogo {
    private String nome;
    private String genero;
    private String plataforma;
    private double preco;

    public Jogo(String nome, String genero, String plataforma, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.plataforma = plataforma;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void iniciar() {
        System.out.println("Iniciando " + nome + "");
    }

    public void pausar() {
        System.out.println("Jogo pausado");
    }

    public void encerrar() {
        System.out.println("Jogo encerrado, GG");
    }
}