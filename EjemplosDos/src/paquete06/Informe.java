/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author UTPL
 */
public class Informe {

    public static void imprmir(String nombre, String apellidoRetornado,
            String ciudad, double[] misNotas,
            double promedio, String empresa, String direccion) {
        String lista = "";
        for (int i = 0; i < misNotas.length;i++){
        lista = String.format("%s%s\n", lista, misNotas[i]);
        }
        System.out.printf("\n----------------------\n"
                + "Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "Direccion de la empresa: %s\n"
                + "Empresa: %s\n"
                + "Promedio: %.2f\n"
                + "Listado de notas:\n%s\n",
                nombre,
                apellidoRetornado,
                ciudad,
                direccion,
                empresa,
                promedio,
                lista);
    }

}
