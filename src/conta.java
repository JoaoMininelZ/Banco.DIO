import java.util.Random;

public abstract class conta implements Iconta {

    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;


    protected int agencia;
    protected int numero;
    protected double saldo;
    protected int key;

    Random gerar = new Random();

    public conta() {
        this.agencia = conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public void sacar(double valor) {
        saldo -= valor;

    }

    public void depositar(double valor) {
        saldo += valor;

    }

    public void transferir(double valor, Iconta contadestino) {
        this.sacar(valor);
        contadestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void token() {
        Random random  = new Random();
        int tok = random.nextInt(10000);
        System.out.println(tok);
    }


    protected void imprimirInfosComuns() {
        System.out.println(String.format("agencia: %d", this.agencia));
        System.out.println(String.format("numero: %d", this.numero));
        System.out.println(String.format("saldo: %.2f", this.saldo));
    }
}