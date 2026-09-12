public class CuentaDeAhorro {
    private String numeroCuenta;
    private double saldo;
    private double tasaInteresAnual;

    public CuentaDeAhorro(String numeroCuenta, double saldo, double tasaInteresAnual) {
        this.numeroCuenta = numeroCuenta;
        if(saldo >= 0){
            this.saldo = saldo;
        }else {
            this.saldo = 0;
        }
        if(tasaInteresAnual >= 0){
            this.tasaInteresAnual = tasaInteresAnual;
        }else {
            this.tasaInteresAnual = 0;
        }

    }

    public void depositar(double monto){
        saldo += monto;
        System.out.println("Saldo depositado: " + saldo);
    }

    public void retirar(double monto){
        if(monto <= 0){
            System.out.println("monto invalido");
        } else if (monto > saldo) {
            System.out.println("Saldo insuficiente");
        } else{
            saldo -= monto;
            System.out.println("Saldo retirado: " + saldo);
        }

    }

    public void aplicarInteresMensual(){
        double interes = saldo *(tasaInteresAnual /12) / 100;
        saldo += interes;

    }

    public void mostrar(){
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tasa interes anual: " + tasaInteresAnual);

    }

}
