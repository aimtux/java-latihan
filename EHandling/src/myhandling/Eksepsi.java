package myhandling;

public class Eksepsi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			System.out.println(args[1]); 
		}catch(ArrayIndexOutOfBoundsException exp ){
			System.out.println("Error Melebihi Kapasitas yang di tentukan...!!");
		}
	}

}
