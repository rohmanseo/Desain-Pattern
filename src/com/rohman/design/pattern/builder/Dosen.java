package com.rohman.design.pattern.builder;

public class Dosen {
    String nama;
    int NIDN;
    String mataKuliah;
    String tanggalLahir;

    public Dosen(String nama, int NIDN, String mataKuliah, String tanggalLahir) {
        this.nama = nama;
        this.NIDN = NIDN;
        this.mataKuliah = mataKuliah;
        this.tanggalLahir = tanggalLahir;
    }

    @Override
    public String toString() {
        return "Dosen\n" +
                "nama              ='" + nama+ "\n"+
                "NIDN              ='" + NIDN+ "\n"+
                "Mata Kuliah       ='" + mataKuliah+ "\n"+
                "Tanggal Lahir     ='" + tanggalLahir+ "\n";
    }

    static class Builder{
        private String nama;
        private int NIDN;
        private String mataKuliah;
        private String tanggalLahir;

        public Builder setNama(String nama) {
            this.nama = nama;
            return this;
        }

        public Builder setNIDN(int NIDN) {
            this.NIDN = NIDN;
            return this;
        }

        public Builder setMataKuliah(String mataKuliah) {
            this.mataKuliah = mataKuliah;
            return this;
        }

        public Builder setTanggalLahir(String tanggalLahir) {
            this.tanggalLahir = tanggalLahir;
            return this;
        }
        public Dosen build(){
            return new Dosen(this.nama,this.NIDN,this.mataKuliah,this.tanggalLahir);
        }
    }


}
