class ContaBancaria{
    String Conta;
    Double Saldo;
    String Titular;
    Double Limite_Saque;

    public ContaBancaria(String Conta, String Titular, Double Saldo){
        this.Conta = Conta;
        this.Saldo = Saldo;
        this.Titular = Titular; 
    }

    public String getConta(){
        return Conta;
    }

    public double getSaldo(){
        return Saldo;
    }

    public String getTitular(){
        return Titular;
    }

    public double getLimite_Saldo(){
        return Limite_Saque;
    }
 
    public void Deposito (double valorDeposito){
       Saldo = this.Saldo += valorDeposito;  
    }
    
    public void Saque(double valorSaque){
            Saldo = this.Saldo -= valorSaque;        
    }  
    
    public void imprimirInformacoes() {
        System.out.println("Conta: " + Conta );
        System.out.println("Titular: " + Titular );
        System.out.println("Saldo Atual: " + Saldo );
        
    }
}