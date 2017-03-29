
package cipher.project;

import javax.swing.JOptionPane;
public class CipherMain {

public static String cipherInput;
public static String codedInput;

public static String cipherKeyString;
    public static void main(String[] args) {
        
        int encryptOrDecrypt;
        Object[] encryptOrDecryptButtons = {"Encrypt","Decrypt"};
        encryptOrDecrypt = JOptionPane.showOptionDialog(null, 
                            "Would you like to encrypt or decrypt?", 
                            "Encryption program", 
                            JOptionPane.YES_NO_OPTION, 
                            JOptionPane.INFORMATION_MESSAGE, 
                            null, 
                            encryptOrDecryptButtons, 
                            encryptOrDecryptButtons[0]);
        
            cipherInput = JOptionPane.showInputDialog("What is your input?");
            EncryptionMethod letsEncrypt = new EncryptionMethod(cipherInput, encryptOrDecrypt);
            letsEncrypt.encryption();
        
        
        
    }
    
}
