package testi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;

class X {
    String name;
    int size;
    double prize;
    
    X(String n, int s, double p) {
        name = n;
        size = s;
        prize = p;
    
    }
    public String getContent(String uri) {
    	URL url = null;
        String content = "";
		try {
			
		url = new URL(uri);
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(url.openStream()));
		
        String inputLine;
		while((inputLine = br.readLine()) != null) {
			    content += inputLine + "\n";
			}
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return content;
    }
}


class A extends X {
    double weight;
    
    A(String n, int s, double p, double w) {
        super(n, s, p);
        weight = w;
    }

}

class B extends A implements Serializable {
    double lenght;
    
    B(String n, int s, double p, double w, double l) {
        super(n, s, p, w);
        lenght = l;
    }
    
    public double getUltimateValue() {
    	
    	System.out.println(size);
    	System.out.println(prize);
    	System.out.println(Math.sqrt(lenght));
        return size * prize / Math.sqrt(lenght);
    }
}

public class Mainclass {
	
 public static void main(String[] args) {
        X x = new X("Foobar", 10, 5.5);
        
        B b = new B("BooBoo", 12, 9.9, 7.2, 555.6);
        
        System.out.print(x.getContent("https://noppa.lut.fi/"));
        System.out.print(b.getUltimateValue());
        
    }
 
    
}


