class Eletronicos {

    private String marca;
    private String modelo;
    private double preco;
    private int anoFabricacao;
    private boolean ligado;

    // Construtor
    public Eletronicos(String marca, String modelo, double preco, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.anoFabricacao = anoFabricacao;
        this.ligado = false; // Por padrão, o dispositivo está desligado
    }

    // Métodos
    public void ligar() {
        ligado = true;
        System.out.println("O dispositivo foi ligado.");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("O dispositivo foi desligado.");
    }

    public void aumentarVolume() {
        System.out.println("Volume aumentado.");
    }

    public void diminuirVolume() {
        System.out.println("Volume diminuído.");
    }

    public void mostrarInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo " + modelo);
        System.out.println("Preço R$: " + preco);
        System.out.println("Ano Fabricação " + anoFabricacao);
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
    }
    public  static void  main(String[] args) {
        Eletronicos dispositivo = new
                Eletronicos("Sansung", "Galaxy S20" , 2999.99, 2020);
        dispositivo.mostrarInformacoes();
        dispositivo.ligar();
        dispositivo.aumentarVolume();
        dispositivo.diminuirVolume();
        dispositivo.desligar();
    }
}