/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak402;

public class Novel extends Buku{
    private String genre;
    private String sinopsis;

    public Novel(String judul,String penulis,String tahun,String genre, String sinopsis) {
        this.judul=judul;
        this.penulis=penulis;
        this.tahun=Integer.parseInt(tahun);
        this.genre = genre;
        this.sinopsis = sinopsis;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getGenre() {
        return genre;
    }

    public String getSinopsis() {
        return sinopsis;
    }
    
    public String getNovelDetail(){
        return "Sebuah novel bergenre "
        + this.genre + " dengan judul \""
        + this.judul + "\". Novel tersebut ditulis oleh "
        + this.penulis + " dan diterbitkan pada tahun "
        + this.tahun + ".\n"
        + "Sinopsis : " + this.sinopsis;
    }

    protected void display() {
        System.out.println();
        System.out.println("Data yang baru diinputkan adalah");
        System.out.println(this.getNovelDetail());
        System.out.println();
    }  
    
}
