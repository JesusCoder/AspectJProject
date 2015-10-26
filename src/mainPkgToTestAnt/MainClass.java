/**
 * 
 */
package mainPkgToTestAnt;

/**
 * This is a class to test if build.xml does generate a "target" in build.xml as
 * long as there is a "main" method inside that class.
 * 
 * NO, it turns out that when I click export to Ant build.xml, it doesn't
 * auto-generate a target if there is a main method inside this class. But,
 * instead, I manually wrote this target in build.xml, and it did work out!
 * Cool!
 * 
 * @author SteveSun
 *
 */
public class MainClass {

	/**
	 * 
	 */
	public MainClass() {
	}

	/**
	 * @param args
	 */
	public static void main(String... args) {
		System.out.println("Cool! Ant does work.");
		System.out.println("The end.");
	}

}
