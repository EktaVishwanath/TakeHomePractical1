package practical1;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;
public class GenerateRandom500 {
	
	public static void main(String[] args) {
		
		Set<Integer> mySet = new TreeSet<Integer>();
		
		while( mySet.size() !=500) {
			mySet.add(ThreadLocalRandom.current().nextInt(50, 5000 + 1));	
		}
		System.out.println(mySet);
		System.out.println(mySet.size());
		Object[] mySetArray = mySet.toArray();
		System.out.println(mySetArray[0]);
	} 
	
	

}
