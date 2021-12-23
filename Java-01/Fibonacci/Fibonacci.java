import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public static List<Integer> fibonacci() {
        ArrayList<Integer> list = new ArrayList<>();

        int previous = 0;
        int current = 1;

        list.add(previous);
        list.add(current);

        while (current < 350) {
            list.add(previous + current);
            current = previous + current;
            previous = current - previous;
        }

        return list;
	}

	public static Boolean isFibonacci(Integer a) {
		boolean result = fibonacci().contains(a);
    return result;
	}

}
