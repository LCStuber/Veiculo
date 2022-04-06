public class Veículo {
    private String placaVeiculo;
    private String chassi;
    private boolean roubado;

    public void setPlacaVeículo(String placaVeiculo){
        this.placaVeiculo = placaVeiculo;
    }
    public String getPlacaVeiculo(){
        return placaVeiculo;
    }

    public void setChassi(String chassi){
        this.chassi = chassi;
    }
    public String getChassi(){
        return chassi;
    }

    public void setRoubo(boolean roubado){
        this.roubado = roubado;
    }
    public boolean getRoubo(){
        return roubado;
    }

    public void exibirDetalhesCarro(){
        System.out.println(String.format("A placa do veículo solicitado é: %s e seu chassi é: %s", placaVeiculo, chassi));
    }

    public void exibirVeiculoRoubado(){
        if (roubado){
            System.out.println(String.format("O veículo de placa %s e chassi %s é um produto de roubo.", placaVeiculo, chassi));
        }
        else{
            System.out.println(String.format("O veículo de placa %s e chassi %s está com a ficha limpa.", placaVeiculo, chassi));
        }
    }
}