# 🏦 Ejercicio — Gestión de Cuenta de Ahorro

---

## 📝 Descripción

El sistema implementa la clase CuentaDeAhorro para gestionar los fondos de un cliente, garantizando que los valores iniciales de saldo e interés no sean negativos, controlando las operaciones de extracción para evitar giros en descubierto y aplicando la tasa de interés mensual correspondiente sobre el saldo acumulado.

---

## 🚀 Funcionalidades e Implementación

### 📦 Clase CuentaDeAhorro

* **Atributos:**
* **numeroCuenta** (private String): Identificador o código único de la cuenta bancaria.
* **saldo** (private double): Monto total disponible en la cuenta.
* **tasaInteresAnual** (private double): Porcentaje de tasa de interés anual aplicada.


* **Métodos Implementados:**
* **Constructor CuentaDeAhorro:** Asigna los valores iniciales verificando que el saldo y la tasa de interés anual sean mayores o iguales a cero; de lo contrario, los establece en cero por defecto.
* **depositar(double monto):** Incrementa el saldo actual según el monto ingresado e imprime el valor actualizado.
* **retirar(double monto):** Valida que el importe sea mayor a cero y no supere el saldo disponible antes de concretar la extracción. Muestra un mensaje de advertencia si la operación no es válida.
* **aplicarInteresMensual():** Calcula el interés proporcional del mes a partir de la tasa anual, sumándolo directamente al saldo de la cuenta.
* **mostrar():** Imprime en consola el número de cuenta, el saldo acumulado y la tasa de interés anual registrada.



---

## 💻 Programa Principal (main)

El flujo principal ejecuta la siguiente prueba bancaria:

1. Instancia la cuenta "AOE1641324" con un saldo inicial de $5.000 y una tasa de interés anual del 12%.
2. Realiza un depósito adicional de $1.500.
3. Aplica el interés mensual correspondiente sobre el saldo resultante.
4. Efectúa un retiro por un valor de $400.
5. Despliega en pantalla el estado final y saldo consolidado de la cuenta.
