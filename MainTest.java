import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class MainTest{
	static int commandcount=0,commandcode=0,loopcounter=0,element=0;
	static String command="";
	static String[] commandarr;
	

	public static void main(String args[]){

		Scanner scan=new Scanner(System.in);
		commandcount= scan.nextInt();
		queue ob= new queue();  //initialize queue

		do{
			loopcounter++;

			Scanner scann=new Scanner(System.in);
			command= scann.nextLine();

			//if input command has multiple values, look for whitespace

			Pattern pattern = Pattern.compile("\\s");
			Matcher matcher = pattern.matcher(command);

			if(matcher.find()){ //whitespace exists so command has multiple values
				commandarr= command.split(" "); //split input command into command code and element
				commandcode= Integer.parseInt(commandarr[0]);
				element= Integer.parseInt(commandarr[1]);
			}

			else{
				commandcode= Integer.parseInt(command);
			}
			
			//executing commands
			if(commandcode==1)
				ob.enqueue(element);
			else if(commandcode==2)
				ob.dequeue();
			else if(commandcode==3)
				ob.print();
			else
				System.out.println("Invalid command code!!");

		}while(loopcounter!=commandcount);

	}
}
