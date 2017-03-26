import java.util.Scanner;

class MedianTest{
	
	static int commandcount=0,loopcounter=0,element=0;

	public static void main(String args[]){

		Scanner scan=new Scanner(System.in);
		commandcount= scan.nextInt();
		Median m= new Median(); //initialize median class

		do{

			loopcounter++;
			Scanner scann=new Scanner(System.in);
			element= scann.nextInt(); //input element for computing median
			m.addElement(element);

		}while(loopcounter!=commandcount);

	}
}
