package meuPacote;  

import java.util.List;
import java.util.ArrayList;  

class Genero {
    private String nome;
    private List<Banda> bandas;

    public Genero(String nome) {
        this.nome = nome;
        this.bandas = new ArrayList<>(); 
    }

    public void adicionarBanda(Banda banda) {
        bandas.add(banda); 
    }

    public String getNome() {
        return nome;  
    }

    public List<Banda> getBandas() {
        return bandas;  
    }
}
