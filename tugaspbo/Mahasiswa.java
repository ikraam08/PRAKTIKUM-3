/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspbo;

    public class Mahasiswa extends Manusia {
private String nim;
private String jurusan;
 

void display(){
    System.out.println("Nim           : " +this.nim);
    System.out.println("Jurusan       : " +this.jurusan);
}
//setter

public void setNim(String nim) {
        this.nim = nim;
}
public void setJurusan(String jurusan) {
this.jurusan = jurusan;
}
// getter
public String getNim() {
return this.nim;
}
public String getJurusan() {
return this.jurusan;
}

}
