
public class IntegerItem extends GenericItem{
	private int value;
	
	public IntegerItem(){
		this.value = 0;  
	}
	
	public IntegerItem(int value){
		this.value = value; 
	}
	
	public boolean isLess(GenericItem gi){
		if(this.value < ((IntegerItem) gi).get()){
			return true; 
		} else
			return false; 
	};
	
	public boolean isEqual(GenericItem gi){
		if(this.equals(gi)){
			return true;
		} else
			return false;
	};
	
	public boolean isGreater(GenericItem gi){
		if(this.value > ((IntegerItem) gi).get()){
			return true;
		} else
			return false; 
	};
	
	public int get(){
		return value; 
	}
	
	public void set(int value){
		this.value = value; 
	}
}
