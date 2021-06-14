import javax.xml.crypto.Data;

public class Rota {

    private Data data;
    private int KmRota;

    Rota(Data data, int KmRota){

        this.data = data;
        this.KmRota = KmRota;
    }

    public void setData(Data data){
        this.data = data;
    }

    public void setKmRota(int KmRota){
        this.KmRota = KmRota;
    }

    public int getKmRota(){

        return this.KmRota;
    }
}