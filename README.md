# Conversor
Challenge de conversor de monedas

# Conversor de Monedas en Java

## Descripción
Este proyecto es un **Conversor de Monedas** desarrollado en **Java** que permite realizar conversiones entre diferentes tipos de monedas utilizando tasas de cambio obtenidas de una **API externa**.

El programa incluye un menú interactivo para facilitar la selección de opciones, un historial de conversiones, soporte para conversión inversa y resultados con precisión de 4 decimales. Además, cuenta con un sistema de caché para ofrecer soporte offline.

---

## Características
1. **Menú Interactivo**:
   - Selección de moneda de origen y destino.
   - Varias opciones predefinidas para monedas populares.
2. **Historial de Conversiones**:
   - Registro de todas las conversiones realizadas durante la sesión.
3. **Modo Inverso**:
   - Convierte automáticamente la última conversión en sentido inverso.
4. **Resultados con Precisión**:
   - Muestra los valores con 4 decimales para mayor exactitud.
5. **Soporte Offline**:
   - Almacena las tasas de cambio en caché para reutilizarlas sin conexión a internet.
6. **Modularidad**:
   - Código dividido en varias clases para facilitar la lectura y mantenimiento.

---

## Tecnologías Utilizadas
- **Java 17**
- **Maven** como herramienta de construcción
- **Gson** (2.10.1) para el manejo de JSON
- **HttpClient** para realizar solicitudes HTTP

---

## Instalación y Configuración
### Prerrequisitos:
1. **Java JDK 17 o superior**.
2. **Apache Maven** instalado.
3. Conexión a internet para la primera ejecución (descargar tasas de cambio).

### Pasos para Configurar el Proyecto:
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/usuario/conversor-monedas-java.git
   ```
2. Navegar al directorio del proyecto:
   ```bash
   cd conversor-monedas-java
   ```
3. Compilar el proyecto:
   ```bash
   mvn clean install
   ```
4. Ejecutar el programa:
   ```bash
   java -cp target/Conversor-1.0-SNAPSHOT.jar ConversorApp
   ```

---

## Uso
### Menú Principal:
Al ejecutar el programa, verás un menú como este:
```
*******************************************
     Bienvenido/a al Conversor de Moneda  
*******************************************
1) Dólar >> Peso argentino
2) Peso argentino >> Dólar
3) Dólar >> Real brasileño
4) Real brasileño >> Dólar
5) Dólar >> Peso colombiano
6) Peso colombiano >> Dólar
7) Dólar >> Euro
8) Euro >> Dólar
9) Dólar >> Libra Esterlina
10) Libra Esterlina >> Dólar
11) Dólar >> Yen Japonés
12) Yen Japonés >> Dólar
13) Dólar >> Peso Mexicano
14) Peso Mexicano >> Dólar
15) Ver historial
16) Modo inverso
17) Salir
*******************************************
Elija una opción válida:
```

### Funcionalidades Específicas:
- **Historial**:
  - Opción 15 para ver todas las conversiones realizadas.
- **Modo Inverso**:
  - Opción 16 para invertir automáticamente la última conversión realizada.

---

## Ejemplo de Conversión
**Entrada:**
```
Seleccione opción: 1
Ingrese la cantidad de USD que desea convertir: 100
```
**Salida:**
```
100.0000 USD = 36500.0000 ARS
```

---

## Dependencias
### `pom.xml`
```xml
<dependencies>
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.10.1</version>
    </dependency>
</dependencies>
```

---

## Estructura del Código
```
.
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── ConversorApp.java
│   │   │   ├── CurrencyConverter.java
│   │   │   ├── ApiClient.java
│   │   │   ├── ConversionHistory.java
│   │   │   ├── UserInterface.java
│   │   ├── resources
│   ├── test
├── pom.xml
└── README.md
```

---

## Posibles Mejoras Futuras
1. **Interfaz Gráfica (Swing o JavaFX)**.
2. **Soporte para criptomonedas** como Bitcoin (BTC) y Ethereum (ETH).
3. **Exportación del historial** a formatos CSV o PDF.
4. **Gráficos históricos** del valor de las monedas.


---

## Licencia
Este proyecto está licenciado bajo la **MIT License**.

---

## Autor
**Emilio De Luna**
- GitHub: [[Emiliodlunam](https://github.com/usuario](https://github.com/Emiliodlunam))


