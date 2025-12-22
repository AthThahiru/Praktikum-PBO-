/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author M S I
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Peminjaman implements IPeminjaman, Serializable {
    private Anggota anggota;
    private List<Buku> daftarBuku;

    public Peminjaman(Anggota anggota) {
        this.anggota = anggota;
        this.daftarBuku = new ArrayList<>();
    }

    @Override
    public void pinjamBuku(Buku buku) {
        daftarBuku.add(buku);
        System.out.println("Buku \"" + buku.judul + "\" berhasil dipinjam.");
    }

    @Override
    public void kembalikanBuku(Buku buku) {
        daftarBuku.remove(buku);
        System.out.println("Buku \"" + buku.judul + "\" berhasil dikembalikan.");
    }

    public void tampilkanPeminjaman() {
        System.out.println("\nAnggota: " + anggota.getNama());
        if (daftarBuku.isEmpty()) {
            System.out.println("Belum ada buku yang dipinjam.");
        } else {
            for (Buku b : daftarBuku) {
                b.displayInfo();
                System.out.println("----------------");
            }
        }
    }

    public List<Buku> getDaftarBuku() {
        return daftarBuku;
    }
}

