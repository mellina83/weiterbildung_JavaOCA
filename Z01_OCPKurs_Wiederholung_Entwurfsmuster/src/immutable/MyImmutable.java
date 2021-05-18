package immutable;

import java.util.ArrayList;
import java.util.List;

public final class MyImmutable {

	private final int zahl;
	
	private final StringBuilder sb;
	private final List<StringBuilder> listOfStringBuilders;
	
	public int getZahl() {
		return zahl;
	}
	
	public StringBuilder getSb() {
		return new StringBuilder(sb.toString());
	}
	
	public List<StringBuilder> getListOfStringBuilders() {
		List<StringBuilder> copyList = new ArrayList<>();

		for (StringBuilder stringBuilder : this.listOfStringBuilders) {
			copyList.add(new StringBuilder(stringBuilder.toString()));
		}

		return copyList;
	}
	

	
	private MyImmutable() {
		this(new StringBuilder(), 5);
	}
	
	public MyImmutable(StringBuilder sb, int zahl) {
		this.sb = new StringBuilder(sb.toString());

		this.zahl = zahl;

		this.listOfStringBuilders = new ArrayList<>();
		this.listOfStringBuilders.add(new StringBuilder("1"));
		this.listOfStringBuilders.add(new StringBuilder("2"));
		this.listOfStringBuilders.add(new StringBuilder("3"));
		this.listOfStringBuilders.add(new StringBuilder("4"));
	}
	
	public MyImmutable(StringBuilder sb, int zahl, List<StringBuilder> listOfStringBuilder) {
		this.sb = new StringBuilder(sb.toString());
		this.zahl = zahl;

		/**
		 * Hier wird der Inhalt der übergebenen Liste Kopiert und in unser Attribut
		 * überführt.
		 */
		List<StringBuilder> copyList = new ArrayList<>();
		for (StringBuilder stringBuilder : listOfStringBuilder) {
			copyList.add(new StringBuilder(stringBuilder.toString()));
		}
		this.listOfStringBuilders = copyList;
	}
}
