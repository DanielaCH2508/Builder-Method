/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderDocumento;

import Producto.Documento;
import ClasesConcretas.Json;
import ClasesConcretas.Xml;
import ClasesConcretas.eMail;
import Director.SolicitudDocumento;
import java.util.Scanner;

/**
 *
 * @author ASUS PC
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    private static SolicitudDocumento solicitudDocumento = new SolicitudDocumento();
    private static Scanner opcion = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Menu opciones\n"
                + "1. Xml\n"
                + "2. Json\n"
                + "3. E-mail\n"
        );
        switch (opcion.next()) {
            case "1": {
                PartesDocumento xml = new Xml();
                solicitudDocumento.setPartesDocumento(xml);
                solicitudDocumento.crearDocumento();
                Documento documento = solicitudDocumento.ImprimirDocumento();
                System.out.println(documento.toString());
                break;

            }
            case "2": {
                PartesDocumento json = new Json();
                solicitudDocumento.setPartesDocumento(json);
                solicitudDocumento.crearDocumento();
                Documento documento = solicitudDocumento.ImprimirDocumento();
                System.out.println(documento.toString());
                break;
            }
            case "3": {
                PartesDocumento email = new eMail();
                solicitudDocumento.setPartesDocumento(email);
                solicitudDocumento.crearDocumento();
                Documento documento = solicitudDocumento.ImprimirDocumento();
                System.out.println(documento.toString());
                break;
            }
            
            default: {
                System.out.println("No encontrado se encontro la opcion");
            }
        }
    }

}
