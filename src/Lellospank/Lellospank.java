package Lellospank;


public class Lellospank {

	private static FlukaClass flukaInstance;
	public static void main(String[] args) {
		flukaInstance = new FlukaClass();
		System.out.println("Proprio lui");
		System.out.println("Grazie Mario by Carlo");
		System.out.println(flukaInstance.flukaString());
	}

}
