import java.util.ArrayList;
import java.util.Collections;
import java.text.DecimalFormat;

public class Median{
	
	ArrayList<Integer> dataset;
	Integer midpoint,setsize,settype;
	double median;
	DecimalFormat df; //for printing two digits after decimal point in result

	Median(){

		dataset= new ArrayList<Integer>();
		midpoint=-1;
		settype=-1; //default
		setsize=dataset.size();	
		median=0.0;
		df= new DecimalFormat("#.00");
	} 

	public void addElement(Integer element){

		dataset.add(element);
		Collections.sort(dataset); //sort dataset
		setsize= dataset.size();
		settype= checkSet(setsize);
		median= computeMedian(settype);
		printMedian();
	}

	public Integer checkSet(Integer size){

		if(size%2==0) //even elements
			return 1;
		else 			//odd elements
			return 0;
	}

	public double computeMedian(Integer type){

		double median=0.0;

		if(type==0){ //odd 
			midpoint= (setsize+1)/2;
			median= dataset.get(midpoint-1);
		}

		else{   //even
			
			//taking average of two mid points
			int firstmp= dataset.get(setsize/2);
			int secondmp= dataset.get((setsize/2)-1);
			median= (firstmp+secondmp)/2.0;
		}

		return median;

	}

	public void printMedian(){
		System.out.println(df.format(median));
	}
}