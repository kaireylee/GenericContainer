
public class StringItem extends GenericItem{
	private String value;
	
	public StringItem(){
		this.value = new String("");  
	}
	
	public StringItem(String value){
		this.value = new String(value); 
	}
	
	public StringItem(char value){
		this.value = new String(Character.toString(value));
	}
	
	public boolean isLess(GenericItem gi){
		return (this.value.compareTo(((StringItem) gi).get()) < 0);
	}
	
	public boolean isEqual(GenericItem gi){
		if(this.equals(gi)){
			return true;
		} else
			return false;
	}
	
	public boolean isGreater(GenericItem gi){
		return (this.value.compareTo(((StringItem) gi).get()) > 0);
	}

	public String get(){
		return value; 
	}
	
	public void set(String value){
		this.value = value; 
	}
}
