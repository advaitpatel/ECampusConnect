/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.project.ecampusconnect.department;

import javax.ejb.Local;

/**
 *
 * @author Advait
 */
@Local
public interface DepartmentServiceLocal 
{
    String service(String computer_science);
}
