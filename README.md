# Sistema de Gestión de Flotas Inteligente (MVP)

Este proyecto es un MVP (Producto Mínimo Viable) para gestionar flotas de vehículos inteligentes. Está diseñado con un enfoque modular y escalable para adaptarse a diferentes industrias (logística, transporte público y servicios de entrega).

-------------------------------------------------------------------------------

## **Arquitectura del Sistema**

### **Estilo Arquitectónico**
- **Tipo:** Monolito granular.
- **Razón:** Se busca facilidad al correr la fase inicial en un solo servidor (monolito), separando por patrones de diseño cada archivo en el proyecto (Modelo de vista controlado). 
Ademas se tiene en cuenta que las flotas de vehiculos por empresa no tienden a crecer a gran escala en poco tiempo, pues el costo de cada uno de estos vehiculos es muy alto.

- **Principios que debemos aplicar:**
  - **SOLID**: Se debe respetar este principio durante todo el proyecto, para garantizar funcionalidad y adaptacion a los cambios durante su elaboración y mantenimiento.
  - **12 Factores**: se debe cumplir cada uno de estos factores para asi asegurar escalabilidad, reduccion de errores y orden en el codigo y su funcionalidad.
- **Trade-offs:**
  -Rapidez en su elaboración **VS**  Si el sistema escala (horizontalmente) tomara tiempo su modificación.
  - Las modificaciones en el sistema son más fáciles de coordinar porque todo está en un solo lugar **VS** Los módulos son dependientes entre sí, lo que puede dificultar que equipos diferentes trabajen en paralelo.
  -Velocidad para la interacción de datos **VS** Si hay muchos usuarios el sistema podria volverse lento (cuello de botella)
  -Bajo presupuesto inicial **VS** Si el sistema crece, separarlo por microservicios tomara tiempo y dinero.
  -Rapidez al aplicar los cambios **VS** Si un componente colapsa, se rompe todo el sistema
  -La seguridad en la privacidad sera facil de manejar pues todo estara en un solo servidor **VS** si algo es hackeado podran afectar a todo el sistema
  -Orden en el codigo (Modulos) **VS** Tiempo de creacón en las interfaces de usuarios
  

---

## **Estructura del Proyecto**
El proyecto sigue el patrón arquitectónico MVC (Modelo-Vista-Controlador) para mantener una separación clara de responsabilidades.

- **`modelo/`**: Contiene la lógica relacionada con datos, como creación, rutas o conductores
- **`vista/`**: Contiene todo lo visual, es decir, lo que el usuario consumira
- **`controlador/`**: Contiene la lógica de control para manejar solicitudes HTTP e interactuar entre el usuario y los datos

---

