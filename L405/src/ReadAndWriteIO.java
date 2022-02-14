//Jesse Mustonen, 0541805, 28.1.2020
//Lähteet: Lähteessä kerrottiin kuinka zipataan tiedosto niin tunzippaus toimii päinvastaiseen tapaan .https://www.baeldung.com/java-compress-and-uncompress * kohta joissa tarvittu. 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ReadAndWriteIO {

    public  void readAndWrite(String s) {
    	int pituus;
        
        try {
        	//Unzipataa alkuperäinen tiedosto
            FileInputStream inputti = new FileInputStream(s);
            ZipInputStream zipinput = new ZipInputStream(inputti);
            ZipEntry tiedosto = zipinput.getNextEntry();
            File unzipattu = new File("input.txt");//*tässä kohtaa tarvittu
            FileOutputStream output = new FileOutputStream(unzipattu);
           
            long koko = tiedosto.getSize(); //otetaan ziptiedoston koko. Apuna käytetty piazzan muiden oppilaiden kysymyksiä
            byte[] bufferi = new byte[(int) koko];
            while ((pituus = zipinput.read(bufferi)) >= 0) {
            	output.write(bufferi, 0, pituus);
            }
            output.close();
           
            inputti.close();
           readFile("input.txt");
        } catch (IOException b) {
            b.printStackTrace();
        }
        
    }
    public  void readFile(String s) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new FileReader(s));
			String output;
			
			try {
				while ((output = br.readLine()) != null) {
					System.out.println(output);
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException ex) {
			Logger.getLogger(ReadAndWriteIO.class.getName()).log(Level.SEVERE, null, ex);

			
		}
		}
}
