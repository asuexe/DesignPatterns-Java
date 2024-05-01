public class Encryption {
    public static String encrypt(String plainText, int[] key) {
        StringBuilder cipherText = new StringBuilder();
        int keyIndex = 0;

        for (char ch : plainText.toCharArray()) {
            if (Character.isLetter(ch)) {
                // Get the ASCII value of the character
                int charAscii = (int) ch;

                // Adjust the ASCII value based on the key
                char encryptedChar = (char) (charAscii + key[keyIndex]);

                // Append the encrypted character to the cipher text
                cipherText.append(encryptedChar);

                // Move to the next key value (cyclically)
                keyIndex = (keyIndex + 1) % key.length;
            } else {
                // Keep non-alphabetic characters unchanged
                cipherText.append(ch);
            }
        }

        return cipherText.toString();
    }

    public static void main(String[] args) {
        String plainText = "RAG BABY";
        int[] key = {1, 2, 3, 2, 3, 4, 5};

        String cipherText = encrypt(plainText, key);
        System.out.println("Cipher text: " + cipherText);
    }
}
