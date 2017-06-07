/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoFinal.facade;

import com.proyectoFinal.Entidades.HistorialReserva;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author VJ
 */
@Stateless
public class HistorialReservaFacade extends AbstractFacade<HistorialReserva> {

    @PersistenceContext(unitName = "com.example_mavenproject1_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HistorialReservaFacade() {
        super(HistorialReserva.class);
    }
    
}
