/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicados;

/**
 *
 * @author alfonsogalvanmadera
 */
public class Comprobar {
     public static void comprobar(String l,String p) throws ingreException{
        if(l.trim().length()==0||p.trim().length()==0)throw new ingreException();
        if(!l.equals("prueba")||!p.equals("pass"))throw new ingreException();
        
        
    }

    public void setVisible(boolean b) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
