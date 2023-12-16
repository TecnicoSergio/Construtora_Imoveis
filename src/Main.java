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
        System.out.println("O quarto terá " + quartos1.porta + "2");
        System.out.println("O quarto terá " + quartos1.metragem + 25.5);
        System.out.println(quartos1.getJanelas());
        System.out.println(quartos1.getMetragem());
        System.out.println(quartos1.getPorta());
        System.out.println("===================");
        System.out.println("Cozinha terá " + cozinha1.bancada + "Grande");
        System.out.println("A metragem será de " + cozinha1.metragem + "45.2");
        System.out.println(cozinha1.getMetragem());
        System.out.println(cozinha1.getBancada());
        System.out.println("==================");
        System.out.println("A varanda terá " + varanda1.churrasqueira
                + "metragem: 12/ 1 churrasqueira/ 2 janelas e 1 porta");
        //System.out.println(varanda1.getChurrasqueira());
        //System.out.println(varanda1.getMetragem());
        //System.out.println(varanda1.getPorta());
        //System.out.println(varanda1.getJanela());
        System.out.println("============================");
        System.out.println("Banheiro terá " + banheiro1.vaso + "vaso");
        System.out.println("Banheiro terá " + banheiro1.pia + "pia");
        System.out.println("Banheiro terá " + banheiro1.porta + "porta");
        //System.out.println(banheiro1.getPorta());
        //System.out.println(banheiro1.getPia());
        //System.out.println(banheiro1.getVaso());




    }
}