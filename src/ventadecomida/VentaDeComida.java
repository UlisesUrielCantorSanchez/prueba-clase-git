/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventadecomida;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VentaDeComida {

    public static void main(String[] args) {
        Platillo platillo = new Platillo();
        List<Platillo> platillos = new ArrayList<>();
        int entrada, entradaPlatillos,total=0;
        int contChil=0, contPos=0, contTac=0,contPast=0,contHel=0,contFlan=0,contCoca=0,contPeps=0,contFanta=0;
        String ticket="Ticket:\n";
        do{
        entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Fonda 123"
                + "\nOpciones"
                + "\n1.-Platillos"
                + "\n2.-Postres"
                + "\n3.-Bebidas"
                + "\n4.-Salir"));     
        switch(entrada){
            case 1:
                entradaPlatillos = Integer.parseInt(JOptionPane.showInputDialog(null,"Menu Platillos\n"
                        + "\nChilaquiles - 80"
                        + "\nPosole - 70"
                        + "\nTacos - 50"));
                if(entradaPlatillos == 1){
                    contChil++;                          
                }
                else if(entradaPlatillos == 2){
                    contPos++;
                }
                else if(entradaPlatillos == 3){
                    contTac++;
                }else{
                    JOptionPane.showMessageDialog(null, "La opción no existe");
                }
                break;
            case 2:
               entradaPlatillos = Integer.parseInt(JOptionPane.showInputDialog(null,"Menu Postres\n"
                        + "\n1.-Pastel - 60"
                        + "\n2.-Helado - 40"
                        + "\n3.-Flan - 30"));
                if(entradaPlatillos == 1){
                    contPast++;                          
                }
                else if(entradaPlatillos == 2){
                    contHel++;
                }
                else if(entradaPlatillos == 3){
                    contFlan++;
                }else{
                    JOptionPane.showMessageDialog(null, "La opción no existe");
                }
                break;
            case 3:
                entradaPlatillos = Integer.parseInt(JOptionPane.showInputDialog(null,"Menu Bebidas\n"
                        + "\n1.-Coca cola - 20"
                        + "\n2.-Pepsi - 18"
                        + "\n3.-Fanta - 17"));
                if(entradaPlatillos == 1){
                    contCoca++;                          
                }
                else if(entradaPlatillos == 2){
                    contPeps++;
                }
                else if(entradaPlatillos == 3){
                    contFanta++;
                }else{
                    JOptionPane.showMessageDialog(null, "La opción no existe");
                }
                break;
                default:
                    JOptionPane.showMessageDialog(null, "La opcion no exixte");
                    break;
        }
        }while(entrada != 4);
        if(contChil >= 1){
            platillos.add(new Platillo("Chilaquiles", contChil, 80));
        }
        if(contPos >= 1){
            platillos.add(new Platillo("Posole", contPos, 70));
        }
        if(contTac >= 1){
            platillos.add(new Platillo("Tacos", contTac, 50));
        }
        if(contPast >= 1){
            platillos.add(new Platillo("Paste", contPast, 60));
        }
        if(contHel >= 1){
            platillos.add(new Platillo("Helado", contHel, 40));
        }
        if(contFlan >= 1){
            platillos.add(new Platillo("Flan", contFlan, 30));
        }
        if(contCoca >= 1){
            platillos.add(new Platillo("Coca-cola", contCoca, 20));
        }
        if(contPeps >= 1){
            platillos.add(new Platillo("Pepsi", contPeps, 18));
        }
        if(contFanta >= 1){
            platillos.add(new Platillo("Fanta", contFanta, 17));
        }
        
        for(Platillo p: platillos){
            ticket += p+"\n";
            total += p.getCantidad() * p.getPrecio();
        }
     
        JOptionPane.showMessageDialog(null,ticket+"Total: "+total);
    }    
}
