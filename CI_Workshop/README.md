Workshop de Integración Continua
================================

> "Kent Beck publicó en su escrito inaugural de eXtreme Programming su propuesta, en donde los desarrolladores deberían 'integrar y probar varias veces al día', la cual fue revolucionaria. Consagrado en XP como la regla de _Integración a menudo_, la frecuente integración del código principal permitirá a los desarrolladores rapidamente descubrir los problemas de integración y reducir el costo de desarrollo"

CI es una práctica de desarrollo que requiere que los desarrolladores integren código en un repositorio compartido varias veces al día. Cada registro en el repositorio es verificado por una construcción automática, permitiendo a los equipos detectar problemas lo más rápido posible.

Al integrar regularmente, podemos detectar errores rápidamente, y ubicarlos más fácilmente.

Si bien podemos revisar los valores y principios del **manifiesto ágil** para ver como esto se alinea con dicha filosofía.

## Resolver problemas rápidamente

Debido a que estamos integrando tan frecuentemente, existe significativamente menos rastreo para descubrir que cosas están mal, de tal forma que podemos gastar más tiempo en construir nuevas características.

La integración continua es barata. No integrar de forma continua puede resultar muy caro, si no seguimos una aproximaciòn de continuidad tendremos períodos largos de integración. Esto hace exponecialmente más díficil encontrar y arreglar problemas. Dichos problemas de integración pueden golpear fácilmente un proyecto fuera de tiempo, o simplemente hacer que falle.

CI simplemente brinda los siguientes beneficios a las organizaciones:

* Elimina la tensión larga de las integraciones de código.
* Incrementa la visibilidad, la cual permite mayor comunicación.
* Atrapa problemas rápido y los resuelve de raíz.
* Pasamos menos tiempo depurando(debug) y más tiempo agregando nuevas características.
* Ofrece la confianza de que estamos construyendo dobre una vase sólida.
* Termina las esperas para determinar su el código va a funcionar.
* Reduce los problemas de integración permitiendo entregar más rápidamente.

## Más que un proceso

La Integración Continua se respalda de varias principios y prácticas importantes:

### Las prácticas

- Mantener un repositorio de código
- Automatizar la construcción
- Hacer que la construcción se auto-pruebe
- Cada _commit_ debe construirse en una máquina de integración
- Mantener la construcción rápida
- Probar en un clon del ambiente de producción(Stage, UAT)
- Hacer fácil para cualquiera obtener el último ejecutable
- Todos podemos ver lo que está pasando
- Automatizar el despliegue

### ¿Cómo hacerlo?

- Los desarrolladores revisan el código en sus espacios de trabajo privado
- Cuando esta _hecho_, entonces hacen _commit_ de los cambios al repositorio
- El servidor de CI monitorea el repositorio y verifica cuando algún cambio ocurre
- El servidor de CI construye el sistema y corre las pruebas de unidad y de integración
- El servidor de CI libera artefactos desplegables para pruebas
- El servidor de CI asigna una etiqueta de construcción a la versión de código que se acaba de construir
- El servidor de CI informa al equipo de la construcción satisfactoria
- Si la construcción o las pruebas fallan, el servidor de CI alerta al equipo
- El equipo repara el problema tan pronto como tenga oportunidad
- Se mantiene integrando continuamente y se hacen las pruebas a través del proyecto

### Las responsabilidades del equipo

- Revisar y obtener las versiones de código frecuentemente
- No introducir código roto
- No intriducir código sin pruebas
- No introducir código alterno a un error cuando la construcción está rota
- No irse a casa hasta despúes de revisar que el sistema se construye

Muchos equipos desarrollan rituales en torno a estas políticas, es decir, los equipos se administran eficazmente a sí mismos, eliminando la necesidad de hacer cumplir las políticas más altas(las cuales a veces son innecesarias).

### Despliegue continuo

- El despliegue continuo está cercamente relacionado a la Integración Continua, y se refiera a la liberación en producción de software que pasa las pruebas automatizadas
- Esencialmente, "es la práctica de liberar cada construcción buena a los usuarios"
- Con esta práctica no sólo se reducen riesgos y se atrapan errores rápidamente, sino que se avanza más rápido construyendo software
- Con liberaciones de bajo riesgo, podemos rápidamente adaptar los requerimientos de negocio y las necesidades de usuario. Permitiendo una gran colaboración entre la operación y la entrega, impulsando un cambio real en la organización, y convirtiendo el proceso de liberación en una ventaja empresarial.
- No visto en este Workshop

### Comunicación, inspección y adaptación

- El servidor de CI puede informar por varios medios acerca de los estados de ejecución
- Adicionalmente, podemos obtener más datos de las pruebas que nos servirán para mejorar la calidad del software(Métricas)
- Podremos determinar la cantidad de código que se esta probando, y determinar si existen piezas de software sin probar o sin usar
- Podremos identificar varias áreas de oportunidad en función del proyecto/empresa en la que estemos
- Podremos implementar herramientas de monitoreo y reporteo que permiten determinar la salud de la aplicación

#### Tecnología

CI: Jenkins, Travis CI, ThoughtWorks GO, CircleCI, JetBrains TeamCity, Atlassian Bamboo
Code Metrics: SonarQube, SLOC (and variants), SciTools Understand
Version Control: Git, Mercurial, Perforce, Subversion, TFS
Artifact Repository Managers: Archiva, Artifactory, Nexus (roll-your-own with zip files, metadata, shared storage, and access controls)
Language-specific package Managers: Composer (PHP), Ruby Gems, npm (Node.js), Python PIP
