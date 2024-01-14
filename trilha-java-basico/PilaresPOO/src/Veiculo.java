//a classe veiculo é abstrata pq o veiculo nao sabe como algumas coisas funcionam, mas todos que precisam ser veículos precisam ter um chassi
//e precisam ligar
public abstract class Veiculo {
    //o carro e a moto sao veiculos e ambos tem o chassi, então uso o extends veiculo nas classes carro e moto
    //o nome disso é herança

    private String chassi;
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    //o metodo ligar e abstrato porque é uma unica finalidade com comportamentos diferentes
    public abstract void ligar();
    
}
