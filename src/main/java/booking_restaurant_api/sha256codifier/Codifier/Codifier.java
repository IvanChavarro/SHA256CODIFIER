/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking_restaurant_api.sha256codifier.Codifier;

import booking_restaurant_api.sha256codifier.CodifierInferface.ICodifier;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Iván
 */
public class Codifier implements ICodifier {

    @Override
    public String conversorSha(String pass) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
        byte[] hashCode = md.digest(pass.getBytes());
        StringBuffer sb = new StringBuffer();
        for (byte b : hashCode) {
            sb.append(String.format("%02x",b));
        }
        return sb.toString();
    }

}
