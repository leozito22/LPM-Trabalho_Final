public enum Combustivel{
    DIESEL(1),
    ALCOOL(2),
    GASOLINA(3);

    private int valor;
    private double consumo;
    private double preco;
    private static final double LITRO = 1.0;

    Combustivel(int valor){
        this.valor = valor;
    }

    public double consumo(){

        switch (valor) {
            case 1: this.consumo = 4.0 / LITRO;
                break;
            case 2: this.consumo = 7.0 / LITRO;
                break;
            case 3 : this.consumo = 10.0 / LITRO;
            default:
                break;
        }
        return this.consumo;
    }

    public double precoMedio(){

        switch(valor){
            case 1 : this.preco = 4.34;
                break;
            case 2 : this.preco = 4.49;
                break;
            case 3: this.preco = 10.00;
                break;
            default:
                break;
        }

        return this.preco;
    }


}

