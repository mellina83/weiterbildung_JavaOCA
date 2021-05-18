package builder;

public class Bauernhof {

	public static void main(String[] args) {
		Schaf.SchafBuilder ssb = new Schaf.SchafBuilder();
		
		ssb.name("Henry").wollfarbe("gruen").wollqualitaet(10.0);
		
		Schaf s01 = ssb.alter(5).build();
		Schaf s02 = ssb.alter(4).build();
		Schaf s03 = ssb.alter(99).build();
		
		System.out.println(s01.hashCode());
		System.out.println(s02.hashCode());
		System.out.println(s03.hashCode());
		System.out.println(s01);
		System.out.println(s02);
		System.out.println(s03);
	}

}
