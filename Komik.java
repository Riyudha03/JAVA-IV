/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak402;

public class Komik extends Buku{
    private Integer volume;
    private String sinopsis;
    public Komik(String judul,String penulis,String tahun,Integer volume, String sinopsis) {
        this.judul=judul;
        this.penulis=penulis;
        this.tahun=Integer.parseInt(tahun);
        this.volume = volume;
        this.sinopsis = sinopsis;
    }

    public String getKomikDetail(){
        return "Sebuah komik dengan judul \""
        + this.judul + "\". Komik tersebut dibuat oleh "
        + this.penulis + " dan diterbitkan pada tahun "
        + this.tahun + "." + "\n" + "Sampai saat ini komik tersebut"
        + " memiliki jumlah volume sebanyak " + this.volume
        + " buah.\n"
        + "Sinopsis : " + this.sinopsis;
    }


    protected void display() {
        System.out.println();
        System.out.println("Data yang baru diinputkan adalah");
        System.out.println(this.getKomikDetail());
        System.out.println();
    }  
   
}
