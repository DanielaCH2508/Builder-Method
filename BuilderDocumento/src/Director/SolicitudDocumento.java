/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Director;

import Producto.Documento;
import BuilderDocumento.PartesDocumento;

/**
 *
 * @author ASUS PC
 */
public class SolicitudDocumento {

    private PartesDocumento partesDocumento;

    public SolicitudDocumento() {

    }

    public void setPartesDocumento(PartesDocumento partesDocumento) {
        this.partesDocumento = partesDocumento;
    }

    public Documento ImprimirDocumento() {
        return this.partesDocumento.getDocumento();
    }

    public void crearDocumento() {
        this.partesDocumento.crearNuevoDocumento();
        this.partesDocumento.construirEncabezado();
        this.partesDocumento.construirCuerpo();
        this.partesDocumento.construirPie();
    }

}
