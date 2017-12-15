import java.util.ArrayList;

public class GenericContainer {
	public ArrayList<GenericItem> collection;
	public int index; 
	
	public GenericContainer(){
		index = 0;
		collection = new ArrayList<GenericItem>();
	}
	
	public GenericContainer(GenericContainer gc){
		this.index = gc.index;
		this.collection = gc.collection; 
	}
	
	public void add(GenericItem gi){
		collection.add(gi); 
	}
	
	public void remove(GenericItem gi){
		if(search(gi) != -1)
			collection.remove(search(gi)); 
	}
	
	public int search(GenericItem gi){
		int start = 0; 
		int end = collection.size()-1;
		
		while(start <= end){
			int mid = (start + end)/2; 
			if(collection.get(mid) == gi){
				return mid; 
			}
			if (gi.isLess(collection.get(mid))){
				end = mid - 1; 
			} else {
				start = mid + 1;
			}
		}
		return -1; 
	}
	
	public void sort(){
		int outer, inner; 
		int length = collection.size(); 
		for(outer = 0; outer < length; outer++){
			for(inner = 0; inner < length-1; inner++){
				if(collection.get(inner).isGreater(collection.get(inner+1))){
					GenericItem temp = collection.get(inner);
					collection.set(inner, collection.get(inner+1));
					collection.set(inner+1, temp); 
				}
			}
		}
	}
	
	public boolean iterate_hasNext(){
		return index <= collection.size()-1; 
	}
	
	public GenericItem iterate_getNext(){
		return collection.get(index++);
	}

}
