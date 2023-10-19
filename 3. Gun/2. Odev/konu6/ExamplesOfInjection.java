package Konular.konu6;

public class ExamplesOfInjection {

	public static void main(String[] args) {
		Oven oven = new Bread();
		Pan pan = new Dinner(oven);
		pan.eat();

		((Dinner) pan).setOven(new ChocolateCake());
		pan.eat();
	}

//  Oven			: ocak, fırın	
//	Pan				: yemek kabı, tava
//	Food			: yemek, gıda
//	Cook			: yemek pişirme
//	Eat				: yemek yeme
//	Sushi			: suşi
//	Bread			: ekmek
//	Chocolate Cake	: çikolatalı kek
	
	public interface Pan {
		void eat();
	}

	public interface Oven {
		String cook();
	}

	public static class Sushi implements Oven {

		@Override
		public String cook() {
			return "Sushi cooked.";
		}
	}

	public static class Bread implements Oven {

		@Override
		public String cook() {
			return "Bread cooked.";
		}
	}

	public static class ChocolateCake implements Oven {

		@Override
		public String cook() {
			return "Chocolate Cake cooked.";
		}
	}

	public static class Dinner implements Pan {

		Oven oven;

//		Constructor injection
		public Dinner(Oven oven) {
			this.oven = oven;
		}

//		Setter injection
		public void setOven(Oven oven) {
			this.oven = oven;
		}

		@Override
		public void eat() {

			String ovenCook = oven.cook();
			System.out.println(ovenCook);

		}

	}

}
