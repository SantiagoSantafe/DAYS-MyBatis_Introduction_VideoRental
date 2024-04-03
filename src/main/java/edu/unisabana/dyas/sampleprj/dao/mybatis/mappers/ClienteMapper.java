package edu.unisabana.dyas.sampleprj.dao.mybatis.mappers;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import edu.unisabana.dyas.samples.entities.Cliente;
import edu.unisabana.dyas.samples.entities.Item;

/**
 *
 * @author cesarvefe
 */
public interface ClienteMapper { 
    
    /**
     * Registrar un nuevo item rentado asociado al cliente identificado
     * con 'idc' y relacionado con el item identificado con 'idi'
     * @param id
     * @param idit
     * @param fechainicio
     * @param fechafin 
     */
    public void agregarItemRentadoACliente(int id, 
            int idit, 
            Date fechainicio,
            Date fechafin);

    /**
     * Consultar todos los clientes
     * @return 
     */
    public List<Cliente> consultarClientes();

    public void insertCliente(@Param("cliente")Cliente cli);

    public Cliente consultarCliente(@Param("idcli") int id);

    public void addItemRentado(@Param("idcli") int cliente, @Param("item")int itId, @Param("ITEMS_id") int itemId, @Param("fechaIn") Date fechaIn, @Param("fechaFin") Date fechaFin);
    
}
