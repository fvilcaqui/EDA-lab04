<div align="center">
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">DEPARTAMENTO ACADÉMICO DE INGENIERÍA DE SISTEMAS E INFORMÁTICA</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: INFORME DE LABORATORIO</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>
<div align="center">
<span style="font-weight:bold;">GUÍA DE LABORATORIO</span><br />
</div>

<table>
<theader>
<tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
<tr><td>ASIGNATURA:</td><td colspan="5">Estructura de Datos y Algoritmos</td></tr>
<tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Pilas y Colas</td></tr>
<tr>
<td>NÚMERO DE PRÁCTICA:</td><td>02</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
</tr>
<tr>
<td>FECHA INICIO::</td><td>06-Jun-2022</td><td>FECHA FIN:</td><td>10-Jun-2022</td><td>DURACIÓN:</td><td>02 horas</td>
</tr>
<tr><td colspan="6">RECURSOS:
</td>
</<tr>
  <tr><td colspan="6">ALUMNO:
<ul>
<li>Frank's Vilca Quispe - fvilcaqui@unsa.edu.pe</li>
</ul>
</td>
</<tr>
<tr><td colspan="6">DOCENTES:
<ul>
<li>Richart Smith Escobedo Quispe - rescobedoq@unsa.edu.pe</li>
</ul>
</td>
</<tr>
</tdbody>
</table>

#
   ## SOLUCION Y RESULTADOS
#

## I. SOLUCION DE EJERCICIOS/PROBLEMAS
   EJERCICIO 1:
 1.  Utilizar el tipo generico de Lista Enlazada para generar los peores casos y ejecutar el algoritmo de ordenamiento.
    
             public long OrdenarInsercionSimple() {
		 Node<E> cont2 = this.first;
		 long nano_startTime = System.nanoTime(); 
		 while(cont2.getNext() !=null) {
			 E key= null;
			 Node<E> cont = this.first;
			 Node<E> aux = this.first;
			 for(; cont.getNext() != null && aux.getNext() != null && (int)aux.getData() > (int)aux.getNext().getData() ; cont = cont.getNext()) {
				 key = aux.getNext().getData();
				 while((int)aux.getData() > (int)aux.getNext().getData()) {
	                 aux.getNext().setData(aux.getData());
			       	}
	             aux.setData(key);
	             aux = aux.getNext();
	             System.out.println(toString());
			 }
			 cont2 = cont2.getNext();
		 }
		 long nano_endTime = System.nanoTime();		
		 return nano_endTime - nano_startTime;	
	    }		
    
      
    
    
Resultados:

![image](https://user-images.githubusercontent.com/87882802/173258980-77bdd35f-a861-40e6-94cf-e5f2557f36e8.png)


   EJERCICIO 2:
2.  Utilizar el tipo generico de Doble Lista Enlazada para generar los peores casos y ejecutar el algoritmo de ordenamiento.
	
	 public void OrdenarInsercionDoble() {
		Node<E> a = this.first;
		Node<E> cont = this.first;
		E key = null;
		Node<E> aux = this.first;
		aux = aux.getNext();                 //Este for es para que se haga la insercion en cada uno de los valores
		for(;a.getNext() != null; a = a.getNext()) {
			cont = aux;     //En este while veremos si se da la condicion para intercambiar de posiciones
			while(cont.getAnt() != null && (int)cont.getAnt().getData()>(int)cont.getData()) {
				key = cont.getAnt().getData();      //En aqui guardamos el valor anterior
				cont.getAnt().setData(cont.getData());  //aqui damos el valor actual ala anterior posicion
				cont.setData(key);   //Aqui  le damos el valor anterior a la posicion actual
				cont = cont.getAnt();  //y que se compruebe ahora con el anterior valor
			}
			aux = aux.getNext();     //Para que continue con el siguiente valor en la insercion
			System.out.println(toString());  //Para que imprima mi resultado
		}     		
	}
    

   Resultados:
	
![image](https://user-images.githubusercontent.com/87882802/173260974-82801b7d-9f13-432b-809d-c57ece10dfbf.png)

	
## II. SOLUCION DEL CUESTIONARIO

¿Cómo se ejecutaría sus implementaciones desde terminal(consola)? 

Primero buscaria la ruta del jar por consola y copiar en una carpeta del usuario, luego ingreso a la carpeta que contiene mi .jar
y ejecuto el comando java -jar con el nombre de mi archivo .jar y podria usar ya la implemetacion.
 




#

   ## BIBLIOGRAFIA
    - https://www.w3schools.com/java/
    
    - https://www.eclipse.org/downloads/packages/release/2022-03/r/eclipse-ide-enterprise-java-and-web-developers
    
    - https://javaplot.panayotis.com/
    
    - https://sourceforge.net/projects/gnuplot/files/gnuplot/5.4.3/


   
#

  
