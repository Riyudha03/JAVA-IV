/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak401;

import java.util.Scanner;
        
public class PRAK401 {
    
    public static void main(String[] args) {
        String judul;
        String penulis;
        Integer tahun;
        Scanner input=new Scanner(System.in);
        System.out.print("Judul: ");
        judul=input.nextLine();
        System.out.print("Penulis: ");
        penulis=input.nextLine();
        System.out.print("Tahun Terbit: ");
        tahun=input.nextInt();
        Buku buku1=new Buku(judul, penulis, tahun);
        buku1.display();
        input.close();
    }
}
