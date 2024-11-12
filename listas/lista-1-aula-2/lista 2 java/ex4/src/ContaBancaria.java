public class ContaBancaria {
    int numeroConta;
    float saldo;

    public ContaBancaria(int numeroConta, float saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public float depositar(int numeroConta, float saldo, float valorDeposito) {
        this.saldo += valorDeposito;
        System.out.println("Depósito realizado com sucesso.\nNovo saldo: " + this.saldo);
        return this.saldo;
    }

    public float sacar(int numeroConta, float valorSaque) {
        if (valorSaque > this.saldo) {
            System.out.println("Sem saldo!\n");
        } else {
            this.saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso.\nNovo saldo: " + this.saldo);
        }
        return this.saldo;
    }

}
