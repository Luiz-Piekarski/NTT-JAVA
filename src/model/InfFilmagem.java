package model;

import java.util.Date;

public class InfFilmagem {

    private String endereco;

    private int tempoFilmagem;

    private String dataInicio;

    private String dataFim;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTempoFilmagem() {
        return tempoFilmagem;
    }

    public void setTempoFilmagem(int tempoFilmagem) {
        this.tempoFilmagem = tempoFilmagem;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
}
