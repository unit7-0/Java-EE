package com.unit7.jee.ejb;

import javax.ejb.Remote;

/**
 * Created by breezzo on 12.12.15.
 */
@Remote
public interface SimpleRemote {
    String help();
}
