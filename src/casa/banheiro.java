package casa;

public class banheiro {

    public String vaso;
    public String pia;
    public String porta;

    public String getVaso() {
        return vaso;
    }

    public void setVaso(String vaso) {
        this.vaso = vaso;
    }

    public String getPia() {
        return pia;
    }

    public void setPia(String pia) {
        this.pia = pia;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public banheiro(String vaso, String pia, String porta) {
        this.vaso = vaso;
        this.pia = pia;
        this.porta = porta;
    }

    @Override
    public String toString() {
        return "banheiro{" +
                "vaso='" + vaso + '\'' +
                ", pia='" + pia + '\'' +
                ", porta='" + porta + '\'' +
                '}';
    }
}
