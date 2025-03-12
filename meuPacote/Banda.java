package meuPacote;
public class Banda {

    // Declarando as variaveis da banda, Nome, Dia do show, Mes do show e o Genero
    private String nome;
    private int diaDoShow;
    private int mesDoShow;
    private Genero genero;

        // Criando metodos para pegar nome, dia, mes e genero da banda
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
