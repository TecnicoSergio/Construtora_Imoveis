import casa.banheiro;
import casa.cozinha;
import casa.varanda;
import casa.sala;
import casa.quartos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        quartos quartos1 = new quartos(5.4, "1", "2");
        cozinha cozinha1 = new cozinha("Grande", 4.5);
        varanda varanda1 = new varanda(3.45, "1", "2", "1");
        banheiro banheiro1 = new banheiro("1", "1", "1");
        sala sala1 = new sala("2", "1",10.2);

        System.out.println("O quarto terá " + quartos1.janelas + " janelas");
        System.out.println("O quarto terá " + quartos1.porta + " Portas");
        System.out.println("O quarto terá " + quartos1.metragem + " de metragem" );

        System.out.println("===================");

        System.out.println("Cozinha terá " + cozinha1.bancada + "Grande");
        System.out.println("A metragem será de " + cozinha1.metragem);

        System.out.println("==================");

        System.out.println("A varanda terá " + varanda1.metragem );
        System.out.println("Na Varanda teremos " + varanda1.churrasqueira );
        System.out.println("Teremos " + varanda1.janela);
        System.out.println("Teremos " + varanda1.porta);

        System.out.println("============================");

        System.out.println("Banheiro terá " + banheiro1.vaso + " vaso");
        System.out.println("Banheiro terá " + banheiro1.pia + " pia");
        System.out.println("Banheiro terá " + banheiro1.porta + " porta");





    }
}