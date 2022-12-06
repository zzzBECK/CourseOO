package entities;

public class ContaBancaria {
    
    private int id;
    private String nome;
    private double saldo;

    public ContaBancaria(int id, String nome, double saldo){
        this.id = id;
        this.nome = nome;
        realizarDeposito(saldo);
    }

    public ContaBancaria(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo(){
        return saldo;
    }

    public void realizarDeposito(double valorDeposito){
        saldo += valorDeposito;
    }

    public void realizarSaque(double valorSaque){
        saldo -= valorSaque + 5.0;
    }

    public String toString(){
        return "Account: " + id + " Holder: " + nome + " Balance: " + saldo;
    }

}