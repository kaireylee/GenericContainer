
public abstract class GenericItem {
	//three abstract methods used for sorting
	public abstract boolean isLess(GenericItem gi);
	public abstract boolean isEqual(GenericItem gi);
	public abstract boolean isGreater(GenericItem gi);
}
