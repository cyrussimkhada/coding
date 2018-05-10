package corejava;

public class AddTwoNumbers {
	private int a;
	private int b;
	
	
	public void showSum(int a, int b) {
		this.a = a;
		this.b = b;
		int sum = a + b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		AddTwoNumbers add = new AddTwoNumbers();
		add.showSum(6, 3);
		AddTwoNumbers add1 = new AddTwoNumbers();
		add1.showSum(5, 21);
		AddTwoNumbers add2 = new AddTwoNumbers();
		add2.showSum(6, 22);
		

	}

}
