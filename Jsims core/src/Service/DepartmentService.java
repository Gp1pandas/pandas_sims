/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Domain.College;

/**
 *
 * @author hp
 */

public interface IDepartmentService {
    boolean register(College college);
}

public class DepartmentService implements IDepartmentService {
    @Override
    public boolean register(College college) {
        // Implement logic here
        return true;
    }
}
