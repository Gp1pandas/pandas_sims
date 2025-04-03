/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistance;

import Domain.College;

/**
 *
 * @author hp
 */
public interface CollegePersistance {

    /**
     *
     * @param college
     * @return
     */
    public boolean save(College college);
}
