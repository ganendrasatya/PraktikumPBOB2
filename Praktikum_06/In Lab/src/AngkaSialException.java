//  Nama File : AngkaSialException.java
//  Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
//  Pembuat : Ganendra Satya Sindhunata - 24060124120025
//  Tanggal : 30 Maret 2026

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("Jangan memasukkan angka 13 karena angka sial !!!");
    }
}
