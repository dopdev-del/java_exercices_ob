public class Coche {
    private int puertas;

    public Coche(int puertas){
        this.puertas = puertas;
    }

    public void agregarPuertas(int puertas){
        this.puertas += puertas;
    }

    public void imprimeInfoCoche() {
        System.out.println("Puertas: " + puertas);
    }

    public static void main(String[] args){
        Coche carro = new Coche(4);
        carro.agregarPuertas(2);
        carro.imprimeInfoCoche();
    }
}
