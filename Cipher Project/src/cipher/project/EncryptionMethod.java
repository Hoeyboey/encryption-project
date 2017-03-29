
package cipher.project;
import static cipher.project.CipherMain.cipherKeyString;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class EncryptionMethod {
    
    private String toBeEncrypted;
    private long encryptKey;
    private int doWeEncryptOrDecrypt;
    public static long cipherKey;
    
        public EncryptionMethod(String cipherInput, int encryptOrDecrypt){
            this.toBeEncrypted = cipherInput;
            this.doWeEncryptOrDecrypt = encryptOrDecrypt;
        }
        public void encryption() {
            String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ !£$%^&*()";
            int alphabetCounter;
            int checkingCounter;
            int encryptionCounter;
            String finalOutput = "";
            int initialAlphabetShuffle;
            int checkingShuffledArrayListCounter;
            int decryptedCharLocation;
            String decryptedString = "";
            long cipherKey;
        
        
            if (doWeEncryptOrDecrypt == 0){
        
                ArrayList<Character> alphabetArrayList = new ArrayList<>();
                ArrayList<Integer> toBeEncryptedArrayList = new ArrayList<>();
            
            
        
                for (alphabetCounter=0; alphabetCounter<alphabet.length(); alphabetCounter++){
                    alphabetArrayList.add(alphabet.charAt(alphabetCounter));
                }
        
                for (checkingCounter=0; checkingCounter<toBeEncrypted.length();checkingCounter++){
                    toBeEncryptedArrayList.add(alphabet.indexOf(toBeEncrypted.charAt(checkingCounter)));
                }
           
                Random encryptKeyRandomObject = new Random();
                encryptKey = encryptKeyRandomObject.nextLong();
                java.util.Collections.shuffle(alphabetArrayList, new Random(encryptKey));

                for (encryptionCounter = 0; encryptionCounter<toBeEncrypted.length();encryptionCounter++){
            
                    finalOutput = finalOutput+alphabetArrayList.get(toBeEncryptedArrayList.get(encryptionCounter));
                    }
            
                JOptionPane.showMessageDialog(null, finalOutput);
                JOptionPane.showMessageDialog(null, encryptKey);
            }
        
            else {
                ArrayList<Character> alphabetArrayListDecryption = new ArrayList<>(); 
                ArrayList<Integer> toBeDecryptedArrayList = new ArrayList<>();
                cipherKeyString = JOptionPane.showInputDialog("What is your key?");
                cipherKey = Long.parseLong(cipherKeyString);
            
                for (initialAlphabetShuffle = 0; initialAlphabetShuffle<alphabet.length(); initialAlphabetShuffle++) {
                    alphabetArrayListDecryption.add(alphabet.charAt(initialAlphabetShuffle));
        
                }
        
                java.util.Collections.shuffle(alphabetArrayListDecryption, new Random(cipherKey));
    
                for (checkingShuffledArrayListCounter = 0; checkingShuffledArrayListCounter<toBeEncrypted.length(); checkingShuffledArrayListCounter++){
                    decryptedCharLocation = alphabetArrayListDecryption.indexOf(toBeEncrypted.charAt(checkingShuffledArrayListCounter));
                    decryptedString = decryptedString + alphabet.charAt(decryptedCharLocation);
                
                }
                    JOptionPane.showMessageDialog(null, decryptedString);
    
            }
        
        
    }
        
}
    
    
    
    
