public class Conta {
 // Modelo de uma conta. A partir daqui vamos criar novos objetos.
    //Todos tem valor Default
    int agencia;
    int numero;
    String titular; //String é uma classe. Titular é objeto
    double saldo;

   void depositar(double valor){  //void não retorna nada, somente executa o que mandarmos fazer

       saldo+=valor;
    }

    boolean sacar(double valor){ // boolean retorna um valor se é verdadeiro ou falso

            if(saldo >= valor){
                saldo-=valor;
                return true;
            }else{
                return false;
            }
    }
}