package week1.day2;

public class LearnObjectsMyMobile {
//Properties,Variable,State
	float screenSize;
	int cost = 20000;
	char logo;
	float amps = 1.8f;
	long mobileNumber;
	boolean isTouchScreen;
	String brandName = "Samsung";

	// Actions,Behavior,Methods
	public void makeCalls() {
		// TODO Auto-generated method stub
		System.out.println("Making Calls");
	}

	// Syntax
	// AccessSpecifier returnType methodName arguments {Method Body}
	// AccessSpecifier -public(accessed by all the
	// members),protected,default,private(accessed within the class only)
	public void sendMsg() {
		// TODO Auto-generated method stub
		System.out.println("Sending Message");

	}

	private void payBills() {
		// TODO Auto-generated method stub
		System.out.println("Paying Bills");
	}

	public int gettingCost() {
		// TODO Auto-generated method stub
		return cost;
	}

	public String sendingSMS() {
		String msg = "Hi";
		return msg;
	}

	public void printSms(String str) {
		// TODO Auto-generated method stub
		System.out.println("Printing SMS from the method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Method could be accessed only by creating an object
		// Syntax - ClassName objectname = new ClassName();
		LearnObjectsMyMobile samsung = new LearnObjectsMyMobile();
		String brandNameSam = samsung.brandName;
		int costSam = samsung.cost;
		float ampsSam = samsung.amps;
		String sms = samsung.sendingSMS();
		float getCost = samsung.gettingCost();
		System.out.println("BrandName is " + brandNameSam);
		System.out.println("Cost of the Samsung model is " + costSam);
		System.out.println("Amps of the Samsung model is " + ampsSam);
		samsung.makeCalls();
		samsung.sendMsg();
		samsung.payBills();
		samsung.printSms(sms);
		System.out.println("Cost from the Method is " + getCost);
		System.out.println("Sending SMS from the Method: " + sms);

	}

}
