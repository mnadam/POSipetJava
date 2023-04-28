/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sipet;

/**
 *
 * @author Adam
 */
public class UserSession {
    private static String u_username;
    private static String u_nama_user;
  
    
  
    
    //SESSI OPERATOR
    public static String getU_username() {
        return u_username;
    }

    public static void setU_u_username(String u_username) {
        UserSession.u_username = u_username;
    }

    public static String getU_nama_user() {
        return u_nama_user;
    }

    public static void setU_nama_user(String u_nama_user) {
        UserSession.u_nama_user = u_nama_user;
    }
}
