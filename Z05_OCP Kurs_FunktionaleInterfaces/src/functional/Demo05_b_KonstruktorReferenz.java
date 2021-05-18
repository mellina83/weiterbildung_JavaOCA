package functional;

interface PersonSupplier {
	public abstract Person get();
}

interface PersonSupplierByAge {
	public abstract Person get(int age);
}

interface PersonFullSupplier {
	public abstract Person get(String name,int age);
}

public class Demo05_b_KonstruktorReferenz {

	public static void main(String[] args) {

		PersonSupplier ps = Person::new;
		PersonSupplierByAge psba01 = (int age) -> {
			Person p = new Person();
			p.setAge(age);
			return p;
		};
		PersonSupplierByAge psba02 = Person::new;

		PersonFullSupplier pfs = Person::new;
		
		Person p01 = ps.get();

		p01.setName("Christian");

		System.out.println(p01.getName());

		System.out.println(psba02.get(32).getAge());
	}

}
