package Konular.konu8.PermitsInheritances;

public class ExamplesOfPermitsInheritances {

	public sealed class PermitsSubClass extends ExamplesOfBase {

	}

	public final class PermitsSubClass2 extends PermitsSubClass {

	}

//	public class NonPermitsSubClass extends ExamplesOfBase{	} // Kalıtım almak için İzinsiz bir sınıf
}
