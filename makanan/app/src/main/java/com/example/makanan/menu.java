package com.example.makanan;


public class menu {
    private String gambar;
    private String nama;
    private String keterangan;
    private String harga;


    public  menu (String datagambar, String datanama, String dataketerangan, String dataharga ) {
        nama = datanama;
        harga = dataharga;
        gambar = datagambar;
        keterangan = dataketerangan;
    }

    public String getNama() { return nama;}

    public String getHarga() { return harga; }

    public String getGambar(){ return gambar; }

    public String getKeterangan() { return keterangan; }


}
