public class Caminhao extends Veiculo {

    private static final int TANQUE_LIMITE = 250;
    private static final int MANUTENCAO_PERIODICA = 20_000;
    private static final int MANUTENCAO_TROCA_PECAS = 20_000;
    protected Tanque tanque;
    protected Combustivel combustivel;
    protected int quantidadeLitros;

    Caminhao(String placa, int KmRodados, int quantidadeLitros, Combustivel combustivel) {
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
     * @Override public void addRota(DateTime data, int KmTotal) {
     *
     *
     *
     *
     * }
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