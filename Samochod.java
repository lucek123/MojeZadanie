public class Samochod {
	String marka;
	String model;
	int rokProdukcji;

	public void wyswietlInfo(Samochod auto) {
		System.out.println("Marka auta: " + auto.marka);
		System.out.println("Model auta: " + auto.model);
		System.out.println("Rok produkcji auta " + auto.rokProdukcji);
	}



	public static void main(String[] args) {

		Samochod Mazda = new Samochod();
		Mazda.marka = "Mazda";
		Mazda.model = "RX-7";
		Mazda.rokProdukcji = 2001;

		Samochod Renault = new Samochod();
		Renault.marka = "Renault";
		Renault.model = "Clio";
		Renault.rokProdukcji = 2006;

		Mazda.wyswietlInfo(Mazda);
		Renault.wyswietlInfo(Renault);

	}

}
