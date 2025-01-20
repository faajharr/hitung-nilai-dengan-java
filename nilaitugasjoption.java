
package tugas;

import javax.swing.JOptionPane;

public class nilaitugasjoption {


    public static void main(String[] args) {
        
 String nama,jurusan,kelas,umur,input,uass,utss,uhh;
        int uas,uts,uh,rata,pilih;
        JOptionPane.showInputDialog(null,"SELAMAT DATANG DI TUGAS FAJAR");
        input=JOptionPane.showInputDialog(null,"PILIH MENU\n1. HITUNG RATA RATA NILAI ULANGAN\n2. HITUNG RATA RATA NILAI MAPEL");
        pilih= Integer.parseInt(input);
        
        
         if (pilih==1){
        nama=JOptionPane.showInputDialog(null,"MASUKAN NAMA");
         jurusan=JOptionPane.showInputDialog(null,"MASUKAN JURUSAN ");
          kelas=JOptionPane.showInputDialog(null,"MASUKAN KELAS ");
           umur=JOptionPane.showInputDialog(null,"MASUKAN UMUR ");
           
           uass =JOptionPane.showInputDialog(null,"MASUKAN NILAI UAS");
           utss =JOptionPane.showInputDialog(null,"MASUKAN NILAI UTS");
           uhh =JOptionPane.showInputDialog(null,"MASUKAN NILAI UH");
           uas=Integer.parseInt(uass);
           uts=Integer.parseInt(utss);
           uh=Integer.parseInt(uhh);
           rata=uas+uts+uh/3;
           
           JOptionPane.showMessageDialog(null,"\n==============================================="+"\nNAMA : "+nama+"\nKELAS : "+kelas+"\nUMUR : "+umur+"\nALAMAT : "+jurusan+"\n==============================================="+"\nNILAI UAS = "+uass+"\nNILAI UTS = "+utss+"\nNILAI UH = "+uhh+"\n==============================================="+"\nDENGAN RATA RATA = "+rata,"RATA RATA NILAI ULANGAN",JOptionPane.INFORMATION_MESSAGE);
         }
          if (pilih==2){
               nama=JOptionPane.showInputDialog(null,"MASUKAN NAMA");
         jurusan=JOptionPane.showInputDialog(null,"MASUKAN ALAMAT ");
          kelas=JOptionPane.showInputDialog(null,"MASUKAN KELAS ");
           umur=JOptionPane.showInputDialog(null,"MASUKAN UMUR ");
           
           uass =JOptionPane.showInputDialog(null,"MASUKAN NILAI BAHASA INDONESIA");
           utss =JOptionPane.showInputDialog(null,"MASUKAN NILAI MATEMATIKA");
           uhh =JOptionPane.showInputDialog(null,"MASUKAN NILAI BAHASA INGGRIS");
           uas=Integer.parseInt(uass);
           uts=Integer.parseInt(utss);
           uh=Integer.parseInt(uhh);
           rata=uas+uts+uh/3;
           
           JOptionPane.showMessageDialog(null,"\n==============================================="+"\nNAMA : "+nama+"\nKELAS : "+kelas+"\nUMUR : "+umur+"\nJURUSAN : "+jurusan+"\n==============================================="+"\nNILAI BAHASA INDONESIA = "+uass+"\nNILAI BAHASA INGGRIS = "+utss+"\nNILAI MATEMATIKA = "+uhh+"\n==============================================="+"\nDENGAN RATA RATA = "+rata,"RATA RATA NILAI PELAJARAN",JOptionPane.INFORMATION_MESSAGE);
          }
          else{
              JOptionPane.showMessageDialog(null,"maaf input yang anda masukan tidak terdaftar","eror",JOptionPane.INFORMATION_MESSAGE);
          }
    }
    
}

   
