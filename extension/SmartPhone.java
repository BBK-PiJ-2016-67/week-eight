/**
 * A smart phone that can do a whole bunch of stuff
 */
public class SmartPhone extends MobilePhone {
	/**
	 * Browse the web
	 *
	 * @param url a url to browse
	 */
	public void browseWeb(String url) {
		System.out.println("Just browsin' " + url);
		return;
	}
	/**
	 * Get the user's GPS coordinates
	 */
	public Point findPosition() {
		return new Point(10, 20);
	}
}