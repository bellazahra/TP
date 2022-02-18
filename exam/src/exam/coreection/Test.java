package exam.coreection;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Integer>numbers= Arrays.asList(2,3,4);
		numbers.stream().map(i->3*i).map(i->i*i).filter(i->i%2== 0)
		.forEach(i-> System.out.println(i));
	}

}
