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

public class juu {

    public static void main(String[] args) {
        String zipFilePath = "zipinput.zip";
        unzip(zipFilePath);
    }

    private static void unzip(String zipFilePath) {
        FileInputStream fis;
        //buffer for read and write data to file
        byte[] bufferi = new byte[1024];
        try {
            fis = new FileInputStream(zipFilePath);
            ZipInputStream zis = new ZipInputStream(fis);
            ZipEntry ze = zis.getNextEntry();
            while(ze != null){
                String fileName = ze.getName();
                File newFile = new File("input.txt");
                System.out.println("Unzipping to "+newFile.getAbsolutePath());

                FileOutputStream fos = new FileOutputStream(newFile);
                int len;
                while ((len = zis.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
                }
                fos.close();
                //close this ZipEntry
                zis.closeEntry();
                ze = zis.getNextEntry();
            }
            //close last ZipEntry
            zis.closeEntry();
            zis.close();
            fis.close();
            readFile("input.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    public static void readFile(String s) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new FileReader(s));
			String output = "";
			
			try {
				while ((output = br.readLine()) != null) {
					//System.out.println( System.getProperty( "user.dir" ) );
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
			Logger.getLogger(juu.class.getName()).log(Level.SEVERE, null, ex);

			
		}
		}
}
