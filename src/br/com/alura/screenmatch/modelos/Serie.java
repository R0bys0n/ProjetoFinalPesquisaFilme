package br.com.alura.screenmatch.modelos;



public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int espisodeosPorTemporada;
    private int minutosPorEpisodios;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEspisodeosPorTemporada() {
        return espisodeosPorTemporada;
    }

    public void setEspisodeosPorTemporada(int espisodeosPorTemporada) {
        this.espisodeosPorTemporada = espisodeosPorTemporada;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * espisodeosPorTemporada *  minutosPorEpisodios;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + "("  + this.getAnoDeLancamento() + ")";
    }
    
    
    
}
