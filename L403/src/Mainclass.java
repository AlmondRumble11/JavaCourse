import java.io.FileNotFoundException;

public class Mainclass {

	public static void main(String[] args) {
		ReadAndWriteIO rawio = new ReadAndWriteIO();
		System.out.println( System.getProperty( "user.dir" ) );
		try {
			rawio.readAndWrite("input.txt", "output.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
