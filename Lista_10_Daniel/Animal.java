public class Animal {
    private String nome;
    private String especie;
    private int idade;
    private String habitat;

    public Animal(String nome, String especie, int idade, String habitat) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void comer() {
        System.out.println(nome + " ta comendo pq parece que ta ha 3 dias sem ver comida");
    }

    public void dormir() {
        System.out.println(nome + " ta dormindo pq a vida ta dificil ate pra ele");
    }

    public void emitirSom() {
        System.out.println(nome + " ta fazendo barulho pq ficar quieto nao e com ele");
    }
}