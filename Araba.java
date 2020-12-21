package denemee;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Araba extends Otopark {
	
	LocalDateTime currentDate = LocalDateTime.now();
	
	private Otopark ArabaOtopark� = izmirOtopark;
	private LocalDateTime GirisZaman�;
	private  String name;
	private LocalDateTime CikisZaman�;
	
	Araba(String  name ){
		
	this.setName(name);
	this.setGirisZaman�(currentDate);
	ArabaOtopark�.getKay�tl�Arabalar().add(this);
	
		
	}

	public LocalDateTime getGirisZaman�() {
		return GirisZaman�;
	}

	public void setGirisZaman�(LocalDateTime  girisZaman�) {
		GirisZaman� = girisZaman�;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getCikisZaman�() {
		return CikisZaman�;
	}

	public void setCikisZaman�(LocalDateTime cikisZaman�) {
		CikisZaman� = cikisZaman�;
	}

	public Otopark getArabaOtopark�() {
		return ArabaOtopark�;
	}

	public void setArabaOtopark�(Otopark arabaOtopark�) {
		ArabaOtopark� = arabaOtopark�;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
