//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Conta  Tipo1 = new ContaCorrente("1234-5", 1500.00);
        Conta  Tipo2 = new ContaPoupanca("6789-0", 3000.00);


        //CHAMANDO OS MÉTODOS
        Tipo1.depositar(100);
        Tipo1.sacar(60);
        Tipo1.transferir(Tipo2,200);


        //EXIBIÇÃO NO TERMINAL
        System.out.println("\nSaldo Conta Corrente: " + Tipo1.getSaldo());
        System.out.println("\nSaldo Conta Poupança: " + Tipo2.getSaldo());


    }
}