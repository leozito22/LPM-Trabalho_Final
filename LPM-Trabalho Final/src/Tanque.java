public class Tanque  {
    private double capacidade;
    private double quantidade;
    private Combustivel combustivel;

    public Tanque(double capacidade, double quantidade, Combustivel combustivel) {
        this.capacidade = capacidade;
        this.quantidade = quantidade;
        this.combustivel = combustivel;
    }

    Tanque(){}

    public void consumir(int KmRodados) {
        this.quantidade -= KmRodados / this.combustivel.consumo();
    }

    public double reabastecer(int litros) {

        if (capacidade > this.quantidade) {
            this.quantidade += litros;
        }
        return this.quantidade;

    }

    public void setCapacidade(double capacidade){
        this.capacidade = capacidade;
    }

    public void setQuantidade(double quantidade){
        this.quantidade = quantidade;
    }

    public void setCombustivel(Combustivel combustivel){
        this.combustivel = combustivel;
    }

    public double getCapacidade(){

        return capacidade;
    }


    public double getQuantidade(){

        return quantidade;
    }




}