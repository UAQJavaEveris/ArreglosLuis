package mx.com.everis.tallerjava.arreglos;

public class ArregloSuma {

	public static void main(String args[]){
		int valores []={1,2,3,4,5};
		int valores2 []={1,2,3,4,5};
		int suma1 = 0,suma2=0;
		
		for(int i: valores){
			suma1+=i;
		}
		
		for(int j=valores2.length-1; j>=0;j--){
			suma2+=valores2[j];
		}
		System.out.println("suma1 = "+ suma1);
		System.out.println("suma2 = "+ suma2);		
		
	}
}
