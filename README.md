# 🧠 Actividad 4 – Semana 6 – Desarrollo Orientado a Objetos I


👤 Autor del proyecto

Nombre completo: Daniel Francisco Caballero Salas

Sección: Programación Orientada a Objetos I

Carrera: Analista Programador Computacional

Sede: Campus Virtual


📘 Descripción general del sistema

El sistema desarrollado corresponde a un modelo de gestión de unidades operativas, integrando principios de programación orientada a objetos como encapsulamiento, herencia, polimorfismo y composicion.

Su propósito principal es ofrecer una estructura modular que permita:

- Representar entidades del dominio (centros de cultivo y plantas de proceso) mediante clases y objetos.

- Incorporar herencia y polimorfismo para diferenciar tipos de unidades operativas.

- Procesar y analizar la producción y capacidad de proceso utilizando Java Streams, facilitando operaciones de filtrado y generación de reportes.

- Separar responsabilidades en paquetes bien definidos (ui, model, data), siguiendo la convención de dominio invertido (cl.salmontt).

En términos funcionales, el sistema permite:

- Crear objetos a partir de las subclases (CentroCultivo y PlantaProceso) que heredan atributos y metodos de la superclase (UnidadOperativa).

- Filtrar y analizar la producción, destacando las unidades con mayor rendimiento.

- Mostrar la información procesada a través de una interfaz de usuario simple basada en consola.


🧱 Estructura general del proyecto

El proyecto está organizado en paquetes siguiendo la convención de dominio invertido (cl.salmontt), lo que facilita la escalabilidad y la claridad del código.

'''
├── 📂 ui/                   # Interfaz de Usuario (Entrada/Salida)
│   └── Main.java             # Punto de entrada. Coordina el flujo, carga y filtrado.
│
├── 📂 model/                # Definición de Objetos de Dominio
│   ├── UnidadOperativa.java  # Superclase base
│   ├── CentroCultivo.java    # Subclase que representa centros de cultivo
│   └── PlantaProceso.java    # Subclase que representa plantas de proceso
│
└── 📂 data/                 # Lógica de Datos y Persistencia
    └── GestorUnidades.java   # Maneja la lectura, escritura y filtrado de datos
'''


⚙️ Instrucciones para clonar y ejecutar el proyecto
Clonar el repositorio desde GitHub:

Opcion 1:
git clone https://github.com/DCaballero1164/POO1_A4_S6

Opcion2:
Archivo .jar en carpeta en main de GitHub -> out/artifacts/SalmonttApp.jar

Abrir el proyecto en IntelliJ IDEA (utilizar JDK 17 o superior).

Ejecutar el archivo Main.java desde el package ui.

Visualizar los resultados en la consola.

📌 Repositorio GitHub: https://github.com/DCaballero1164/POO1_A4_S6 📅 Fecha de entrega: [27/11/2025]