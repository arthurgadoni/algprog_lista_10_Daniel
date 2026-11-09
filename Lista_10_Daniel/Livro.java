public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
    private String editora;

    public Livro(String titulo, String autor, int paginas, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void abrir() {
        System.out.println("Abriu " + titulo + " agr so fingir que vai ler tudo");
    }

    public void ler() {
        System.out.println("Lendo " + titulo + " pra ver se fica menos burro");
    }

    public void fechar() {
        System.out.println("Fechou " + titulo + "");
    }
}