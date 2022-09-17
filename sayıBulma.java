
public class sayıBulma {

	public static void main(String[] args) {
		int[] sayılar=new int[] {1,2,5,7,9,0};
		int aranacak= 24;
		boolean varMı=false;
//		for(int i=0; i<=5;i++) {
//			if(aranacak==sayılar[i]) {
//				System.out.println(aranacak+ " sayıların bir elemanıdır.");
//			} else {
//				System.out.println(aranacak+ " sayıların bir elemanı değildir.");
//			}
//		}
		
		for(int sayı:sayılar) {
			if(aranacak==sayı) {
				varMı= true;
				break;
			}
			
		}
		
		if(varMı) {
			System.out.println(aranacak+ " sayıların bir elemanıdır.");
		}else {
			System.out.println(aranacak+ " sayıların bir elemanı değildir.");
		}
	}

}
 