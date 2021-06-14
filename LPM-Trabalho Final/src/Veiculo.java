public abstract class Veiculo {

    private String placa;
    private Tanque tanque;
    protected double despesaAtual ;
    protected int KmRodados;


    Veiculo(String placa,int KmRodados){
        this.placa = placa;
        this.KmRodados = KmRodados;

    }

    Veiculo(){

    }

    //public abstract void addRota(DateTime data,int KmTotal);


    public abstract double reabastecer();

    public abstract double fazerManutencao();

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public void setTanque(Tanque tanque){
        this.tanque = tanque;
    }

    public void setKmRodados(int KmRodados){
        this.KmRodados=KmRodados;
    }



}