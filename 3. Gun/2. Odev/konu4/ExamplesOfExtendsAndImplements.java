package Konular.konu4;

public class ExamplesOfExtendsAndImplements {
	public abstract class AbstractClass {
	}

	public class ExtendClass extends AbstractClass {
	}

	public interface BaseInterface {
	}

	public interface OtherInterface {
	}

	public interface ExtendInterface extends BaseInterface {
	}

	public class ExtendAndImplementClass extends ExtendClass implements ExtendInterface, OtherInterface {
	}
}
