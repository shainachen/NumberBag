import java.util.ArrayList;

public class NumberBag {
	private ArrayList<Integer> list;
	private int maxValue;
	
	public NumberBag(int max){
		list=new ArrayList<Integer>();
		maxValue=max;
	}
	
	public void add(int n) {
		list.add(n);
	}
}