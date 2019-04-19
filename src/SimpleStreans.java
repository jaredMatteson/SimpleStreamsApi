import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class SimpleStreans {

	public static void main(String[] args) {
		SimpleStreans Example = new SimpleStreans();
		String[] NamesB = {"Sean","Matt","Jared","Anders","Kris","Kai","Sam",""};
		List<String> Names = new ArrayList();// ".asList" is uneditable
		boolean keepRunning = true;

		////////////////////////
		//filter
		////////////////////////
		System.out.println();
		while (keepRunning == true) {
			String userName = JOptionPane.showInputDialog(null, "Add a name to the list\nThis will filter by the first letter of your name!", "Filter", 3);
			NamesB[7]= userName; // to get around "asList" issue I add to data("NamsesB") before setting Namse to asList
			List<Person> persons = Arrays.asList(
					new Person("Sean",21),
					new Person("Matt",35),
					new Person("Jared",20),
					new Person("Anders",23),
					new	Person("Kris",36),
					new Person("Kai",19),
					new Person("Sam",30),
					new Person(NamesB[7],Example.randInt(18,40))
			);
			Names = Arrays.asList(NamesB);

			if (userName.equals("") || userName == null) {
				JOptionPane.showMessageDialog(null,"Incorrect Input\nPlease try again!","Error",0);
			}
			else {
				System.out.println("Filter Output:");
				Names.stream().filter(x-> x.toUpperCase().charAt(0)==userName.toUpperCase().charAt(0)).forEach(System.out::println);


				//////////////////
				//sort
				//////////////////
				System.out.println();
				System.out.println("Sorted output:");
				Names.stream().sorted().forEach(System.out::println);



				/////////////////
				//map
				/////////////////
				System.out.println();
				System.out.println("Map Output:");
				Names.stream().sorted().map(x->x.length()).forEach(System.out::println);
				//"map" preforms an operation on the values of "x", it can be replaced to get different values.



				/////////////////////
				//Another Example
				////////////////////
				System.out.println("Map Second Output:");
				Names.stream().sorted().map(x-> x.toUpperCase()).forEach(System.out::println);




				//////////////////////////////////
				//Example with Persons object
				//////////////////////////////////
				System.out.println();
				System.out.println("Object Example");
				persons.stream().sorted(Comparator.comparing(Person::retunrAge)).forEach(x -> System.out.println(x.msg()));


				keepRunning = false;
			}
		}



	}


	public static int randInt(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}


}
