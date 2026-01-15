/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        
        double[] misNotas;
        double promedio;
        
        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
        
        
        System.out.printf("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "Promedio: %.2f\n",
                nombre,
                apellidoRetornado,
                ciudad,
                promedio);
    }
    
}
/*
El codigo dado se encarga primeramente en el paquete02 y la clase DatoPersonal 
de pedir por entrada el nombre del usuario y su apellido dentro de un solo 
paquete y clase, luego dentro del paquete03 en la clase DatosUbicacion se pedira
la ciudad a la que pertenece, luego en el paquete04 y su clase se requiere que 
el usuario ingrese sus notas las cuales deben ser 4 porque el limite es ese y 
retornara las notas, dentro del paquete05 se va a calcular el promedio de las 
notas y se retornara el promedio, para que dentro de la clase Principal.java 
se presente un reporte con todos los datos ingresados (Nombre, Apellido, Ciudad)
junto con el promedio calculado mediante las notas ingresadas por el usuario.
*/
