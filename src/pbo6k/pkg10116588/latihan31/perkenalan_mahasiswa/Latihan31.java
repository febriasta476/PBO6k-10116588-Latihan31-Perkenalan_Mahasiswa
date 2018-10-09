/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116588.latihan31.perkenalan_mahasiswa;


/**
 * @author Indra F
 * Nama                    : Indra Febriastanto
 * NIM                      : 10116588
 * KELAS                    : PBO6K
 * Deskripsi program        : Program ini berisi untuk menampilkan Perkenalan Diri
 * 
 * 
 */
public class Latihan31 {
    
public static void main(String[] args){


     Mahasiswa mhs1 = new Mahasiswa("10116588", "Indra Febriastanto");
        mhs1.perkenalkanDiri();

        Mahasiswa mhs2 = new Mahasiswa("10110270", "Indra Tiola");
        mhs2.perkenalkanDiri();
        
        Mahasiswa mhs3 = new Mahasiswa("10110271", "Robi Tanzil Ganefi");
        mhs3.perkenalkanDiri();

        Mahasiswa mhs4 = new Mahasiswa("10110269", "Muhammad Nur Awaludin");
        mhs4.perkenalkanDiri();
    
}
}