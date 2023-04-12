public class ContaBancariaIzaque{

    //atributos
    String numero;
    String agencia;
    String nomeCliente;
    double saldo;

    //metodos
    void depositar(double valor) {
        saldo =saldo+valor;
    }

    void sacar(double valor) {
        saldo = saldo-valor;
    }

    String verSaldo() {
        String str="";
        System.out.println("Agência:"+agencia+ "Numero:"+numero+ "Nome:"+nomeCliente+ "Saldo:"+saldo);
        return str;
    }
}