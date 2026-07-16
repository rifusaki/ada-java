# Cuenta Bancaria

```java
class CuentaBancaria {
    public double saldo;

    public void depositar(double m) {
        saldo = saldo + m;
    }
    public void retirar(double m) {
        saldo = saldo - m;
    }
}
```

## Huecos

1. `saldo`　es un atributo público. Fácilmente modificable
2. No hay ningún tipo de validación de valores negativos, INF o NaN al momento de `depositar` o `retirar`.
3. Ninguno de los dos métodos retorna ningún valor. Dado que no se establecen condiciones de éxito ni fallo, no tienen nada que retornar.
   1. `retirar`, en particular, no revisa que haya saldo suficiente antes de actualizar el saldo de la cuenta.

## Cosas rotas

### 1. Saldo público

Cualquier código externo tiene la capacidad de modificarlo directamente, y con valores que no responden a ninguna regla o validación.

> Lo pones `private` y regulas su acceso a través de métodos que estén en línea con las reglas del negocio.

## 2. Validación de `depositar` o `retirar`

Es posible "depositar un valor negativo" (disminuir el saldo) o "retirar un valor negativo" (equivalente a depositar). Adicionalmente, se puede romper todo pasando NaNs o INF.

> Validación básica de input para ambos

## 3. Falta de condiciones de éxito y retornos

En el caso de `depositar`, no existe modo de saber si la operación fue exitosa. En el caso de `retirar` (además de lo anterior), el código admite la posibilidad de retirar más del saldo actual, llevando a un balance negativo. A menos de que se admita explícitamente el *overdrawing*—que requeriría otra serie de reglas—esto es un escenario que se debe evitar.

> Validar que el saldo sea mayor al valor a retirar, y en ambos casos retornar valores que confirman que la operación fue exitosa.
