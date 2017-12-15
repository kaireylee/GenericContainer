
public class GenericContainerQuickSort extends GenericContainer{
	public void sort(int left, int right){
		int i, j; //left and right indicators 
		GenericItem temp;  //temporary employee 
		i = left;
		j = right;
		temp = this.collection.get((left+right)/2);//item is middle pivot
		while(i <= j){
			while((temp.isGreater(this.collection.get(i)) == true) && (i < right)){ 
				i++;
			}
			while((temp.isLess(this.collection.get(j)) == true) && (j > left)) {
				j--;
			}
			if(i <= j) {
				temp = this.collection.get(i);
				this.collection.set(i ,this.collection.get(j));
				this.collection.set(j ,temp);
				i++;
				j--;
			}
		}
		
		if(left < j){
			sort(left, j);
		}
		if(i < right){
			sort(i, right);
		}
	}

}
