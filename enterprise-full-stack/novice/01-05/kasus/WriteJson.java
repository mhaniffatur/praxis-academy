import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ReadJson {
    public static void main(String[] args) {
        
        // fakultas pertama
        JSONObject detailfakultas = new JSONObject();
        detailfakultas.put("kodefakultas", new Integer(101));
        detailfakultas.put("nama","Fakultas Teknologi Industri");
        detailfakultas.put("jumlahmahasiswa", new Integer(1000));

        JSONObject objekfakultas = new JSONObject();
        objekfakultas.put("fakultas", detailfakultas);

        // fakultas kedua
        JSONObject detailfakultas2 = new JSONObject();
        detailfakultas2.put("kodefakultas", new Integer(102));
        detailfakultas2.put("nama","Fakultas Teknik Sipil dan Perancangan");
        detailfakultas2.put("jumlahmahasiswa", new Integer(2000));

        JSONObject objekfakultas2 = new JSONObject();
        objekfakultas2.put("fakultas", detailfakultas);


        // fakultas ketiga
        JSONObject detailfakultas3 = new JSONObject();
        detailfakultas3.put("kodefakultas", new Integer(103));
        detailfakultas3.put("nama","Fakultas Teknik Sipil dan Perancangan");
        detailfakultas3.put("jumlahmahasiswa", new Integer(2000));

        JSONObject objekfakultas3 = new JSONObject();
        objekfakultas3.put("fakultas", detailfakultas);


        // tambahkan daftar setiap objekfakultas dan detail kedalam list
        JSONArray fakultaslist = new JSONArray();
        fakultaslist.add(objekfakultas);
        fakultaslist.add(objekfakultas2);
        fakultaslist.add(objekfakultas3);

        // buat sebuah root untuk menampung seluruh elemen detail dan objek fakultas
        // JSONObject objekroot = new JSONObject();
        // objekroot.put("universitas",fakultaslist);

        // tulis file json
        try{
            FileWriter file = new FileWriter("/Users/syamil/Sites/praxis-academy/novice/01-05/kasus/universitas2.json");
            file.write(fakultaslist.toJSONString());
            System.out.println("Sukses copy json objek to file");
            System.out.println("Json objek :" + fakultaslist);
            file.flush();
            file.close();
        } catch(IOException e){
            e.printStackTrace();
        }
        

    }
}