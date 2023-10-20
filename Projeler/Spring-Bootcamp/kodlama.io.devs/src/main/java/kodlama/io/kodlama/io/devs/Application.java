package kodlama.io.kodlama.io.devs;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	// ÖNEMLİ . . . ! ?
	// TEKNOLOJİ ADD İŞLEMİ UPDATE GİBİ DAVRANIYOR, VİDEO İÇERİĞİNDE KONUYA KISACA
	// DEĞİNİLİYOR
	// Çözüm : TechnologyManager içerisinde açıklaması ile yazılıdır

	// Ekstralar:
	// TEKNOLOJİ için validation & exception & log işlemleri yapılabilir

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
	/*
	 * public static void main(String[] args) throws Exception {
	 * ProgrammingLanguageManager manager; ProgrammingLanguage pLanguage; int id;
	 * String name;
	 * 
	 * manager = new ProgrammingLanguageManager(new
	 * InMemoryProgrammingLanguageRepository());
	 * 
	 * // EKLEME System.out.println("\n  EKLEME"); // name = ""; // hata fırlatmak
	 * için name = "Pascal"; pLanguage = new ProgrammingLanguage(4, name);
	 * manager.add(pLanguage); System.out.println(pLanguage.getName() +
	 * " dili başarılı eklendi");
	 * 
	 * // LİSTELEME System.out.println("\n LİSTELEME"); for (ProgrammingLanguage
	 * language : manager.getAll()) { System.out.println("ID : " + language.getId()
	 * + " | " + "NAME : " + language.getName()); }
	 * 
	 * // GÜNCELLEME System.out.println("\n  GÜNCELLEME"); id = 4; // name = ""; //
	 * hata fırlatmak için name = "Turbo Pascal"; System.out.println("ID : " + id +
	 * " için"); pLanguage = new ProgrammingLanguage(id, name); if
	 * (manager.update(pLanguage)) System.out.println("Güncelleme başarılı"); else
	 * System.out.println("Güncelleme başarısız");
	 * 
	 * // ID İLE GETİRME System.out.println("\n ID İLE GETİRME");
	 * System.out.println("ID : " + manager.getById(4).getId() + " | " + "NAME : " +
	 * manager.getById(4).getName());
	 * 
	 * // SİLME System.out.println("\n  SİLME"); id = 4; System.out.println("ID : "
	 * + id + " için"); if (manager.delete(id))
	 * System.out.println("Silme başarılı"); else
	 * System.out.println("Silme başarısız");
	 * 
	 * }
	 */

}
