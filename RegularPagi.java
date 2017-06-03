package apriliadewi.pkg14111014.encapintegration;

class RegularPagi extends Mahasiswa2 {
String Jadwal;
public void setJadwal(String Jadwal ){
this.Jadwal = Jadwal;
}
 public String getJadwal(){
            return Jadwal="Anak regular pagi Masuk Jam 08:00";
        }
	
@Override
 
		  public String getKelas (){
            return Kelas="TIRP14B";
        }
		
		@Override
		 public String getJurusan (){
            return Jurusan="Industri";
        }

    @Override
    public void namaMatkul() {  }
    @Override
    public void jumlahSks() { }

    @Override
    public void Dosen() { }

    @Override
    public String pesan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
		
  }
