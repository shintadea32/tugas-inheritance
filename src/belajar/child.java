/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar;

/**
 *
 * @author I d e a P a d
 */
public class child extends parent{
    //menurunkan class parent ke class child
    
    //mengisi objek
    int umur = 9;
    int jumlah = 6;
    
    //membuat method cetak
    //didalam method cetak, menambahkan method jenis kelamin
    public void Cetak(){
        System.out.println("Ayah Tono mempunyai hewan "+super.hewan);
        System.out.println("yang berumur  "+umur+ "tahun");
        System.out.println("dengan jumlah "+jumlah+ "ekor");
        System.out.println("yang memiliki gamet "+super.jeniskelamin);
        super.jeniskelamin();
}
}
