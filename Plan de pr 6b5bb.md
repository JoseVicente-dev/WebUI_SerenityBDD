# Plan de pruebas Screenplay SerenityBDD WebUI

Es necesario verificar el funcionamiento del sitio web [https://opensource-demo.orangehrmlive.com/](https://opensource-demo.orangehrmlive.com/)

Automatizar módulo administrativo:
El usuario se debe loguear (siempre es el mismo usuario y contraseña) y navegar por la
ruta "Admin - Job - Job Title" para añadir un título de trabajo usando todos los campos
del formulario para finalmente validar mensajes de éxito.

# Alcance

Se probaran los apartados Admin - Job - Job Title

**Fuera del alcance:** otros modulos del aplicativo. Otros escenarios fuera de los especificados en la estrategia de pruebas

# Estrategia de pruebas

Las pruebas se harán automatizadas usando el patron Screenplay con Serenity BDD

Se plantea añadir un título de trabajo usando todos los campos del formulario para finalmente validar mensajes de éxito.

**Cobertura de pruebas:** se ejecutarán en navegador Google Chrome, usando el SO Windows 10.

**Estrategia de pruebas**: se generaran datos aleatorios para usuarios usando librerias de aleatorizacion de java, asi como JAVA Faker en donde se requiera.

### Escenario

```markdown
# language: es
@FeatureName:administrarTrabajos
**Característica:** Administrar trabajos
  **Como** administrador del sistema
  **Deseo** crear, editar y borrar trabajos
  **Para** que se puedan definir roles y asignar cargos  

 @ScenarioName: crearNuevoTrabajo
 **Escenario**: crear un nuevo trabajo con todos los campos
	**Dado** que estoy en la pagina creacion de trabajos
  **Cuando** diligencie todos los campos para crear un nuevo trabajo
  **Entonces** se mostrara un mensaje de confirmacion del nuevo trabajo creado
```

| Username | Admin |
| --- | --- |
| Password | admin123 |
| JobTitle | [Aleatorio] |
| JobDescription | Lore ipsum |
| JobSpecification | [Imagen <1MB] |
| Note | Sin comentarios |

# Otros tipos de pruebas

Se recomienda al equipo realizar las siguientes pruebas:

- Pruebas de Rendimiento
- Pruebas de Seguridad

# Requerimientos

Acceso a ambiente de desarrollo