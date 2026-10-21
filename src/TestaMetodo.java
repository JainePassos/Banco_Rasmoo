public class TestaMetodo {
    public static void main(String[] args) {
       Conta conta = new Conta();
       conta.depositar(500);
       conta.depositar(300);
       conta.depositar(50.30);

        boolean ConseguiuRealizarSaque = conta.sacar(850.30);
        if (ConseguiuRealizarSaque == true){
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Não foi possivel realizar o saque!");
        }
        System.out.println("R$"+conta.saldo);
    }
}
