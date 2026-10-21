public class TestaConta {
    public static void main(String[] args) {
        //Objeto
       Conta PrimeiraConta = new Conta(); //Acessar os atributos do objeto
       PrimeiraConta.saldo = 1540.50;
       PrimeiraConta.agencia = 1;
       PrimeiraConta.numero = 100;
       PrimeiraConta.titular = "Jaíne";

        System.out.println("O titular da primeira conta é: " + PrimeiraConta.titular);
        System.out.println("Agência: " + PrimeiraConta.agencia + ", Número: " + PrimeiraConta.numero);
        System.out.println("O saldo atual é: "+ PrimeiraConta.saldo);


    }
}
