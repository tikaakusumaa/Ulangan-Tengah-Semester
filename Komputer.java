public class Komputer {	
			
	public int Processor;
	public int Memori;
	public int Storage;

public void Komputer(){
	Processor = 500;
	System.out.println("Kecepatan Processor Komputer = " +Processor);
}

}

class Notebook extends Komputer {
	public int Baterai;
	public Notebook (int prcssr, int mmri, int strg, int btri)
{
	Processor = prcssr;
	Memori = mmri;
	Storage = strg;
	Baterai = btri;
}
public void CetakSpesifikasi(){
	System.out.println("Kecepatan Processor Notebook = " +Processor);
	System.out.println("Kapasitas Memori = " +Memori);
	System.out.println("Kapasitas Storage = " +Storage);
	System.out.println("Kapasitas Baterai = " +Baterai);
}
public void Overclock(int p){
	Processor = p;
	System.out.println("Notebook dioverclock dengan kecepatan processor = " +Processor);
}
}