package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listas {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Jamil");
		list.add("Lucas");		
		list.add("Pablo");		
		list.add("Joao");
		list.add("Anna");
		list.add("Alex");
		list.add(2, "Trossard");
		list.remove(1);
		
		System.out.println("Tamanho da lista: " + list.size());
		
		list.removeIf(x -> x.charAt(0) == 'J'); //removendo elementos que começam com a letra J
		
		System.out.println("Elementos da lista que o nome não começa com J:");
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		System.out.println("Index do Pablo: " + list.indexOf("Pablo"));
		
		System.out.println("---------------------");
		
		List <String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		System.out.println("Nomes que começam com A:");
		for(String x : result) {
			System.out.println(x);
			
		}
		
		
		System.out.println("---------------------");
		
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println("Primeiro nome que começa com A: " + name);
		System.out.println("Primeiro nome que começa com J: " + list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null));
		
	}

}
