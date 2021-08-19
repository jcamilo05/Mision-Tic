/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import modelo.Direcciones;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author camil
 */
@Repository
public interface RepositorioDirecciones extends CrudRepository<Direcciones, Long>{
    
}