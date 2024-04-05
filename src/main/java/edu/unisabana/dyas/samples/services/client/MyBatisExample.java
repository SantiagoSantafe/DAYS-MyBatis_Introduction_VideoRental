/*
 * Copyright (C) 2015 cesarvefe
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.unisabana.dyas.samples.services.client;



import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import edu.unisabana.dyas.sampleprj.dao.mybatis.mappers.ClienteMapper;
import edu.unisabana.dyas.sampleprj.dao.mybatis.mappers.ItemMapper;
import edu.unisabana.dyas.samples.entities.Cliente;
import edu.unisabana.dyas.samples.entities.Item;
import edu.unisabana.dyas.samples.entities.TipoItem;

/**
 *
 * @author cesarvefe
 */
public class MyBatisExample {

    /**
     * Método que construye una fábrica de sesiones de MyBatis a partir del
     * archivo de configuración ubicado en src/main/resources
     *
     * @return instancia de SQLSessionFactory
     */
    public static SqlSessionFactory getSqlSessionFactory() {
        SqlSessionFactory sqlSessionFactory = null;
        if (sqlSessionFactory == null) {
            InputStream inputStream;
            try {
                inputStream = Resources.getResourceAsStream("mybatis-config.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return sqlSessionFactory;
    }

    /**
     * Programa principal de ejempo de uso de MyBATIS
     * @param args
     * @throws SQLException 
     */
    public static void main(String args[]) throws SQLException {
        SqlSessionFactory sessionfact = getSqlSessionFactory();

        SqlSession sqlss = sessionfact.openSession();
    
        //para formato de fecha
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        //Crear el mapper
        ClienteMapper cm=sqlss.getMapper(ClienteMapper.class);
        ItemMapper im= sqlss.getMapper(ItemMapper.class);

        //Consultar los clientes y sus rentados
        System.out.println("\n Ver todos los clientes \n" + cm.consultarClientes());

        //Consultar todos los Items
        System.out.println("\n Ver todos los items \n" + im.consultarItems());
        
        //Permite crear un item nuevo
        TipoItem tipo = new TipoItem(7, "nada bro");
        Item nuevo = new Item(tipo, 7, "Papel", "Papel comestible", new Date(),  (long)200, "renta" , "m");
        im.insertarItem(nuevo);
        System.out.println("\n Guardando item nuevo.......");

        //Permite crear un cliente nuevo
        Cliente nuevoCli = new Cliente ("Juan", 010201012, "3155858555", "Avenida carrera", "correo@prueba.com");
        cm.insertCliente(nuevoCli);
        System.out.println("\n Guardando cliente nuevo.......");

        //Permite consultar uno de los items 
        System.out.println("\n Consultar item 2" + im.consultarItem(2));

        //permite consultar uno de los clientes
        System.out.println("\n Cliente item 123456789" + cm.consultarCliente(123456789));
        
        //agrega un iteem rentado al cliente
        System.out.println("\n Guardando item rentado nuevo.......");
        cm.addItemRentado(5, 123456789, 5, dateFormat.format(new Date()), dateFormat.format(new Date()));
        
        sqlss.commit();
        
        
        sqlss.close();

        
        
    }


}
