# language: es
@FeatureName:administrarTrabajos
Característica: Administrar trabajos
  Como administrador del sistema
  Deseo crear, editar y borrar trabajos
  Para que se puedan definir roles y asignar cargos

  @ScenarioName: crearNuevoTrabajo

  Escenario: crear nuevo trabajo
    Dado que estoy en la pagina creacion de trabajos
    Cuando diligencie todos los campos para crear un nuevo trabajo
    Entonces se mostrara un mensaje de confirmacion del nuevo trabajo creado
