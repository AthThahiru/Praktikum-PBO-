/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author M S I
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    private List<Anggota> daftarAnggota;

    public Perpustakaan() {
        daftarAnggota = new ArrayList<>();
    }

    public void tambahAnggota(Anggota anggota) {
        daftarAnggota.add(anggota);
    }

    public void tampilkanAnggota() {
        if (daftarAnggota.isEmpty()) {
            System.out.println("Belum ada anggota.");
        } else {
            System.out.println("Daftar Anggota:");
            for (Anggota a : daftarAnggota) {
                System.out.println("- " + a.getId() + " | " + a.getNama());
            }
        }
    }

    public void simpanData(String file) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(daftarAnggota);
            System.out.println("Data anggota berhasil disimpan.");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan data: " + e.getMessage());
        }
    }

    public void bacaData(String file) {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(file))) {
            daftarAnggota = (List<Anggota>) ois.readObject();
            System.out.println("Data anggota berhasil dibaca.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Gagal membaca data: " + e.getMessage());
        }
    }
}

