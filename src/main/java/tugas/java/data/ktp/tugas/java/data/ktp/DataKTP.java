package tugas.java.data.ktp.tugas.java.data.ktp;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class DataKTP {
    
    public ArrayList<String> JavaBatch = new ArrayList<>();
    
    public ArrayList<String> getData(){
        ArrayList<String> Data = new ArrayList<>();
        Data.add("ID");
        Data.add("Nomer KTP");
        Data.add("Nama");
        Data.add("Alamat");
        
        return Data;
    }
}
