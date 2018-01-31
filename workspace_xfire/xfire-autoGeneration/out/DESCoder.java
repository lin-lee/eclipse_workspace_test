/**
 * @author Fred Liu <liuxiaokun@lvmama.com>
 * @version 1.7
 * @since  2015-5-6
 */


import java.io.UnsupportedEncodingException;
import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

@SuppressWarnings("restriction")
public class DESCoder {

    private static BASE64Encoder base64 = new BASE64Encoder();
    private static byte[] myIV = { 50, 51, 52, 53, 54, 55, 56, 57 };

    /**
     * encrypt the input value via DES.
     * 
     * @param input
     * @param strkey
     * @return
     * @throws Exception
     */
    public static String desEncrypt(String input, String strkey) throws Exception {

        BASE64Decoder base64d = new BASE64Decoder();
        DESedeKeySpec p8ksp = null;
        p8ksp = new DESedeKeySpec(base64d.decodeBuffer(strkey));
        Key key = null;
        key = SecretKeyFactory.getInstance("DESede").generateSecret(p8ksp);

        input = padding(input);
        byte[] plainBytes = (byte[]) null;
        Cipher cipher = null;
        byte[] cipherText = (byte[]) null;

        plainBytes = input.getBytes("UTF8");
        cipher = Cipher.getInstance("DESede/CBC/NoPadding");
        SecretKeySpec myKey = new SecretKeySpec(key.getEncoded(), "DESede");
        IvParameterSpec ivspec = new IvParameterSpec(myIV);
        cipher.init(1, myKey, ivspec);
        cipherText = cipher.doFinal(plainBytes);
        return removeBR(base64.encode(cipherText));

    }

    /**
     * @param cipherText
     * @param strkey
     * @return
     * @throws Exception
     */
    public static String desDecrypt(String cipherText, String strkey) throws Exception {

        BASE64Decoder base64d = new BASE64Decoder();
        DESedeKeySpec p8ksp = null;
        p8ksp = new DESedeKeySpec(base64d.decodeBuffer(strkey));
        Key key = null;
        key = SecretKeyFactory.getInstance("DESede").generateSecret(p8ksp);
        Cipher cipher = null;
        byte[] inPut = base64d.decodeBuffer(cipherText);
        cipher = Cipher.getInstance("DESede/CBC/NoPadding");
        SecretKeySpec myKey = new SecretKeySpec(key.getEncoded(), "DESede");
        IvParameterSpec ivspec = new IvParameterSpec(myIV);
        cipher.init(2, myKey, ivspec);
        byte[] output = removePadding(cipher.doFinal(inPut));

        return new String(output, "UTF8");

    }

    private static String removeBR(String str) {
        StringBuffer sf = new StringBuffer(str);

        for (int i = 0; i < sf.length(); ++i) {
            if (sf.charAt(i) == '\n') {
                sf = sf.deleteCharAt(i);
            }
        }
        for (int i = 0; i < sf.length(); ++i)
            if (sf.charAt(i) == '\r') {
                sf = sf.deleteCharAt(i);
            }

        return sf.toString();
    }

    public static String padding(String str) {
        byte[] oldByteArray;
        try {
            oldByteArray = str.getBytes("UTF8");
            int numberToPad = 8 - oldByteArray.length % 8;
            byte[] newByteArray = new byte[oldByteArray.length + numberToPad];
            System.arraycopy(oldByteArray, 0, newByteArray, 0, oldByteArray.length);
            for (int i = oldByteArray.length; i < newByteArray.length; ++i) {
                newByteArray[i] = 0;
            }
            return new String(newByteArray, "UTF8");
        } catch (UnsupportedEncodingException e) {
            System.out.println("Crypter.padding UnsupportedEncodingException");
        }
        return null;
    }

    public static byte[] removePadding(byte[] oldByteArray) {
        int numberPaded = 0;
        for (int i = oldByteArray.length; i >= 0; --i) {
            if (oldByteArray[(i - 1)] != 0) {
                numberPaded = oldByteArray.length - i;
                break;
            }
        }

        byte[] newByteArray = new byte[oldByteArray.length - numberPaded];
        System.arraycopy(oldByteArray, 0, newByteArray, 0, newByteArray.length);

        return newByteArray;
    }

    public static void main(String args[]) {
        try {
            String desstr = DESCoder.desEncrypt("001FE212E94EA9P3", "moXBbvui4O2MUUKP5x1s0HoYxdWhUlX6");

            System.out.println("Encode:" + desstr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
