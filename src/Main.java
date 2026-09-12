public class Main {
    public static void main(String[] args) {
        CuentaDeAhorro cuentaDeAhorro = new CuentaDeAhorro("AOE1641324", 5000, 12);
        cuentaDeAhorro.depositar(1500);
        cuentaDeAhorro.aplicarInteresMensual();
        cuentaDeAhorro.retirar(400);
        cuentaDeAhorro.mostrar();

    }
}