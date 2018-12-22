import javax.xml.crypto.Data;
import java.util.Date;

public class Pismo {
    String soobschenie;
    String avtor;
    Date data;


    public Pismo(String soobschenie, String avtor, Date data) {
        this.soobschenie = soobschenie;
        this.avtor = avtor;
        this.data = data;
    }

    public String getSoobschenie() {
        return soobschenie;
    }

    public void setSoobschenie(String soobschenie) {
        this.soobschenie = soobschenie;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
