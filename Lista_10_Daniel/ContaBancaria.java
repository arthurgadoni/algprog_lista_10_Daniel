public class ContaBancaria {
    private String titular;
    private int numero;
    private double saldo;
    private String banco;

    public ContaBancaria(String titular, int numero, double saldo, String banco) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        this.banco = banco;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Pix caiu!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Sacou e o dinheiro ja foi de arrasta");
        } else {
            System.out.println("Sem saldo pobre dms");
        }
    }

    public void consultarSaldo() {
        System.out.println("Tu tem R$ " + saldo + " na conta");
    }
}