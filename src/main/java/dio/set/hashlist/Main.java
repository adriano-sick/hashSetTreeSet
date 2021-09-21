package dio.set.hashlist;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {


        Set<Carro> hashsetCarros =  new HashSet<>();

        hashsetCarros.add(new Carro("Ford"));
        hashsetCarros.add(new Carro("Fiat"));
        hashsetCarros.add(new Carro("Renault"));
        hashsetCarros.add(new Carro("Honda"));
        hashsetCarros.add(new Carro("Volkswagen"));
        hashsetCarros.add(new Carro("Mazda"));

        System.out.println(hashsetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Renault"));
        treeSetCarros.add(new Carro("Honda"));
        treeSetCarros.add(new Carro("Volkswagen"));
        treeSetCarros.add(new Carro("Mazda"));

        System.out.println(treeSetCarros);


    }
}
