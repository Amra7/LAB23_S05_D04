
public class Student {

	private String imeIPrezime;
	private Datum datumRodjenja;
	private Datum datumUpisa;
	private double gpa;
	private int brIndexa=0;
	
	private static int brStudneta = 0;
	
	public Student (){
		
		this("John Doe", new Datum (), new Datum ());
//		this.imeIPrezime= "John Doe";
//		this.datumRodjenja =new Datum();
//		this.datumUpisa = new Datum();
//		this.gpa = 0;
//		brStudneta++;
//		this.brIndexa=brStudneta;
	}
	 
	public  Student (String imeIPrezime, Datum datumRodjenja, Datum datumUpisa){
		this.imeIPrezime= "John Doe";
		this.datumRodjenja =new Datum();
		this.datumUpisa = new Datum();
		this.gpa = 0;
		brStudneta++;
		this.brIndexa=brStudneta;
	}

	
	public Student copy ( Student other){
		this.imeIPrezime = other.imeIPrezime;
		this.datumRodjenja = other.datumRodjenja;
		this.datumUpisa =  other.datumUpisa;
		this.gpa = other.gpa;
		this.brIndexa = other.brIndexa;
		
		return this;
	}
	
	
	
}
