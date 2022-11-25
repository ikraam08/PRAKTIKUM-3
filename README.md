# PRAKTIKUM-3
# Tugas Pertemuan 6
## Pemrograman Orientasi Objek

sh
Nama   : Ikram Ramadhan
Nim    : 312110478
Matkul : Pemrograman Orientasi Objek
````JAVA
### 1. File Manusia.java
* *CODINGAN FILE 1 (Manusia):*
package com.mycompany.tugaspbo;

public class Manusia {
    
String nama;
String jenisKelamin;
int umur;
String alamat;
public void cetakInfo() {
System.out.println("Nama          : " + this.nama);
System.out.println("Jenis Kelamin : " + this.jenisKelamin);
System.out.println("Umur          : " + this.umur);
System.out.println("Alamat        : " + this.alamat);

}
    
}


### 2. File Mahasiswa.java
* *CODINGAN FILE 2 (Mahasiswa):*
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


### 3. File MahasiswaBeraksi.java
* *CODINGAN FILE 2 (MahasiswaBeraksi):*
package com.mycompany.tugaspbo;


    public class MahasiswaBeraksi {
public static void main(String[] args){
// Membuat object
Mahasiswa anton = new Mahasiswa();
/* memanggil atribut dan memberi nilai */
anton.setNim ("10102020");
anton.nama = "Anton Santoso";
anton.jenisKelamin = "Laki-laki";
anton.umur = 28;
anton.alamat = "Bekasi Kota";
anton.setJurusan ("Informatika");
anton.display();
anton.cetakInfo();
}
}
````

* *Hasil output program:*
![img 1](Screenshoot/1.png)
