package io.github.abhimanbhau.paidapp;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by akolte on 1/23/18.
 */

public class SecureRegistration {
    static String TAG = "PAID_APP";
    static String key = "c1c057883d7fcdc7b9231de2646100ed";
    static boolean success = false;

    public static boolean isLegit(String uname, String pwd) {
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        if (uname.equalsIgnoreCase("akolte")) {
            digest.update(pwd.getBytes());
            byte[] hash = digest.digest();
            if (key.equalsIgnoreCase(String.format("%032x", new BigInteger(1, hash)))) {
                success = true;
            }
        }
        return success;
    }
}
