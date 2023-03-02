

class Conta_Teste {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("12345-6", "João da Silva", 1000.00);

        conta1.Deposito(500.00);
        conta1.Saque(200.00);
        conta1.getConta();
        conta1.getTitular();

        conta1.imprimirInformacoes();

        
    }
}

