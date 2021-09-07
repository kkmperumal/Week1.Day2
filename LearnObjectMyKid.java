package week1.day2;

public class LearnObjectMyKid {

	
	public static void main(String[] args) {
		LearnObjectsMyMobile kidObj = new LearnObjectsMyMobile();
		System.out.println("cost is " + kidObj.cost);
		System.out.println("brandName is " + kidObj.brandName);
		kidObj.makeCalls();
		kidObj.sendMsg();
	}
}
