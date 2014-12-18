

public class Datum {

	private int dan;
	private int mjesec;
	private int godina =2014;
	
	public Datum(){
		
	}

	public Datum RandomDatum (){
		int brojac =0;
		do{
			this.mjesec= (int)(1 +Math.random() *12);
			if ( this.mjesec ==1 || this.mjesec ==3 ||this.mjesec ==5 ||this.mjesec ==7 || this.mjesec ==8 || this.mjesec ==10 || this.mjesec ==12){
				this.dan =(int ) (1 +Math.random() * 31);		
			}
			
			if ( this.mjesec ==2 ){
				this.dan =(int ) (1 +Math.random() * 28);
			}
			if ( this.mjesec ==4 || this.mjesec ==6 ||this.mjesec ==9 ||this.mjesec ==11){
				this.dan =(int ) (1 + Math.random() * 30);
				
				brojac ++;
			}
			
		} while (brojac ==50);
		return this;
	}
	
	public int IntDatum(){
		return this.brojDanaZaMjesece()+this.dan;
	}
	
	private int brojDanaZaMjesece(){
		int suma=0;
		for (int i=1; i<this.mjesec;i++){
			suma+=Datum.brojDanaZaJedanMjesec(i);
		}
		return suma;
	}
	
	private static int brojDanaZaJedanMjesec(int trenutniMjesec){
		if(trenutniMjesec==1)
			return 31;
		if (trenutniMjesec==2)
			return 28;
		if (trenutniMjesec==3)
			return 31;
		if (trenutniMjesec==4)
			return 30;
		if (trenutniMjesec==5)
			return 31;
		
		if (trenutniMjesec==6)
			return 30;
		if (trenutniMjesec==7)
			return 31;
		if (trenutniMjesec==8)
			return 31;
		
		if (trenutniMjesec==9)
			return 30;
		if (trenutniMjesec==10)
			return 31;
		if (trenutniMjesec==11)
			return 30;
		if (trenutniMjesec==12)
			return 31;
		
		return 0;
	}
	
	public static void bubbleSortStudenti(Datum[] datumi) {
		for (int i = 0; i < datumi.length; i++) {
			for (int j = i + 1; j < datumi.length; j++) {
				if (datumi[i].IntDatum() > datumi[j].IntDatum()) {
					Datum temp = datumi[i];
					datumi[i] = datumi[j];
					datumi[j] = temp;
				}
			}

		}

	}
	
//	public Datum() {s
//		dan = 1;
//		mjesec = 1;
//		godina = 1900;
//	}
//
//	/**
//	 * Postavlja datum
//	 * 
//	 * @param postaviDan
//	 *            = dan u mjesecu
//	 * @param postaviMjesec
//	 *            = mjesec u godini
//	 * @param postaviGodina
//	 *            = godina
//	 */
//	public Datum(int dan, int mjesec, int godina) {
//		this.dan = dan;
//		this.mjesec = mjesec;
//		this.godina = godina;
//	}
//
//	/**
//	 * Funkcija koju koristimo za kopiju
//	 * 
//	 * @param other
//	 *            = novi objekt
//	 */
//	public Datum(Datum other) {
//		this.dan = other.dan;
//		this.mjesec = other.mjesec;
//		this.godina = other.godina;
//
//	}

	public boolean equals(Datum other) {
		if (this.dan == other.dan && this.mjesec == other.mjesec
				&& this.godina == other.godina) {
			return true;
		}
		return false;
	}

	public int compare(Datum other) {

		if (this.godina == other.godina && this.mjesec == other.mjesec
				&& this.dan == other.dan) {
			return 0;
		} else if (this.godina > other.godina) {
			return 1;
		} else if ((this.godina == other.godina) && (this.mjesec > other.mjesec)) {
			return 1;
		} else if ((this.godina == other.godina) && (this.mjesec == other.mjesec) && (this.dan > other.dan)) {
			return 1;
		} else {
			return -1;
		}

	}
	
	

	/**
	 * Pretvara sve vrijednosti u string
	 */
	public String toString() {
		String datumKaoString = "";
		datumKaoString = dan + "." + mjesec + "." + godina;
		return datumKaoString;
	}

	/**
	 * Uzima vrijednost varijable "dan"
	 * 
	 * @returnvraca vrijednost varijable "dan"
	 */
	public int getDan() {
		return dan;
	}

	/**
	 * Uzima vrijednost varijable "mjesec"
	 * 
	 * @returnvraca vrijednost varijable "mjesec"
	 */
	public int getMjesec() {
		return mjesec;
	}

	/**
	 * Uzima vrijednost varijable "godina"
	 * 
	 * @return vraca vrijednost varijable "godina"
	 */
	public int getGodina() {
		return godina;
	}

	/**
	 * Postavlja varijablu "dan" na novu vrijednost izmedju 1 i 31
	 * 
	 * @param dan
	 *            = nova vrijednost varijable "dan"
	 */
	public void setDan(int dan) {
		if (dan < 0 || dan >= 31) {
			throw new IllegalArgumentException("Dan nije u validnom untervalu!");
			// return false;
		} else {
			this.dan = dan;
			// return true;
		}
	}

	/**
	 * Postavlja varijablu "mjesec na novu vrijednost izmedju 1 i 12
	 * 
	 * @param mjesec
	 *            = nova vrijednost varijable "mjesec"
	 */
	public void setMjesec(int mjesec) {
		if (mjesec < 0 || mjesec >= 12) {
			throw new IllegalArgumentException("Taj mjesec ne postoji!");
		} else {
			this.mjesec = mjesec;
		}
	}

	/**
	 * Postavlja varijablu "godina" na novu vrijedost izmjedju 1900 i 3014
	 * 
	 * @param godina
	 *            = nova vrijednost varijable "godina"
	 */
	public void setGodina(int godina) {
		if (godina < 1900 || godina > 3014) {
			throw new IllegalArgumentException("Losa godina!");
		} else {
			this.godina = godina;
		}
	}

}
