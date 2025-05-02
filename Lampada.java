public class Lampada {
    private boolean ligada;

    public Lampada() {
        this.ligada = false; // começa desligada
    }

    public void ligar() {
        if (!ligada) {
            ligada = true;
            System.out.println("A lâmpada foi ligada.");
        } else {
            System.out.println("A lâmpada já está ligada.");
        }
    }

    public void desligar() {
        if (ligada) {
            ligada = false;
            System.out.println("A lâmpada foi desligada.");
        } else {
            System.out.println("A lâmpada já está desligada.");
        }
    }

    public boolean isLigada() {
        return ligada;
    }

    public void mostrarEstado() {
        if (ligada) {
            System.out.println("A lâmpada está ligada.");
        } else {
            System.out.println("A lâmpada está desligada.");
        }
    }
}
