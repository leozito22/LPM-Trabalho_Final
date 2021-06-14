public class Carro extends Veiculo {

    private static final int TANQUE_LIMITE = 50;
    private static final int MANUTENCAO_PERIODICA = 10_000;
    private static final int MANUTENCAO_TROCA_PECAS = 10_000;
    Tanque tanque;
    Combustivel combustivel;
    protected int quantidadeLitros;

    Carro(String placa, int KmRodados, int quantidadeLitros, Combustivel combustivel) {
        super(placa, KmRodados);
        this.combustivel = combustivel;
        this.tanque = new Tanque(TANQUE_LIMITE, quantidadeLitros, combustivel);
    }

    public int autonomiaDiaria() {

        return (int) (TANQUE_LIMITE * this.combustivel.consumo()); // calcula kilometragem máxima diária que o veículo
        // pode andar

    }

    public boolean verificaLimiteDiario() {
        return (KmRodados < autonomiaDiaria());
    }

    /*
     *
     * @Override public void addRota(DateTime datetime, int KmTotal) {
     *
     *
     * }
     *
     */

    @Override
    public double reabastecer() {
        int reabastecimento;

        if (this.quantidadeLitros > TANQUE_LIMITE) {
            throw new IllegalArgumentException("Valor Inválido !");
        } else {

            tanque.consumir(KmRodados);
            reabastecimento = (int) (TANQUE_LIMITE - tanque.getQuantidade());

            tanque.reabastecer(reabastecimento);

        }

        return tanque.getQuantidade();
    }

    @Override
    public double fazerManutencao() {

        return 0;
    }

}