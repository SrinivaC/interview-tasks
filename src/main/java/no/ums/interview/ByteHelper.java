package no.ums.interview;


import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Helper class to convert a byte[] to Hex String.
 *
 * Source: http://stackoverflow.com/questions/9655181/convert-from-byte-array-to-hex-string-in-java
 *
 * @author StÃ¥le Undheim <su@ums.no>
 */
public interface ByteHelper {

    char[] HEX_ARRAY = "0123456789abcdef".toCharArray();

    /*
    public static  String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for ( int j = 0; j < bytes.length; j++ ) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    } */


    public static String bytesToHex(byte[] bytes) throws NoSuchAlgorithmException{
    	String input = new String (bytes);
    	System.out.println("Input is "+ input);
    	MessageDigest md = MessageDigest.getInstance("SHA-1");
        md.update(bytes);
 
        byte byteData[] = md.digest();

        //convert the byte to hex format method 2
        StringBuffer hexString = new StringBuffer();
    	for (int i=0;i<byteData.length;i++) {
    		String hex=Integer.toHexString(0xff & byteData[i]);
   	     	if(hex.length()==1) hexString.append('0');
   	     	hexString.append(hex);
    	}
    	System.out.println("Hex format : " + hexString.toString());
    	return hexString.toString();
    }

    

}
