/* =========================
@Author : Er.Prasad B.Badwar.
@Date : 24/04/2023
@Description : AESDecrypt is class build for decryption of encrypted date of birth.
*===========================*/
package com.hdfc.ems.client.util;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;



public class AESDecrypt {
	private static final String ALGORITHM = "AES";
    private static final byte[] KEY = "mysecretkey12345".getBytes();
	
    public static byte[] decrypt(byte[] date) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(KEY, ALGORITHM);
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, keySpec);
        return cipher.doFinal(date);
    }

}
