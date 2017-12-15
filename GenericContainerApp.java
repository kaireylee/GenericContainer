
public class GenericContainerApp {
	public static void main(String[] args)
	{
	  GenericContainer gc = new GenericContainer(); 
	  GenericContainer gc2 = new GenericContainer();
	  
	  for(int i = 100; i > 0; i--){
		  if(i%13 == 0){
			  IntegerItem temp = new IntegerItem(i); 
			  gc.add(temp);
		  }
	  }
	  
	  
	  for(char ch = 'z'; ch > 'a'-1; ch--){
		  StringItem s = new StringItem(ch);
		  gc2.add(s);
	  }
	  
	  IntegerItem x = (IntegerItem) gc.collection.get(0); 
	 
	  System.out.println("Integer Search Test Before Sort: position 0"); 
	  printCollectionInteger(gc);
	  gc.sort();
	  gc.index = 0; 
	  System.out.println("Integer Search Test After Sort: position " + gc.search(x)); 
	  printCollectionInteger(gc); 
	  
	  StringItem y = (StringItem) gc2.collection.get(7); 
	  System.out.println("String Search Test Before Sort: postion 7");
	  printCollectionString(gc2);
	  gc2.sort();
	  gc2.index = 0;
	  System.out.println("String Search Test After Sort: postion " + gc2.search(y));
	  printCollectionString(gc2); 
	  
	}
	
	public static void printCollectionInteger(GenericContainer gc){
		while(gc.iterate_hasNext()){
			  IntegerItem next = (IntegerItem )(gc.iterate_getNext());
			  System.out.print(next.get());
			  System.out.print("  ");
			  if(!(gc.iterate_hasNext())){
				  System.out.printf("\n\n");
			  }
		  }
	}
	
	public static void printCollectionString(GenericContainer gc){
		while(gc.iterate_hasNext()){
			  StringItem next = (StringItem )(gc.iterate_getNext());
			  System.out.print(next.get());
			  System.out.print("  ");
			  if(!(gc.iterate_hasNext())){
				  System.out.printf("\n\n");
			  }
		  }
	}
}
