public class Computador {
    private String marca;
    private String processador;
    private int memoria_ram;
    private String sistema_operacional;

    public Computador(String marca, String processador, int memoria_ram, String sistema_operacional) {
        this.marca = marca;
        this.processador = processador;
        this.memoria_ram = memoria_ram;
        this.sistema_operacional = sistema_operacional;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaRam() {
        return memoria_ram;
    }

    public void setMemoriaRam(int memoria_ram) {
        this.memoria_ram = memoria_ram;
    }

    public String getSistemaOperacional() {
        return sistema_operacional;
    }

    public void setSistemaOperacional(String sistema_operacional) {
        this.sistema_operacional = sistema_operacional;
    }

    public void ligar() {
        System.out.println("PC ligado!");
    }

    public void desligar() {
        System.out.println("Computador foi de F");
    }

    public void executarPrograma() {
        System.out.println("Rodando o programa...");
    }
}