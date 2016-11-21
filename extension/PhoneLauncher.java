public class PhoneLauncher {
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch() {
		SmartPhone iPhone = new SmartPhone("iPhone 6S");
		
		for (int i = 0; i < 11; i++) {
			iPhone.call("0800" + String.valueOf(i));
		}
		
		iPhone.call("00302332");
		
		iPhone.printLastNumbers();
		
		iPhone.ringAlarm("10:00AM");
		iPhone.playGame("9");
		iPhone.browseWeb("www.google.com");
		
		System.out.println("The brand of my phone is " + iPhone.getBrand());
		
		Point location = iPhone.findPosition();
		System.out.println("I am at x:" + String.valueOf(location.getX()) + " y:" + String.valueOf(location.getY()));
	}
}