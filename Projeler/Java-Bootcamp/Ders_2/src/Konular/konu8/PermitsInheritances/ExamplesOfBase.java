package Konular.konu8.PermitsInheritances;

import Konular.konu8.PermitsInheritances.ExamplesOfPermitsInheritances.PermitsSubClass;

public sealed class ExamplesOfBase permits PermitsSubClass {
	public static void main(String[] args) {
		System.out.println("Bu Sınıf sealed belirteci ile mühürlüdür ve sadece permits belirteci ile özel izinli sınıflara miras verir");
	}
}
