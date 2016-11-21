/**
* An old phone that can only make calls
*/
public class OldPhone implements Phone {
	/**
	 * Call a number
	 *
	 * @param number the number to be called
	 */
	public void call(String number) {
		System.out.println("Calling " + number + "...");
	}
}