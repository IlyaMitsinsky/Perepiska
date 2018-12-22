import java.util.ArrayList;

public class Chat {
    ArrayList<Pismo> soobschenie;
    String nazvanie;




    public Chat(String nazvanie) {
        this.nazvanie = nazvanie;
        soobschenie = new ArrayList<Pismo>();
    }

    public ArrayList<Pismo> getSoobschenie() {
        return soobschenie;
    }

    public void setSoobschenie(ArrayList<Pismo> soobschenie) {
        this.soobschenie = soobschenie;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }
}
