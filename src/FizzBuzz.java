
public class FizzBuzz {
	public static void main(String[] args) {
		for (int rep = 1; rep <= 100; rep++){
			String output;
			if (rep % 3 == 0 && rep % 5 == 0) output = "FizzBuzz!";
			else if (rep % 3 == 0) output = "Fizz";
			else if (rep % 5 == 0) output = "Buzz";
			else output = "" + rep;
			System.out.println(output);
		}
	}
}
