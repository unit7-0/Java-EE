package com.unit7.jee.ejb;

import javax.ejb.Local;

/**
 * Created by breezzo on 12.12.15.
 */
@Local
public interface SimpleLocal {
    String help();
}
