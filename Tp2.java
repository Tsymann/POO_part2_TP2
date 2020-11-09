package com.tactfactory.javaniveau2.tps.tp2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.tactfactory.javaniveau2.tps.tp2.entities.Car;
import com.tactfactory.javaniveau2.tps.tp2.entities.User;
import com.tactfactory.javaniveau2.tps.tp2.utils.ItemsGenerator;

/**
 *
 * @author tactfactory
 *
 *         - Créer un programme qui permet, en utilisant la fonction "stream()"
 *         sur la variable users, d'afficher les informations suivantes : - 1 :
 *         Le nombre d'utilisateur - 2 : Le nombre d'utilisateur dans la
 *         première lettre du prénom commence par "a" - 3 : Le nombre
 *         d'utilisateur dont le nom et le prénom contienent exactement 5
 *         caractères - 4 : Le nombre d'utilisateur dont le full name contient
 *         entre 13 et 16 caractères - 5 : Les utilisateurs possédant une
 *         voiture de la marque "marque1" - 6 : La première voiture avec le
 *         plus haut kilométrage - 7 : La liste des voitures avec le plus haut
 *         kilométrage - 8 : La marque possédant le plus de voiture avec le
 *         nombre de voiture possédé - 9 : Les marques possédant le moins de
 *         voiture avec chacune des voitures pour chaque marque -10 : La liste
 *         des utilisateurs triée par nom puis par prénom
 */
public class Tp2 {

	// question 8 et 10, erreur si pas d�clar� ici �\_(''/)_/�
	private static Integer max = 0;
	private static String mark;
	
	private static String name;

	public static void main(String[] args) {
		List<User> users = ItemsGenerator.generateUsers();

		for (User user : users) {
			// System.out.println(user);
		}

//    // 1 : Le nombre d'utilisateur
//    long nbUsers = users.stream().distinct().count();
//    System.out.println(String.format("%s %d", "Nombre d'utilisateur", nbUsers));
//
//    // 2 : Le nombre d'utilisateur dans la première lettre du prénom commence par "a"
//    long nbUsersA = users.stream().filter(x -> x.getFirstname().substring(0,1).equals("a")).count();
//    System.out.println(String.format("%s %d", "Nombres d'utilisateur dans la première lettre du prénom commence par \"a\"", nbUsersA));
//
//    // 3 : Le nombre d'utilisateur dont le nom et le prénom contienent exactement 5 caractères
//    long nbUsersFLName5 = users.stream().filter(x -> x.getFirstname().length() == 5).count();
//    System.out.println(String.format("%s %d","Les utilisateurs dont le nom et le prénom contienent exactement 5 caractères", nbUsersFLName5));
//
//    // 4 : Le nombre d'utilisateur dont le full name contient entre 13 et 16 caractères
//    long nbUsersFullname1316 = users.stream().filter(x -> x.getFirstname().length() >= 13).filter(x -> x.getFirstname().length() <= 16).count();
//    System.out.println(String.format("%s %d", "Les utilisateurs dont le full name contient entre 13 et 16 caractères",nbUsersFullname1316));
//
//    // 5 : Les utilisateurs possédant une voiture de la marque "marque1"
//    List<User> usersCarMarque1 = users.stream().filter(x -> x.getCar().getCarType().getMark().equals("marque1")).collect(Collectors.toList());
//    System.out.println("Les utilisateurs possédant une voiture de la marque \"marque1\"");
//    for (User user : usersCarMarque1) {
//      System.out.println(String.format("\t%s", user));
//    }
//
//    // 6 : La première voiture avec le plus haut kilométrage
//    Car carMaxMileage = users.stream().collect(Collectors.maxBy(Comparator.comparingLong(x -> x.getCar().getMileage()))).get().getCar();
//    System.out.println(String.format("%s %s", "La voiture avec le plus haut kilométrage", carMaxMileage));
//
//    // 7 : La liste des voitures avec le plus haut kilométrage
//    long maxKm = users.stream().collect(Collectors.maxBy(Comparator.comparingLong(x -> x.getCar().getMileage()))).get().getCar().getMileage();
//    List<Car> carMaxMileages = new ArrayList<Car>();
//    users.stream().filter(x -> x.getCar().getMileage() == maxKm).forEach(x -> carMaxMileages.add(x.getCar()));
//    System.out.println("La liste des voitures avec le plus haut kilométrage");
//    for (Car car : carMaxMileages) {
//      System.out.println(String.format("\t%s", car));
//    }
//
//		// 8 : La marque possédant le plus de voiture avec le nombre de voiture possédé
//		// marche mais sans Entry
//		List<String> listMark = new ArrayList<String>();
//		Map<String, Integer> tabMark = new HashMap<String, Integer>();
//		users.forEach(x -> listMark.add(x.getCar().getCarType().getMark()));
//		listMark.stream().distinct().forEach(x -> tabMark.put(x, (int) listMark.stream().filter(w -> w == x).count()));
//		listMark.stream().forEach(x -> {
//			if (tabMark.get(x) > max) {
//				max = tabMark.get(x);
//				mark = x;
//			}
//		});
//		
//		System.out.println(String.format("%s est %s avec %d voitures", "La marque possédant le plus de voiture",
//	    mark, max));
//	
//    Entry<String, List<User>> markMaxCar = users.stream().filter(arg0);
//	    System.out.println(String.format("%s est %s avec %d voitures", "La marque possédant le plus de voiture",
//	    markMaxCar.getKey(), markMaxCar.getValue().size()));

		
		
		
		// 9 : Les marques possédant le moins de voiture avec chacune des voitures pour
		// chaque marque
//    int minCars = users.stream();
//    List<Entry<String, List<Car>>> markMinCars = users.stream();
//    System.out.println("Les marques possédant le moins de voiture avec chacune des voitures pour chaque marque");
//    for (Entry<String, List<Car>> entry : markMinCars) {
//      System.out.println("\t" + entry.getKey() + " :");
//      for (Car car : entry.getValue()) {
//        System.out.println("\t\t" + car);
//      }
//    }

		
		
		// 10 : La liste des utilisateurs triée par nom puis par prénom
//		List<String> listName = new ArrayList<String>();
//		List<User> sortedUsers = new ArrayList<User>();
//
//		users.stream().forEach(x -> {
//			name = x.getLastname() + " " + x.getFirstname();
//			listName.add(name);
//		});
//		
//		List<String> listNameSorted = listName.stream().sorted().collect(Collectors.toList());
//	
//		List<User> temp = null;
//		listNameSorted.stream().forEach(x -> {
//			String[] name = x.split(" ");
//			users.stream().forEach(y -> {
//				if(y.getLastname().equals(name[0]) && y.getFirstname().equals(name[1])) {
//					sortedUsers.add(y);
//				}
//			});
//			
//		});
//		
//	
//		System.out.println("La liste des utilisateurs triée par nom puis par prénom");
//		for (User user : sortedUsers) {
//			System.out.println("\t" + user);
//		}
	}

}
