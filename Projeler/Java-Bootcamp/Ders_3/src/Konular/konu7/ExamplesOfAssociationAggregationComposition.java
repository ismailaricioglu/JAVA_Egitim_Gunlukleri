package Konular.konu7;

import java.util.List;

public class ExamplesOfAssociationAggregationComposition {

	public static void main(String[] args) {

	}
	
//	_Composition_____

//	non-static inner class - statik olmayan içi sınıf
	class BuildingA {
		class Room {
		}
	}

//	Alternatif olarak, bu sınıfı bir yöntem gövdesinde de bildirebiliriz. 
//	Adlandırılmış bir sınıf, anonim bir sınıf veya bir lambda olması fark etmez:
	class BuildingB {
		Room createAnonymousRoom() {
			return new Room() {
				@Override
				public void doInRoom() {
				}
			};
		}

		Room createInlineRoom() {
			class InlineRoom implements Room {
				@Override
				public void doInRoom() {
				}
			}
			return new InlineRoom();
		}

		Room createLambdaRoom() {
			return () -> {
			};
		}

		interface Room {
			void doInRoom();
		}
	}

//	Tüm örneklerini kapsayıcı sınıfa bağladığı için iç sınıfımızın statik olmaması gerektiğini unutmayın.
//	Genellikle içeren nesne, üyelerine erişmek ister. Bu nedenle referanslarını saklamalıyız:
	class BuildingC {
		List<Room> rooms;

		class Room {
		}
	}
	
//	Tüm iç sınıf nesnelerinin, kendilerini kapsayan nesneye örtülü bir referans sakladığını unutmayın. Sonuç olarak, ona erişmek için onu manuel olarak kaydetmemize gerek yok:
	class BuildingD {
		String address;

		class Room {
			String getBuildingAddress() {
				return BuildingD.this.address;
			}
		}
	}

//	_Aggregation_____

//	Java'da toplamayı düz eski bir referansla modelleyebiliriz:
	class WheelA {}

	class CarA {
	    List<WheelA> wheels;
	}
	
//	Üye, statik olmayan bir iç sınıf dışında herhangi bir sınıf türü olabilir.
//	Yukarıdaki kod parçacığında her iki sınıfın da ayrı kaynak dosyaları vardır. Ancak statik bir iç sınıf da kullanabiliriz:
	class CarB {
	    List<WheelB> wheels;
	    static class WheelB {}
	}
	
//	Java'nın yalnızca statik olmayan iç sınıflarda örtülü bir referans oluşturacağını unutmayın. Bu nedenle, ihtiyacımız olan yerde ilişkiyi manuel olarak sürdürmemiz gerekiyor:
	class WheelC {
		CarC car;
	}

	class CarC {
	    List<WheelC> wheels;
	}

//	_Association_____
	
//	Java'da ilişkilendirmeyi toplamayla aynı şekilde modelleyebiliriz:
	class ChildA {}

	class MotherA {
	    List<ChildA> children;
	}
	
//	Peki bir referansın toplama ya da ilişkilendirme anlamına delip gelmediğini nasıl anlayabiliriz?
//	Anlayamayız. Nesneler arası ilişkide hangisinin diğerinin parçası olup olmadığı sadece mantıksaldır.
//	Ayrıca, toplamada yaptığımız gibi referansları her iki uçta da manuel olarak korumamız gerekiyor.
	class ChildB {
	    MotherB mother;
	}

	class MotherB {
	    List<ChildB> children;
	}
	
//	_Karmaşık bir örnek_____
	class University {
	    List<Department> department;   
	}

	class Department {
	    List<Professor> professors;
	}

	class Professor {
	    List<Department> department;
	    List<Professor> friends;
	}
	
}
