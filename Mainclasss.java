/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tugas1_prog2_.pkg24183207013.mainclasss;

/**
 *
 * @author Lenovo_J2
 */
public class Mainclasss {

    public static void main(String[] args) {
       Mahasiswa mahasiswa1 = new Mahasiswa();
       mahasiswa1.nama = "anisa";
       mahasiswa1.nim = "1234";
       mahasiswa1.jurusan = "pti";
       
       Mahasiswa mahasiswa2 = new Mahasiswa ();
       mahasiswa2.nama = "auna";
       mahasiswa2.nim = "5678";
       mahasiswa2.jurusan = "pti";
       
       System.out.println("==========Data Mahasiswa 1==========");
       mahasiswa1.tampilkanData();
       
       System.out.println("==========Data Mahasiswa 2==========");
       mahasiswa2.tampilkanData();
    }
}
