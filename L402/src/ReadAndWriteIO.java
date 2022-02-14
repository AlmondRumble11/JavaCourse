import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ReadAndWriteIO {
	public void readAndWrite(String s, String a) throws FileNotFoundException {
		try {
			BufferedReader br = new BufferedReader(new FileReader(s));
			BufferedWriter bw = new BufferedWriter(new FileWriter (a));
			String output = br.readLine(); 
			try {
				
				while (output != null) {
					bw.write(output);
					bw.newLine();
					output = br.readLine(); 
					}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				bw.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException ex) {
			Logger.getLogger(ReadAndWriteIO.class.getName()).log(Level.SEVERE, null, ex);	
		}
	}
}

