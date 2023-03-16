
package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;


public class ListaModel {
   Queue<Clientes> ListaClientes = new LinkedList(); 
    
    public void EncolarCliente(String Ape, String Nom)
    {
        Clientes nuevoClientes = new Clientes(Ape,Nom);
        this.ListaClientes.add(nuevoClientes);
        JOptionPane.showMessageDialog(null, "CLIENTE AGREGADO:");
    }
 
public Queue ListarClientes()
{
    
    return this.ListaClientes;
       
}
    
   public void DesEncolar()
   {
    this.ListaClientes.poll();
   }
    
}

