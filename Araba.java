package denemee;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Araba extends Otopark {
	
	LocalDateTime currentDate = LocalDateTime.now();
	
	private Otopark ArabaOtoparký = izmirOtopark;
	private LocalDateTime GirisZamaný;
	private  String name;
	private LocalDateTime CikisZamaný;
	
	Araba(String  name ){
		
	this.setName(name);
	this.setGirisZamaný(currentDate);
	ArabaOtoparký.getKayýtlýArabalar().add(this);
	
		
	}

	public LocalDateTime getGirisZamaný() {
		return GirisZamaný;
	}

	public void setGirisZamaný(LocalDateTime  girisZamaný) {
		GirisZamaný = girisZamaný;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getCikisZamaný() {
		return CikisZamaný;
	}

	public void setCikisZamaný(LocalDateTime cikisZamaný) {
		CikisZamaný = cikisZamaný;
	}

	public Otopark getArabaOtoparký() {
		return ArabaOtoparký;
	}

	public void setArabaOtoparký(Otopark arabaOtoparký) {
		ArabaOtoparký = arabaOtoparký;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
