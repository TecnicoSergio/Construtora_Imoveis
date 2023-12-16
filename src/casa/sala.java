package casa;

public class sala {

    public String porta;
    public String janela;
    public double metragem;

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getJanela() {
        return janela;
    }

    public void setJanela(String janela) {
        this.janela = janela;
    }

    public double getMetragem() {
        return metragem;
    }

    public void setMetragem(double metragem) {
        this.metragem = metragem;
    }

    public sala(String porta, String janela, double metragem) {
        this.porta = porta;
        this.janela = janela;
        this.metragem = metragem;
    }

    @Override
    public String toString() {
        return "sala{" +
                "porta='" + porta + '\'' +
                ", janela='" + janela + '\'' +
                ", metragem=" + metragem +
                '}';
    }
}
