package casa;

public class varanda {

    public double metragem;
    public String churrasqueira;

    public String janela;
    public String porta;

    public varanda(double metragem, String churrasqueira, String janela, String porta) {
        this.metragem = metragem;
        this.churrasqueira = churrasqueira;
        this.janela = janela;
        this.porta = porta;
    }

    public double getMetragem() {
        return metragem;
    }

    public void setMetragem(double metragem) {
        this.metragem = metragem;
    }

    public String getChurrasqueira() {
        return churrasqueira;
    }

    public void setChurrasqueira(String churrasqueira) {
        this.churrasqueira = churrasqueira;
    }

    public String getJanela() {
        return janela;
    }

    public void setJanela(String janela) {
        this.janela = janela;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    @Override
    public String toString() {
        return "varanda{" +
                "metragem=" + metragem +
                ", churrasqueira='" + churrasqueira + '\'' +
                ", janela='" + janela + '\'' +
                ", porta='" + porta + '\'' +
                '}';
    }
}
