package casa;

public class quartos {

    public double metragem;
    public String janelas;
    public String porta;

    public quartos(double metragem, String janelas, String porta) {
        this.metragem = metragem;
        this.janelas = janelas;
        this.porta = porta;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public double getMetragem() {
        return metragem;
    }

    public void setMetragem(double metragem) {
        this.metragem = metragem;
    }

    public String getJanelas() {
        return janelas;
    }

    public void setJanelas(String janelas) {
        this.janelas = janelas;
    }

    @Override
    public String toString() {
        return "quartos{" +
                "tamanho=" + metragem +
                ", janelas='" + janelas + '\'' +
                ", porta='" + porta + '\'' +
                '}';
    }
}


