/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5ex9;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author terror
 */
public class P5ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
         FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("input.rtf");
            out = new FileOutputStream("output.rtf");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }// TODO code application logic here
    }
    
}
