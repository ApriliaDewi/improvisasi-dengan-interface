package apriliadewi.pkg14111014.encapintegration;

class RegularMalam  extends Mahasiswa2{
String Kerja;
public void setKerja(String Kerja ){
this.Kerja = Kerja;
}
 public String getKerja(){
            return Kerja="Regular malam kebanyakan Mahasiswanya Sudah Kerja";
        }

    @Override
    public void namaMatkul() {
    System.out.println("matkul yang di ambil = Object Oriented Programming 2"); }

    @Override
    public void jumlahSks() {
    int sks=3;
    System.out.println("jumlah sks = "+sks);}

    @Override
    public void Dosen() {
   System.out.println("nama Dosen = Frencius");  }

    @Override
    public String pesan() {
    return Kerja="Semoga Sukses ...";  }
}