package data_mahasiswa;

public class mahasiswa_masuk{

    private final String nama;
    final int nim;
    private final String kelas;
    private final String matkul;
    private final String kodematkul;

    public mahasiswa_masuk(String nama, int nim, String kelas, String matkul, String kodematkul) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.matkul = matkul;
        this.kodematkul = kodematkul;
    }

    public String getNama() {
        return nama;
    }

    public int getNim() {
        return nim;
    }

    public String getKelas() {
        return kelas;
    }

    public String getMatkul() {
        return matkul;
    }

    public String getKodematkul() {
        return kodematkul;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Nim: " + nim + ", Kelas: " + kelas + ", Mata Kuliah: " + matkul + ", Kode Mata Kuliah: " + kodematkul;
    }

    public void setKodematkul(String kodematkul) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setMatkul(String matkul) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setKelas(String kelas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setNim(int nim) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setNama(String nama) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}