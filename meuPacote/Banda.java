package meuPacote;

// HERANÇA APARECE AQUI POIS BANDA EXTENDE ARTISTA
public class Banda extends Artista {
    private Genero genero;

    public Banda(String nome, int diaDoShow, int mesDoShow, Genero genero) {
        super(nome, diaDoShow, mesDoShow); // HERANÇA
        this.genero = genero;
        genero.adicionarBanda(this); // ADICIONANDO GENERO POR COMPOSIÇÃO AQUI A BANDA SE ADICIONA NO GÊNERO LOGO BANDA POSSUI UM GENERO
    }

    public Genero getGenero() {
        return genero;
    }
}
