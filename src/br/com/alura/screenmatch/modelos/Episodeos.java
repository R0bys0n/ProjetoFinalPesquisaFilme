package br.com.alura.screenmatch.modelos;

import br.alura.screenmatch.calculo.Classificavel;

public class Episodeos implements Classificavel{
    private int numero;
    private String nome;
    private Serie serie;
    private int TotalVisualizacoes;

    public int getTotalVisualizacoes() {
        return TotalVisualizacoes;
    }

    public void setTotalVisualizacoes(int TotalVisualizacoes) {
        this.TotalVisualizacoes = TotalVisualizacoes;
    }

    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if(TotalVisualizacoes > 100){
            return 4;
        }else{
            return 2;
        }

    }
    
    
}
