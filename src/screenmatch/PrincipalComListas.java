package screenmatch;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Harry Potter", 2001);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Rei leao", 2002);
        outroFilme.avalia(6);
        var filme3 = new Filme("Ilha do medo",2010);
        filme3.avalia(10);
        
        Serie lost = new Serie("Lost", 2012);
        
        Filme f1 = filme3;
        
        System.out.println("------------------");
        List<Titulo> lista = new LinkedList<>();
        lista.add(filme3);
        lista.add(meuFilme);
        lista.add(outroFilme);
        
        lista.add(lost);
        
        
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificacao : " + filme.getClassificacao());
            }
            
        }
        
        System.out.println("---------------------");
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Jack Chan");
        buscaPorArtista.add("Robyson Lima");
        buscaPorArtista.add("Agatha Bertie");
        System.out.println(buscaPorArtista);
        
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);

    }
}
