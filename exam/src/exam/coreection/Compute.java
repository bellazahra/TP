package exam.coreection;

public class Compute {
	static void process(Integer a, Integer b) {
		System.out.println("process integer");
	}
 static void process (long a, long b) {
	 System.out.println("process long");
 }
 
 static void process(int... a) {
	 
	 System.out.println("process int...");
 }
}
