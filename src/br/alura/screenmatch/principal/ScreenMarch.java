package screenmatch;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodeos;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//import java.util.HashSet;
//import java.util.Set;


public class ScreenMarch {
    {
    //public static void main(String[] args) {
        Filme meuFilme = new Filme("Harry Potter", 2001);
        meuFilme.setDuracaoEmMinutos(160);
        System.out.println("Duração do filme : " + meuFilme.getDuracaoEmMinutos());

        
        //meuFilme.exibirFichaTecnica();
        
        meuFilme.avalia(8);
        meuFilme.avalia(5.5);
        meuFilme.avalia(10);
        meuFilme.avalia(2.3);
        System.out.println("Total de avaliações : " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Media : " + meuFilme.pegaMedia());
        
        
        Serie lost = new Serie("Lost", 2012);

        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEspisodeosPorTemporada(10);
        lost.setMinutosPorEpisodios(50);
        System.out.println("Duração para maratonar Lost : " + lost.getDuracaoEmMinutos());
        
        
        Filme outroFilme = new Filme("Rei leao", 2002);
        
        //outroFilme.setNome("Rei leao");
        //outroFilme.setAnoDeLancamento(2002);
        outroFilme.setDuracaoEmMinutos(220);
        
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());
        
        
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        
        Episodeos episodeo = new Episodeos();
        episodeo.setNumero(1);
        episodeo.setSerie(lost);
        episodeo.setTotalVisualizacoes(300);
        filtro.filtra(episodeo);
        
        
        var filme3 = new Filme("Ilha do medo",2010);
        
        filme3.setDuracaoEmMinutos(200);
        filme3.avalia(8.5);
        
        
        
        //------------------------------------------------------
        System.out.println("------------------");
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme3);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da lista : " + listaDeFilmes.size());
        System.out.println("Primeiro filme :" + listaDeFilmes.get(0).getNome());
        System.out.println("Toda a lista : " + listaDeFilmes);
        
        System.out.println("toString do filme :" + listaDeFilmes.get(0).toString());
        
        
       
    }
        
    }
//}


