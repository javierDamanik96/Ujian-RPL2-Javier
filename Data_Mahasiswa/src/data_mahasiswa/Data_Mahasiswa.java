package data_mahasiswa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Data_Mahasiswa {
    public static void main(String[] args) {
    List<mahasiswa_masuk> daftarmahasiswa = new ArrayList<>(); 
    Scanner input = new Scanner(System.in);
    
    while (true) {
       System.out.println("Tambah Data Mahasiswa Baru (y/n): "); 
       String jawaban = input.nextLine();
       
        if (jawaban.equalsIgnoreCase("n")) {
          break; 
        }
        
        System.out.print ("Nama: ");
        String nama = input.nextLine();
        
        System.out.print ("NIM: ");
        int nim = input.nextInt();
        
        System.out.print ("Kelas: "); 
        String kelas = input.nextLine(); 
        input.nextLine();
        
        System.out.print ("Nama Mata Kuliah : "); 
        String matkul = input.nextLine(); 
        input.nextLine();
        
        System.out.print ("Kode Mata Kuliah : "); 
        String kodematkul = input.nextLine(); 
        input.nextLine();
        
        mahasiswa_masuk mahasiswa = new mahasiswa_masuk (nama, nim, kelas, matkul, kodematkul); 
        daftarmahasiswa.add (mahasiswa);
        
    }   
    System.out.println("Mahasiswa Masuk :");
        for (mahasiswa_masuk mahasiswa : daftarmahasiswa) {
            System.out.println(mahasiswa);    
    }
  }
}
