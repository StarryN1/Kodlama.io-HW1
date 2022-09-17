
public class sesliHarfler {

	public static void main(String[] args) {

	char harf= 'E';	 
	char[] kalınSesliHarfler= {'A', 'I', 'O', 'U'};
	char[] inceSesliHarfler= {'E','İ','Ö','Ü'};
	boolean sesliMi=true;
	
	for(char kalınSes: kalınSesliHarfler) {
		if(harf== kalınSes){
			sesliMi=true;
			break;
		}
	}
	
	for(char inceSes: inceSesliHarfler) {
		if(harf== inceSes){
			sesliMi=true;
			break;
		}
	}
	
	if (sesliMi) {
		System.out.println(harf+ " kalın sesli harftir.");
	}else {
		System.out.println(harf+ " ince sesli harftir.");
	}
//	for(int i=0;i<4; i++) {
//		if( harf==kalınSesliHarfler[i]) {
//		System.out.println(harf+ " kalın sesli harftir.");
//	} else if(harf==inceSesliHarfler[i]) {
//		System.out.println(harf+ " ince sesli haftir.");
//	} else {
//		System.out.println("Yeni harf giriniz.");
//	}
//
//
//	}
System.out.println("-------------------------------------");

//		char harf = 'Z';
//
//		switch (harf) {
//		case 'A':
//		case 'I':
//		case 'O':
//		case 'U':
//			System.out.println("Kalın sesli harf");
//			break;
//		default:
//			System.out.println("İnce sesli harf");
//
//		}

	}

}
