package aca;

public class App {
	public String concatenate(String one, String two) {
		return one + two;
	}

	public String amethod(String a, Integer b) throws NullPointerException, NumberFormatException {
		int i = Integer.parseInt(a);
		Integer c = b + (Integer)i;
		String d = c.toString();;
		return d;
	}
}
