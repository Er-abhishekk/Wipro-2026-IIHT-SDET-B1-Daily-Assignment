package Day5;

 final class SecureEncy {
    public String encrypt(String data) {
        return "ENCRYPTED_" + data; 
    }
    
    public String decrypt(String encryptedData) {
        return encryptedData.replace("ENCRYPTED_", ""); 
    }
}

class Security {
    public static void main(String[] args) {
        SecureEncy enc = new SecureEncy();
        
        System.out.println("Encrypted: " + enc.encrypt("SECRET"));
        System.out.println("Decrypted: " + enc.decrypt(enc.encrypt("SECRET"))); 
    }
}
