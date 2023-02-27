package util;

public class Bill {

	public char gender;
	public  int beer;
	public int softDrink;
	public int barbecue;

	public double feeding() {

		return (5 * beer + 3 * softDrink + 7 * barbecue);

	}

	public double cover() {

		if (feeding() > 30.00) {
			return  0;
		} else {
			return 4.00;
		}

	}

	public double ticket() {

		if (gender == 'M') {
			return 10.00;
		} else {
			return 8.00;

		}
	}

	public double total() {

		return (feeding() + cover() + ticket());

	}
};
