
public class GenericContainerInsertion extends GenericContainer{
	public void sort(){
		int i, j;
		GenericItem temp;
		for(i = 1; i < collection.size(); i++){
			temp = collection.get(i); 
			j = i-1;
			
			while(j >= 0 && collection.get(j).isGreater(temp)){
				collection.set(j+1, collection.get(j));
				j = j-1;
			}
			collection.set(j+1, temp);
		}
	}

}
