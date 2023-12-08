package data_mahasiswa;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControllerMahasiswa {	
        ArrayList<mahasiswa_masuk> ArrayData;
	DefaultTableModel tablelist;

    /**
     *
     */
    public ControllerMahasiswa() {
            ArrayData = new ArrayList<>();
	}

	public void InsertData(String nama, int nim, String kelas, String matkul, String kodematkul){
            mahasiswa_masuk mhs = new mahasiswa_masuk(nama, nim, kelas, matkul, kodematkul);
	    ArrayData.add(mhs);
        }

	public DefaultTableModel showData() {
            String[] kolom = { "Nama", "Nim", "Kelas", "Mata Kuliah", "Kode Mata Kuliah"};
            Object[][] objData = new Object[ArrayData.size()][3];
            int i = 0;

	for (mahasiswa_masuk n : ArrayData) {
            String[] arrData = {n.getNama(), String.valueOf(n.nim),n.getKelas(), n.getMatkul(), n.getKodematkul()};
            objData[i] = arrData;
            i++;
            }

            tablelist = new DefaultTableModel(objData, kolom){
                public boolean inCellEditable(int rowIndex, int colIndex) {
                return false;
            }
	};
			
            return tablelist;
    }

}