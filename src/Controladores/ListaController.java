
package Controladores;

import Modelos.Clientes;
import Modelos.ListaModel;
import Vistas.frmListas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;


public class ListaController implements ActionListener {
frmListas VistaLista;
ListaModel ModeloLista;

    public ListaController(frmListas VistaLista, ListaModel ModeloLista) {
        this.VistaLista = VistaLista;
        this.ModeloLista = ModeloLista;
        
        //Poner a la escucha los botones
        this.VistaLista.btnAtenderCliente.addActionListener(this);
        this.VistaLista.btnAtenderTodos.addActionListener(this);
        this.VistaLista.btnIngresarCliente.addActionListener(this);
        
        //Levantar la vista de Lista
        this.VistaLista.setLocationRelativeTo(null);
        this.VistaLista.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaLista.btnIngresarCliente)
        {
            this.ModeloLista.EncolarCliente(this.VistaLista.txtApellidos.getText(),
                    this.VistaLista.txtNombres.getText());
            
            //mostrar los datos en el text area
            Queue <Clientes> ListaLocal = this.ModeloLista.ListarClientes();
            
            String Cadena = "";
           for (Clientes MiListaClientes: ListaLocal)
               
               Cadena = Cadena + MiListaClientes.getApellidos()+" "+MiListaClientes.getNombres()+"\n";
            this.VistaLista.txtListaClientes.setText(Cadena);
        }
    }
    
}
