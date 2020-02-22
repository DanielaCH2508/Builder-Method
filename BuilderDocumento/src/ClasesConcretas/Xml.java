/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesConcretas;

import BuilderDocumento.PartesDocumento;

/**
 *
 * @author ASUS PC
 */
public class Xml extends PartesDocumento {

    @Override
    public void construirEncabezado() {
        documento.setEncabezado("Encabezado documento Xml");
    }

    @Override
    public void construirCuerpo() {
        documento.setCuerpo("Cuerpo documento Xml");
    }

    @Override
    public void construirPie() {
        documento.setPie("Pie documento Xml");
    }

}
