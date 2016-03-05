/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.venko.almacen.services;

import co.venko.almacen.controller.util.Utilities;
import co.venko.almacen.session.UsersFacade;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import co.venko.almacen.entities.Users;

/**
 *
 * @author Usuario
 */
public class AuthUser {

    private static final UsersFacade usersFacade = lookupUsersFacadeBean();

    public static boolean validateUser(String user, String passwd) {
        Users u = usersFacade.find(user);
        if (u != null) {
            passwd = Utilities.encrypt(passwd);
            System.out.println("pass user: " + u.getPasswd());
            System.out.println("pass url:  " + passwd);
            if (passwd.equals(u.getPasswd())) {
                return true;
            }
        }
        return false;
    }

    private static UsersFacade lookupUsersFacadeBean() {
        try {
            Context c = new InitialContext();
            return (UsersFacade) c.lookup("java:global/VerifiquesePremiumAlmacen/UsersFacade!co.venko.almacen.session.UsersFacade");
        } catch (NamingException ne) {

            throw new RuntimeException(ne);
        }
    }

}
