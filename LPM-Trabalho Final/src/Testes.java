public class Testes {

    public static void main(String[] args) {

     /*
       Tanque p = new Tanque(100.65, 60.65, Combustivel.ALCOOL);
       p.consumir(10);
       System.out.println(p.getQuantidade());
       System.out.println(p.reabastecer(10));
       System.out.println(p.getQuantidade());
       p.consumir(10);
       System.out.println(p.getQuantidade()); */

        Caminhao c = new Caminhao("2345", 7, 5, Combustivel.ALCOOL);
        System.out.println(c.autonomiaDiaria());
        System.out.println(c.verificaLimiteDiario());

        Carro ca = new Carro("6543", 1000000, 50, Combustivel.DIESEL);  // Intensionalmente retornando falso
        System.out.println(ca.autonomiaDiaria());
        System.out.println(ca.verificaLimiteDiario());

        System.out.println( c.reabastecer());

    }

}