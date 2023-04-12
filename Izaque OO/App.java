public class App{
    
    public static void main(String[] args) {
        
        //declaração
        ContaBancariaIzaque conta;

        //instanciação
        conta = new ContaBancariaIzaque();

        //inicialização
        conta.agencia = "1234";
        conta.numero = "98765";
        conta.nomeCliente = "Zé";
        conta.saldo = 100.0;

        conta.depositar(300);
        conta.sacar(25);
        System.out.println(conta.verSaldo());
    }

}
