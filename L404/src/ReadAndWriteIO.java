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
					if ((output.length() < 30) && (output.length() != 0) && (output.trim().isBlank() == false)) {
						if (output.contains("v") == true) {
							bw.write(output);
							bw.newLine();
							System.out.println(output);
							output = br.readLine(); 
						}
						else {
							output = br.readLine();
							System.out.println(output);
						}
					}
					else {
						output = br.readLine();
						
						System.out.println(output+"meni ohi");
						
					}
			
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				bw.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException ex) {
			Logger.getLogger(ReadAndWriteIO.class.getName()).log(Level.SEVERE, null, ex);	
		}
	}
}

