package meuPacote;  

import java.util.List;
import java.util.ArrayList;  

class Genero {
    private String nome;
    private List<Banda> bandas;

    // Pegando o nome do Gênero e criando uma Lista para salvar as bandas
    public Genero(String nome) {
        this.nome = nome;
        this.bandas = new ArrayList<>(); 
    }

    // Adiciona a banda na lista
    public void adicionarBanda(Banda banda) {
        bandas.add(banda); 
    }

    // Um metodo que Pega o nome do gênero
    public String getNome() {
        return nome;  
    }

    // Um metodo que pega a lista das bandas
    public List<Banda> getBandas() {
        return bandas;  
    }
}
