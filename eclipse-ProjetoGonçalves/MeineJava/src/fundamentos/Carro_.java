package complete;

public class Carro_ {
    public static void main(String[] args) {
        Carro meuCarro  = new Carro("Fusca");
        Carro meuCarro1 = new Carro("Sandero");
        Carro meuCarro2 = new Carro("BMW");
        
        String result = meuCarro.acelerar();
        meuCarro1.acelerar();
        meuCarro2.acelerar();
        
        System.out.println(result);
    }
}

class Carro {
    String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public String acelerar() {
        System.out.println("Acelerando o " + modelo);
        return "oi";
    }
}