package Zivotinja;

public class TestAnimal {
	public static void main(String[] args) {
//		Animal an = new Animal();
//		System.out.println(an.toString());
		
//		System.out.println("---------------");
//		an.setName("Pujdo");
//		an.setType("pas");
//		an.setNumLegs(4);
//		
//		System.out.println(an.getName());
//		System.out.println(an.getType());
//		System.out.println(an.getNumLegs());
//		
//		System.out.println("---------------");
//		Animal kucna = new Animal();
//		kucna.setName("Pufna");
//		kucna.setType("macka");
//		kucna.setNumLegs(5);
//		
//		System.out.println(kucna.getName());
//		System.out.println(kucna.getType());
//		System.out.println(kucna.getNumLegs());
		
		
		
		Shelter skloniste = new Shelter ("Prvo");
		skloniste.addAnimal("Pujdo", "pas" );
		skloniste.addAnimal("Cicko", "macka" );
		skloniste.addAnimal("Rex", "pas");
		skloniste.addAnimal("Mrva", "ptica");
		skloniste.addAnimal("Molly", "konj");
		
		Shelter skloniste2= new Shelter ("Drugo");
		skloniste2.addAnimal("Pipi", "pas" );
		skloniste2.addAnimal("Kralj", "macka" );
		skloniste2.addAnimal("Sah", "pas");
		skloniste2.addAnimal("Mali", "ptica");
		skloniste2.addAnimal("Klinjo", "konj");
		
		System.out.println(skloniste.toString());
		System.out.println();
		System.out.println(skloniste2.toString());
		
		System.out.println();
	
		System.out.println( Shelter.getUkupnoZivotinja());
}
}
