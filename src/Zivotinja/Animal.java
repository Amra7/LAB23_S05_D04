package Zivotinja;

public class Animal {

	private String name;
	private String type;
	private int numLegs;

	public Animal() {
		this.name = "Nepoznato";
		this.type = "Nepoznato";
		this.numLegs = 0;

	}

	public Animal(String name, String type) {
		setName(name);
		setType(type);
		setNumLegs(numLegs);
	}

	public Animal(String name, String type, int numLegs) {
		this.name = name;
		setType(type);

		if (this.type == "konj" || this.type == "pas" || this.type == "macka") {
			numLegs = 4;

		} else if (this.type == "ptica") {
			numLegs = 2;
		} else {
			numLegs = 0;
		}
		this.numLegs = numLegs;

	}

	public String toString() {
		String podaci = "";
		podaci = "\nIme: " + name + "\nVrsta: " + type + "\nBroj nogu: " + numLegs;
		return podaci;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		String konj = "konj";
		String psi = "pas";
		String macke = "macka";
		String ptice = "ptica";
		String ribe = "riba";

		if ( type.equalsIgnoreCase(konj) || type.equalsIgnoreCase(psi) || type.equalsIgnoreCase(macke)
				|| type.equalsIgnoreCase(ptice) || type.equalsIgnoreCase(ribe)) {
			this.type = type;
		} else {
			
			throw new IllegalArgumentException(
					"Zivotinja nije ni konj, ni pas, ni macka, ni ptica, niti riba!");
		}
	}

	public void setNumLegs(int numLegs) {
		if (this.type.equalsIgnoreCase("konj")
				|| this.type.equalsIgnoreCase("pas")
				|| this.type.equalsIgnoreCase("macka")) {
			if (numLegs < 4 || numLegs > 0)
				numLegs = 4;

		} else if (this.type == "ptica") {
			// numLegs= (numLegs < 2 || numLegs > 0) ? 4 : numLegs
			if (numLegs < 2 || numLegs > 0)
				numLegs = 2;
		} else {
			numLegs = 0;
		}

		this.numLegs = numLegs;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getNumLegs() {
		return numLegs;
	}

}
