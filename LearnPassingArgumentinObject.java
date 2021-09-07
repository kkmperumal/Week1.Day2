package week1.day2;

public class LearnPassingArgumentinObject {

	public int sum() {
		// TODO Auto-generated method stub
int a=100;
int b=100;
int add=a+b;
return add;
	}
	public void getsum(int sum) {
		// TODO Auto-generated method stub
System.out.println("print Sum from the previous Method " + sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnPassingArgumentinObject sumObj = new LearnPassingArgumentinObject();
		int sumReturn = sumObj.sum();
		sumObj.getsum(sumReturn);
	}
}