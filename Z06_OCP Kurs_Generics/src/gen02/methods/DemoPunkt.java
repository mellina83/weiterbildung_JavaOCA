package gen02.methods;

public class DemoPunkt {

	public static void main(String[] args) {
//		PunktGenUtils<Integer> utility = new PunktGenUtils<>();
//		utility.erzeugePunkt().getX();

		PunktGen<String> p01 = PunktGenUtils.createPunktGen("", "");
		PunktGen<Integer> p02 = PunktGenUtils.createPunktGen(1, 2);
		PunktGen<Double> p03 = PunktGenUtils.createPunktGen(1.0, 2.0);
		PunktGen<StringBuilder> p04 = PunktGenUtils
				.createPunktGen(new StringBuilder("SB01"), new StringBuilder("SB02"));
		System.out.println(p01.getX().getClass());
		System.out.println(p02.getX().getClass());
		System.out.println(p03.getX().getClass());
		System.out.println(p04.getX().getClass());
		
		System.out.println("*****");
		PunktGen<Integer> sb01 = new PunktGen<>(42, 64);
		PunktGen<Integer> sb02 = new PunktGen<>(84, 23);
		System.out.println("sb01 " + sb01);
		System.out.println("sb02 " + sb02);
		PunktGenUtils.switchPoints(sb01, sb02);
		System.out.println("sb01 " + sb01);
		System.out.println("sb02 " + sb02);
		System.out.println(sb01.getX().getClass());//Integer
		
		
		System.out.println("*****");
		PunktGenUtils.ausgeben(sb01, sb02);
		
		System.out.println("*****");
		PunktGen<Integer> pg01 = new PunktGen<>(1,1);
		PunktGen<Double> pg02 = new PunktGen<>(2.0,2.0);
		PunktGen<String> pg03 = new PunktGen<>("s3","s3");
		PunktGen<Float> pg04 = new PunktGen<>(4f,4f);

		PunktGenUtils.alleAusgeben(pg01,pg02,pg03,pg04);
		
	}

}







