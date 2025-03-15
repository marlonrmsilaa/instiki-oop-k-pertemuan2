package pertemuan2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author marlon
 */

public class Pertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama = "Marlon";
        String nim = "2301010013";
        double ipk = 3.98;
        
        BufferedReader dtain = new BufferedReader(new InputStreamReader(System.in) );
        
        System.out.print("Input nama mahasiswa: ");
        try{
            nama = dtain.readLine();
        }catch(IOException e){
            System.out.println("Error pembacaan data");
        }
        
        System.out.print("Input nim mahasiswa: ");
        try{
            nim = dtain.readLine();
        }catch(IOException e){
            System.out.println("Error pembacaan data");
        }
        
        System.out.print("Input IPK mahasiswa: ");
        try{
            ipk = Double.parseDouble(dtain.readLine());
        }catch(IOException e){
            System.out.println("Error pembacaan data");
        }
        
        System.out.print(nama);
        System.out.println(nim);
        
        System.out.printf("Nama saya %s dengan nim %s dengan IPK %.2f", nama, nim, ipk);
    }
}
