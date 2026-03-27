# Proyecto_Final

## Grupo 
grupo # 3

## Integrantes
GUEVARA MORA ISAAC EDUARDO, 
, ORTEGA BARRANTES MARIA DAYANNARA
, PALMA ZAVALA DANIEL
, GONZALEZ MARTINEZ FELIPE

## Descripción del proyecto
Este proyecto consiste en desarrollar un sistema para gestionar eventos deportivos. 
El sistema permite registrar eventos, administrar participantes, programar partidos 
y consultar resultados utilizando diferentes estructuras de datos.

## Cómo ejecutar el proyecto
1. Descargar el proyecto desde el repositorio.
2. Abrir el proyecto en NetBeans
3. Compilar el proyecto.
4. Ejecutar la clase principal Main.

## Menú del sistema
El sistema permite:
- Registrar eventos deportivos
- Registrar participantes
- Programar partidos
- Consultar eventos
- Consultar resultados
- Ver clasificación de equipos

## Arquitectura MVC

**Modelo:** contiene las clases de datos y estructuras utilizadas.  
**Vista:** contiene las interfaces gráficas   
**Controlador:** conecta la vista con el modelo y gestiona las acciones del usuario.

## Estructuras de datos utilizadas

- Lista enlazada simple para gestionar eventos.
- Lista doblemente enlazada para participantes.
- Cola dinámica para programar partidos.
- Pila dinámica para almacenar resultados.
- Grafo para representar enfrentamientos entre equipos.
- Árbol binario de búsqueda para la clasificación de equipos.

## Interfaz gráfica completa
Se desarrolló una interfaz gráfica basada en Java Swing, donde la aplicación inicia con una pantalla de autenticación (LoginVista) que permite a los usuarios ingresar al sistema mediante su correo electrónico y contraseña. Esta ventana incluye campos de texto para el ingreso de credenciales y botones de acceso rápido para roles de demostración como Administrador y Espectador. La validación del acceso se maneja mediante eventos ActionListener, y los mensajes de error o confirmación se muestran mediante JOptionPane.

Una vez autenticado, el usuario accede al panel principal del administrador (MenuAdmin), implementado como un JFrame que funciona como la ventana principal del sistema y contiene una barra de navegación superior con opciones como Menú, Nosotros y Contacto. Desde esta interfaz se puede acceder a los diferentes módulos del sistema relacionados con la administración de eventos deportivos. Entre ellos se encuentra el módulo Gestión de Eventos (GestionEventos), el cual permite administrar la información de los eventos registrados mediante un campo de búsqueda, filtros por deporte y estado, y botones de acción como Crear Evento, Editar y Eliminar. 

Los resultados se presentan en una tabla (JTable) donde se muestran datos como nombre del evento, deporte, fecha y estado. Además, se implementó el módulo Gestión de Participantes (GestionParticipantes), que permite visualizar y administrar los participantes de los eventos mediante un campo de búsqueda, un selector de eventos y botones para agregar, editar o eliminar registros. La información también se muestra en una tabla para facilitar su visualización y control. La interacción con los diferentes componentes de la interfaz se gestiona mediante ActionListener en los botones, mientras que la visualización de los datos se realiza utilizando JTable y modelos de tabla, lo que permite mantener una estructura clara entre la interfaz gráfica y la lógica del sistema.
