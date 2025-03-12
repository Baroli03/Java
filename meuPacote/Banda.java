package meuPacote;
public class Banda {
    private String nome;
    private int diaDoShow;
    private int mesDoShow;
    private Genero genero;

    public Banda(String nome, int diaDoShow, int mesDoShow, Genero genero) {
        this.nome = nome;
        this.diaDoShow = diaDoShow;
        this.mesDoShow = mesDoShow;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public int getDiaDoShow() {
        return diaDoShow;
    }

    public int getMesDoShow() {
        return mesDoShow;
    }

    public Genero getGenero() {
        return genero;
    }
}
