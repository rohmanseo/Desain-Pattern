package com.rohman.design.pattern.facade.facade;

import com.rohman.design.pattern.facade.Alamat;
import com.rohman.design.pattern.facade.AlamatRepository;
import com.rohman.design.pattern.facade.Pelanggan;
import com.rohman.design.pattern.facade.PelangganRepository;

public class PelangganService {
    PelangganRepository pelangganRepository = new PelangganRepository();
    AlamatRepository alamatRepository = new AlamatRepository();

    public void save(Pelanggan pelanggan) {
        pelangganRepository.save(pelanggan);

        for (Alamat alamat : pelanggan.getList()) {
            alamatRepository.save(alamat);
        }
    }
}
