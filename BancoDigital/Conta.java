public class Conta {
    private double saldo;
    private String numeroConta;


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    

    //CONSTRUTOR
    public Conta() {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

        //METODO PARA DEPOSITAR
    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("deposito de " + valor +"realizado!");
        }else {
            System.out.println("Valor inválido.");
        }
    }

    //METODO PARA SACAR
    public void sacar(double valor){
        if(valor > 0 && valor <= saldo){
            saldo-= valor;
            System.out.println("\nSaque realizado!\nvalor: " + valor);
        }else {
            System.out.println("\nSaldo insuficiente ou inválido");
        }
    }


    //METODO PARA TRANSFERIR
    public void transferir(Conta destino, double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferência de " + valor + " realizada para a conta " + destino.numeroConta);
        } else {
            System.out.println("Transferência inválida!");
        }
    }



    //METODO DE EXIBICAO DO SALDO
    public double getSaldo(){
        return saldo;
    }



}
