package meuPacote;

public class Banda extends Artista {
    private Genero genero;

    public Banda(String nome, int diaDoShow, int mesDoShow, Genero genero) {
        super(nome, diaDoShow, mesDoShow);
        this.genero = genero;
    }

    public Genero getGenero() {
        return genero;
    }
}
