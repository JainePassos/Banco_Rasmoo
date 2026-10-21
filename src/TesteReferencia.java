public class TesteReferencia {
    public static void main(String[] args) {
        Conta  PrimeiraConta = new Conta(); //Conta@53d8d10a 53d8d10a Posição da memoria onde a conta foi criada
        System.out.println(PrimeiraConta);

        Conta SegundaConta = PrimeiraConta;
        System.out.println(PrimeiraConta);
    }
}
