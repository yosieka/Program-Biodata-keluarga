package program.biodata.keluarga;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class testBiodata {

    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println("Yosieka Putri Wibawa/ XRPL 6/ 40");
        System.out.println("==================================");
        System.out.println(">>>> BIODATA KELUARGA <<<<");
        System.out.println("============================");
        int ulangi;
        do{
        System.out.println("Masukkan Boidata Keluarga!!");
        Scanner masukan = new Scanner(System.in);
        biodata data = new biodata();
        String namaAyah = JOptionPane.showInputDialog("Masukkan Nama Ayah : ");
        data.setNamaAyah(namaAyah);
        String namaIbu = JOptionPane.showInputDialog("Masukkan Nama Ibu : ");
        data.setNamaIbu(namaIbu);
        String namaAdik = JOptionPane.showInputDialog("Masukkan Nama Saudara : ");
        data.setNamaAdik(namaAdik);
        String namaSaya = JOptionPane.showInputDialog("Masukkan Nama Anda : ");
        data.setNamaSaya(namaSaya);
        String alamat = JOptionPane.showInputDialog("Masukkan Alamat Anda : ");
        data.setAlamat(alamat);
        String tempatLahir = JOptionPane.showInputDialog("Masukkan Tempat Lahir  : ");
        data.setTempatLahir(tempatLahir);
        String tanggalLahir = JOptionPane.showInputDialog("Masukkan Tanggal Lahir : ");
        data.setTanggalLahir(tanggalLahir);
        String hobi = JOptionPane.showInputDialog("Masukkan Hobi : ");
        data.setHobi(hobi);
        String cita = JOptionPane.showInputDialog("Masukkan Cita-cita : ");
        data.setCita(cita);
        String telp = JOptionPane.showInputDialog("Masukkan No Telepon : ");
        data.setTelp(telp);
        System.out.println();
        System.out.println("Biodata Keluarga Adalah : ");
        System.out.println("--------------------------");
        JOptionPane.showMessageDialog(null,"Nama Ayah : " + data.getNamaAyah() + "\nNama Ibu : " + data.getNamaIbu() + "\nNama Saudara : " +
 data.getNamaAdik() + "\nNama Saya : " + data.getNamaSaya() + "Alamat : " + data.getAlamat() + "\nTempat Lahir : " + 
  data.getTempatLahir() + "\nTanggal Lahir :" + data.getTanggalLahir() + "\nHobi : " + data.getHobi() + "\nCita-Cita :" + 
     data.getCita() + "\n Nomor Telepon : " + data.getTelp());
            System.out.print("Apakah ingin mengulangi : 1 for Ya dan 0 for Tidak : ");
            ulangi = masukan.nextInt();
                   
        }while(ulangi == 1);
        System.out.println("======SELESAI=======");
        }

}
