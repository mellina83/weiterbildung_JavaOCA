package classes_classes;

/*
 * Garbage Collector (GC) ist ein Unterprozess der JVM.
 * Seine Aufgabe ist immer wieder die Objekte zu sammeln und 'löschen' auf die es
 * keine Referenz auf dem Stack oder im statischen Bereich gibt.
 */

class Computer {
	CPU cpu;
}

class CPU {
}

public class B06_GarbageCollector {

	// String[] args wird im weiteren ignoriert
	public static void main(String[] args) {

		Computer comp; // <- kein Objekt!
		
		// Angenommen wird in der Zeile A die main kurz angehalten.
		// Während dessen startet der GC das Sammeln der unerreichbaren Objekte.
		// Frage: wie viele unerreichbare Java-Objekte stehen dann dem GC zur Verfügung?
		
		// Zeile A: 		keine Objekte für GC
		
		new CPU();
		
		// Zeile B: 		1 Objekt für GC
		
		// Angenommen der GC hat bisher alle freien Objekte gesammet. 
		// Also: das CPU-Objekt wurde 'gelöscht'.
		// Weiter...
		
		comp = new Computer();
		comp.cpu = new CPU();
		System.out.println(comp.cpu);
		
		// Zeile C: 		0 Objekte für GC 
		
		comp = null;
		
		// Zeile D: 		2 Objekte für GC 
		
		/*
		 * System.gc() - Versuch (ohne Garantie) den GC zum Sammeln der freien Objekte anzustoßen
		 * 
		 * When control returns from the method call, the Java VirtualMachine 
		 * has made a best effort to reclaim space from all discarded objects. 
		 */
		System.gc();
		
	} 

}
