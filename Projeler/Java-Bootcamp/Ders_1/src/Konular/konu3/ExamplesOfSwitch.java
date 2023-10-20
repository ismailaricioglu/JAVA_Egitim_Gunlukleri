package Konular.konu3;

public class ExamplesOfSwitch  {
	
	public static void main(String[] args) {
		
		SwitchAndUsagePatterns(0);
		
	}
	
    // Switch and usage patterns
    public static void SwitchAndUsagePatterns(int number) {

        switch (number){
            case 0:
            case 1:
                System.out.println("Sayı 0 veya 1");
                break;
            case 2:
                System.out.println("Sayı 2");
                break;
            case 3:
                System.out.println("Sayı 3");
                break;
            default:
                System.out.println("Sayı bilinmiyor veya seçenekleri eşleştiremedi");
                break;
        }
    }
}