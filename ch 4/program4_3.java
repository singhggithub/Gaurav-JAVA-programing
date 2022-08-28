public class program4_3 {

	public static void main(String[] args) {
		
		int p = 1; 
		System.out.println("screen display");
		for(int i =1; i<= 9; i++) {  // pyramid ka shape bana raha
			
			for(int j = 1; j<= i;j++) {  // integers pyramid ma print kar raa
			System.out.print(" ");  // to add space between integers
			System.out.print(p++);
			
		}
		System.out.println("");     //  to change line by println 
		}
		System.out.println("screen display done");
	}

}
