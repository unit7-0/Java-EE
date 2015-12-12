package com.unit7.jee.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 * Created by breezzo on 06.12.15.
 */
@Stateless
public class SimpleEjb implements SimpleLocal, SimpleRemote {

    @Inject
    private EntityManager em;

    @Override
    public String help() {
        return "CDI works fine!";
    }
}
