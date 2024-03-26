package model;

import java.util.List;

public class Filme extends InfFilmagem {

private String nomeFilme;

private String genero;

private List<Ator> listaAtores;

private List<Diretor> listaDiretor;

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Ator> getListaAtores() {
        return listaAtores;
    }

    public void setListaAtores(List<Ator> listaAtores) {
        this.listaAtores = listaAtores;
    }

    public List<Diretor> getListaDiretor() {
        return listaDiretor;
    }

    public void setListaDiretor(List<Diretor> listaDiretor) {
        this.listaDiretor = listaDiretor;
    }
}
