package Zivotinja;

public class Shelter {

	private Animal[] animals;
	private int numAnimals;
	
	private String imeSklonista;
	
	private static int ukupnoZivotinja = 0;

	public Shelter() {
		animals = new Animal[2];
		numAnimals = 0;
		imeSklonista = "Nepoznat";
		
	}
	
	public Shelter (String imeSklonista){
		animals = new Animal[2];
		numAnimals = 0;
		this.imeSklonista = imeSklonista;
		
	}

	public void addAnimal(String name, String type, int numLegs) {
		
		animals[numAnimals] = new Animal(name, type, numLegs);
		numAnimals++;
		ukupnoZivotinja ++;
		if (numAnimals == animals.length) {
			resizeAnimals();

		}
	}

	private void resizeAnimals() {
		int newLength = 2 * animals.length;
		Animal[] temp = new Animal[newLength];

		for (int i = 0; i < animals.length; i++) {
			temp[i] = animals[i];

		}
		animals = temp;
	}

	public void addAnimal(String name, String type) {
		addAnimal(name, type, 5);

	}

	public String toString() {
		String shelterAsString = "";
		shelterAsString += imeSklonista;
		for (int i = 0; i < numAnimals; i++) {
			shelterAsString += animals[i].toString();
		}
		return shelterAsString;
		
	}
	
	public static int getUkupnoZivotinja (){
		return ukupnoZivotinja;
	}
}
