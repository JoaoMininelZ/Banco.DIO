public class Main {

    public static void main(String[] args) {

        conta cc = new contaCorrente();
        conta poupanca = new contaPoupanca();

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();



    }

}
