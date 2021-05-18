package aggregation;

public class Schulungsraum {
	public PC[] pcs = new PC[3];//null,null,null
	public Monitor[] monitore = new Monitor[3];//null,null,null
	
	public void addPC(PC pc) {
		for (int i = 0; i < pcs.length; i++) {
			if(pcs[i]==null) {
				pcs[i]= pc;
				break;
			}
		}
	}
	
	public void addMonitor(Monitor monitor) {
		for (int i = 0; i < monitore.length; i++) {
			if(monitore[i]==null) {
				monitore[i]= monitor;
				break;
			}
		}
	}
}
