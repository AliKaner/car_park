package denemee;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;


public class Otopark{
	public static Otopark izmirOtopark =  new  Otopark();
	
	LocalDateTime currentDate = LocalDateTime.now();
	private ArrayList<Araba> KayýtlýArabalar = new ArrayList<Araba>();
	private int  Ucret = 15;
	
	public static void main(String[] args) 
	{
		
		izmirOtopark.IA();
		
		
		
		
		
		
        
	}

	public ArrayList<Araba> getKayýtlýArabalar() {
		return KayýtlýArabalar;
	}

	public void setKayýtlýArabalar(ArrayList<Araba> KayýtlýArabalar) {
		this.KayýtlýArabalar = KayýtlýArabalar;
	}

	public int getUcret() {
		return Ucret;
	}

	public void setUcret(int ucret) {
		Ucret = ucret;
	}
        
        
        void arabaCikisi(Araba araba) {
        	
        KayýtlýArabalar.remove(araba);
        araba.setCikisZamaný(currentDate);
        long süre = Duration.between(araba.getCikisZamaný(),araba.getGirisZamaný()).getSeconds();
        System.out.println("Kalýþ süreniz"+süre+"saniye\n Ücretiniz="+süre*Ucret);	
        	
        }
        
        void arabaGiris(String araba) {
        Araba Girenaraba = new Araba (araba);
        Girenaraba.setArabaOtoparký(this);
        System.out.println(Girenaraba.toString());
        	
        	
        }
        
        void IA () 
        {
        	System.out.println("Welcome to the  system  Master  READY TO  SERVE !!!");
    		System.out.println("What do you want to do");
    		System.out.println("1-Add car\n2-Remove car");
    		Scanner givenAction = new Scanner(System.in);
    		int givenAction_Number =  givenAction.nextInt();
    		 
    		
    		if( givenAction_Number == 1) {
    			System.out.println("type  your  car");
    			Scanner givenName = new  Scanner(System.in);
    			String arabaAdi = givenName.nextLine();
    			this.arabaGiris(arabaAdi);
    			this.IA();
    			
    			}
    		if(givenAction_Number == 2) {
    			System.out.println("type your car");
    			Scanner givenName2 = new  Scanner(System.in);
    			String arabaAdi2 = givenName2.nextLine();
    			this.arabaCikisi(FindAraba(arabaAdi2));
    			this.IA();
    			}
    		if( 2<givenAction_Number || 1>givenAction_Number   ) 
    		{
    			
    			System.out.println("Invalid choose select again");
    			this.IA();
    		}
    		
    		
        	 }
        
         Araba FindAraba(String InputName)
         {
        	 for(Araba a :KayýtlýArabalar )
        	 {
        		 if(a.getName().equals(InputName))
        			 return a;
        	 }
        	 return null;
        	 
        	 
         }
	}
	
	
	
	
	
	
