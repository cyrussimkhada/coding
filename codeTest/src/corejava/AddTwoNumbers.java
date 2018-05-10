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
		add.showSum(2, 3);
		

	}

}
