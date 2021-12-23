import java.util.ArrayList;

public class CriptografiaCesariana {

    public String criptografar(String texto) {
    	if (texto == "") throw new IllegalArgumentException();
    
        String lowerCase = texto.toLowerCase();

        ArrayList<Character> encryptList = new ArrayList();

        for (int i=0; i < lowerCase.length(); i++) {
            if ((int)lowerCase.charAt(i) == 32) {
                encryptList.add(lowerCase.charAt(i));
            } else if ((int)lowerCase.charAt(i)+3 == 123) {
                encryptList.add((char)97);
            } else if ((int)lowerCase.charAt(i)+3 == 124){
                encryptList.add((char)98);
            } else if ((int)lowerCase.charAt(i)+3 == 125) {
                encryptList.add((char)99);
            } else if ((int)lowerCase.charAt(i) >= 48 && (int)lowerCase.charAt(i) <= 57) {
                encryptList.add((char)((int)lowerCase.charAt(i)));
            } else {
                encryptList.add((char)((int)lowerCase.charAt(i)+3));
            }
        }

        String encryptText = "";

        for (Character c : encryptList) {
            encryptText += String.valueOf(c);
        }
        return encryptText;
    }

    public String descriptografar(String texto) {
        if (texto == "") throw new IllegalArgumentException();
    
        String lowerCase = texto.toLowerCase();

        ArrayList<Character> decryptList = new ArrayList();

        for (int i=0; i < lowerCase.length(); i++) {
            if ((int)lowerCase.charAt(i) == 32) {
                decryptList.add(lowerCase.charAt(i));
            } else if ((int)lowerCase.charAt(i)-3 == 94) {
                decryptList.add((char)120);
            } else if ((int)lowerCase.charAt(i)-3 == 95){
                decryptList.add((char)121);
            } else if ((int)lowerCase.charAt(i)-3 == 96) {
                decryptList.add((char)122);
            } else if ((int)lowerCase.charAt(i) >= 48 && (int)lowerCase.charAt(i) <= 57) {
                decryptList.add((char)((int)lowerCase.charAt(i)));
            } else {
                decryptList.add((char)((int)lowerCase.charAt(i)-3));
            }
        }

        String decryptText = "";

        for (Character c : decryptList) {
            decryptText += String.valueOf(c);
        }
        return decryptText;
    }
}