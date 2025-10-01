package StreamApp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterByFive {

	public static void main(String[] args) {
		 // Step 1: Create the list
	    List<Integer> numbers = new ArrayList<>();
	    numbers.add(1);
	    numbers.add(4);
	    numbers.add(5);
	    numbers.add(20);
	    numbers.add(30);
	    numbers.add(6);

	    List<Integer> divisibleByFive = numbers.stream()
	            .filter(n -> n % 5 == 0)
	            .collect(Collectors.toList());
	   
	    System.out.println("Numbers divisible by 5: " + divisibleByFive);

	}

}
