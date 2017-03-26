import java.util.ArrayList;

public class queue{
	
	private int total,head,tail;
	private ArrayList<Integer> itemList;

	queue(){

		//initializing variables

		itemList= new ArrayList<Integer>();
		total=itemList.size();
		head=-1; //head position in arraylist
		tail=itemList.size()-1;
		
	}

	public void put(int element){
		
		if(itemList.isEmpty()) //first run
			head=0;

		itemList.add(element); //add element to queue

		//update counters
		tail++; 
		total++;
		
	}

	public void pop(){

		if(!itemList.isEmpty()){
			itemList.remove(head);

			//update counters
			if(itemList.isEmpty())
				head=-1;

			total--;
			tail= itemList.size()-1;
			
		}

		else
		{
			System.out.println("No items to delete. Please insert some items first!");
		}
	}

	public void peek(){
		System.out.println(""+itemList.get(head));
	}



}
