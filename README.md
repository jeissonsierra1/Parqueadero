# Parqueadero

# Descripción del Proyecto

Este proyecto implementa un sistema de gestión para un parqueadero utilizando programación orientada a objetos en Java. El sistema permite administrar la entrada y salida de diferentes tipos de vehículos, calculando automáticamente las tarifas según el tiempo de estancia y el tipo de vehículo.

# Funcionalidades Principales
El sistema ofrece las siguientes funcionalidades:

# Registro de Entrada de Vehículos:
- Captura de datos básicos (placa, marca, modelo)
- Registro de hora de entrada automático
- Clasificación por tipo de vehículo (Automóvil, Motocicleta, Camión)
- Captura de atributos específicos según el tipo de vehículo

# Registro de Salida de Vehículos:

- Búsqueda por placa
- Cálculo automático del tiempo de estancia
- Cálculo de tarifa según tipo de vehículo y tiempo
- Eliminación del vehículo del registro del parqueadero

# Consulta del Estado del Parqueadero:

- Listado de todos los vehículos actualmente en el parqueadero
- Visualización de detalles específicos de cada vehículo

# Gestión de Tarifas:
Tarifas diferenciadas por tipo de vehículo:

- Automóvil: $2,000 por hora
- Motocicleta: $1,000 por hora
- Camión: $5,000 por hora

# Estructura del Proyecto
El proyecto está organizado en las siguientes clases principales:

- Parqueadero: Clase principal que contiene el método main y maneja la interfaz de usuario.
- Parqueadero1: Implementa la lógica de negocio del sistema y sigue el patrón Singleton.
- Vehiculo: Clase base abstracta que define las propiedades comunes de todos los vehículos.
- Automovil: Extiende Vehiculo e incluye propiedades específicas como tipo de combustible.
- Motocicleta: Extiende Vehiculo e incluye propiedades específicas como cilindraje.
- Camion: Extiende Vehiculo e incluye propiedades específicas como capacidad de carga.

# Tests Unitarios
El proyecto incluye tests unitarios implementados con JUnit para verificar el correcto funcionamiento de las operaciones principales.
Parqueadero1Test: Contiene pruebas para las funciones de:

- Registro de entrada de vehículos
- Registro de salida de vehículos y cálculo de tarifas
- La clase de prueba utiliza el método setUp() para limpiar el parqueadero antes de cada test

# Instrucciones de Ejecución
Para ejecutar el proyecto:

- Clone el repositorio o descargue los archivos fuente
- Asegúrese de tener instalado Java JDK (versión 8 o superior)
- Compile todas las clases
- Ejecute la clase principal Parqueadero()
  
  Para ejecutar los tests unitarios:
- Asegúrese de tener JUnit 
- Ejecute la clase Parqueadero1Test

# Flujo de Trabajo
Al iniciar el programa, se presenta un menú con 4 opciones:

- Registrar entrada de vehículo
- Registrar salida de vehículo
- Consultar estado del parqueadero
- Salir
- 
El usuario puede navegar por las diferentes funcionalidades siguiendo las instrucciones en pantalla.

El proyecto implementa los principios fundamentales de la programación orientada a objetos:

- Encapsulamiento: Control del acceso a los datos a través de getters y setters
- Herencia: Estructura jerárquica de vehículos
- Abstracción: Definición clara de las responsabilidades de cada clase
- Polimorfismo: Tratamiento unificado de diferentes tipos de vehículos


1. Clonar el repositorio:  
   ```sh
   https://github.com/jeissonsierra1/Parqueadero.git
```  
