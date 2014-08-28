brms-drools-evaluacioncrediticia
================================
POC de evaluación crediticia a través de Drools y BRMS

Contenido del repositorio
-------------------------
* Directorio evaluacioncrediticia: proyecto maven KIE que contiene reglas y procesos
* Directorio evaluacioncrediticia-app: proyecto maven Java con aplicación standalone consumidora de las reglas/procesos 

Descarga de kmodule en BRMS
----------------------------
1. Clonar en BRMS 6.0.2 el repositorio: https://github.com/gleotta/brms-drools-evaluacioncrediticia
2. Selecionar para trabajar el proyecto `evaluacioncrediticia`
3. Realizar Build & Deploy del proyecto 
4. Verificar que se haya contruido la unidad de deploy `evaluacioncrediticia-1.1.jar`

Descarga de aplicación consumidora
-----------------------------------
1. Dentro de directrio [USER_HOME]/git clonar repositorio: 
>git clone https://github.com/gleotta/brms-drools-evaluacioncrediticia

2. Realizar build de la aplicación con maven:
>cd [USER_HOME]\git\brms-drools-evaluacioncrediticia\evaluacioncrediticia-app
>mvn clean install

3. Ejecutar aplicación con jar generado:
>java -jar target/evaluacioncreditica-app-full.jar

4. Verificar correcta ejecución:

```
Productos:
Producto [montoLimite=5000.0, tipoOperacion=1, estrato=1]
Producto [montoLimite=7000.0, tipoOperacion=1, estrato=2]
Producto [montoLimite=9000.0, tipoOperacion=1, estrato=2]
Producto [montoLimite=5000.0, tipoOperacion=2, estrato=1]
Producto [montoLimite=8000.0, tipoOperacion=2, estrato=2]

Prospecto:Prospecto [identificador=1234, nombre=Pepe, relacionDependencia=true, salario=6850.0, ]
Central Riesgo:CentralRiesgo [cantidadOperacion=1, tipoOperacion=1, totalDeuda=125.0]
Central Riesgo:CentralRiesgo [cantidadOperacion=2, tipoOperacion=1, totalDeuda=225.0]
Central Riesgo:CentralRiesgo [cantidadOperacion=3, tipoOperacion=1, totalDeuda=525.0]
Evaluando...
Finalizado...
Valor Prospecto:Prospecto [identificador=1234, nombre=Pepe, relacionDependencia=true, salario=6850.0, totalDeuda=874.0, capacidadEndeudamiento=553.0, estrato=2, ofertas=[com.sample.domain.Oferta@6eeb967b, com.sample.domain.Oferta@2ce49e21, com.sample.domain.Oferta@55499f8d]]
Cantidad de ofertas encontradas: 3
Producto Tipo Operacion: 1
Producto Monto Limite: 7000.0
Producto Monto Aprobado: 553.0
Producto Target: 2
Prospecto Target: 2

Producto Tipo Operacion: 1
Producto Monto Limite: 9000.0
Producto Monto Aprobado: 553.0
Producto Target: 2
Prospecto Target: 2

Producto Tipo Operacion: 2
Producto Monto Limite: 8000.0
Producto Monto Aprobado: 553.0
Producto Target: 2
Prospecto Target: 2
```

Utilizar en JDeveloperStudio
-----------------------------
1. Agregar repositorio local desde la perspectiva de Git
Opción: `Add an existing local Git Repository to this view`

2. Importar proyecto con Boton Derecho sobre `Working Directory -> evaluacioncrediticia-app`

3. Luego sobre el poryecto importado boton derecho `Configure -> Convert To Maven Project`

4. Ejecutar clase `com.sample.EvaluacionMain` 
