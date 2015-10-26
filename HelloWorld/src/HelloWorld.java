import java.io.IOException;

/**
 * 
 */

/**
 * @author Tobias
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2015 - how are you? :)");
		System.out.print("Please enter your name: ");
		
		byte buffer[] = new byte[80];  // Zeichenpuffer
	    String input = "";
		int read;
		try {
	          // Einlesen der Zeichen
	          read = System.in.read(buffer, 0, 80);
	          // Umwandeln des Pufferinhaltes in einen String
	          input = new String(buffer, 0, read);
	        }
	        catch(IOException e) {
	          e.printStackTrace();
	        }
		//name input;
		System.out.println("Hello " + input);
	}

}
