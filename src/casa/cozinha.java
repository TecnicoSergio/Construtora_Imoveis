package casa;

public class cozinha {

    public String bancada;
    public double metragem;

    public cozinha(String bancada, double metragem) {
        this.bancada = bancada;
        this.metragem = metragem;
    }

    public String getBancada() {
        return bancada;
    }

    public void setBancada(String bancada) {
        this.bancada = bancada;
    }

    public double getMetragem() {
        return metragem;
    }

    public void setMetragem(double metragem) {
        this.metragem = metragem;
    }

    @Override
    public String toString() {
        return "cozinha{" +
                "bancada='" + bancada + '\'' +
                ", metragem=" + metragem +
                '}';
    }
}
