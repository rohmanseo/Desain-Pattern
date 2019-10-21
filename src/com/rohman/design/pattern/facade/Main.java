package com.rohman.design.pattern.facade;

import com.rohman.design.pattern.facade.facade.PelangganService;

public class Main {
    public static void main(String[] args) {

/*        PelangganRepository pelangganRepository = new PelangganRepository();
        AlamatRepository alamatRepository = new AlamatRepository();*/

        Pelanggan pelanggan = new Pelanggan(1,"Eko");
        Alamat alamat1 = new Alamat(1,"A","ID");
        Alamat alamat2 = new Alamat(2,"B","ID");

        pelanggan.getList().add(alamat1);
        pelanggan.getList().add(alamat2);

/*        pelangganRepository.save(pelanggan);
        alamatRepository.save(alamat1);
        alamatRepository.save(alamat2);*/

        PelangganService pelangganService = new PelangganService();
        pelangganService.save(pelanggan);



    }
}
