package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa {

	public static void main(String[] args) {
		List<String> list = new ArrayList <> ();
		// Dependendo da versão do Java, talvez no ArrayList precise colocar novamente o nome String / ou tipo warpprer class
		// Exemplo: List<String> list = new ArrayList <String> ();
		
		list.add("Robson");
		list.add("Thais");
		list.add("Almir");
		list.add("Adams");
		
		list.add(2,"Jairo"); 
		//Esse elemento adiciona uma String na lista.
		// primeiro declara a posição e depois adiciona o tipo.
		
		
		System.out.println(list.size());
		// Consultar o tamanho da lista.
		
		for (String x: list) {
			System.out.println(x);
		}
		System.out.println("---------------------------------------");
		
			list.remove(3);
		
		// Essa operação remove quem está na posição 3 da lista.
		// Eu poderia colocar no lugar do "3" apenas "Almir" que tambem removeria, pois o programa compara os valores.
			
			list.removeIf(x -> x.charAt(0)== 'A');
			//Esse codigo remove todos os nomes que iniciam com a letra "A".
			// Essa operação é chamada de predicado e a função é lambda.
			
			for (String x: list) {
				System.out.println(x);
			}
			System.out.println("---------------------------------------");
			
			System.out.println("Index of Robson - Posição de Robson: " + list.indexOf("Robson") );
			// Essa operação busca em qual posição da lista está "Robson".
			
			List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
			
			for (String x : result) {
			System.out.println(x);
			}
			
			//Essa função fará uma pesquisa na lista para encontrar apenas os elementos que iniciam com a letra "A".
			
			System.out.println("---------------------");
			
			String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
			System.out.println(name);
			}
			// Essa função consultará na lista quem é o primeiro nome com a letra "A".

	}


