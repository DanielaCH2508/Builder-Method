/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderDocumento;

import Producto.Documento;

/**
 *
 * @author ASUS PC
 */
public abstract class PartesDocumento {
    
    protected Documento documento;
    
    public Documento getDocumento(){
        return documento;
    }
    
    public void crearNuevoDocumento(){
        this.documento = new Documento();
    }
    
    public abstract void construirEncabezado();
    public abstract void construirCuerpo();
    public abstract void construirPie();
}
