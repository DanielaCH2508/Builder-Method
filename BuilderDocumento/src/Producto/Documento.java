/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto;

/**
 *
 * @author ASUS PC
 */
public class Documento {
    
    private String encabezado;
    private String cuerpo;
    private String pie;

    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public void setPie(String pie) {
        this.pie = pie;
    }

    @Override
    public String toString() {
        return "Documento{" + "\n Encabezado: " + encabezado + ",\n Cuerpo: " + cuerpo + ",\n Pie: " + pie + " \n}";
    }
    
}
