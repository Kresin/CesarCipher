package src.cypher;

public class CesarCypher {

    public String encrypt(String value) {
        char[] valueChars = value.toCharArray();
        StringBuilder valueEncrypted = new StringBuilder();

        for (char valueChar : valueChars) {
            if (valueChar == ' ') {
                valueEncrypted.append(valueChar);
            } else {
                int charValue = Character.getNumericValue(valueChar) + 3;
                if (charValue > 35) {
                    charValue -= 26;
                }
                valueEncrypted.append(Character.forDigit(charValue, 36));
            }
        }
        return valueEncrypted.toString();
    }

    public String decrypt(String value) {
        char[] valueChars = value.toCharArray();
        StringBuilder valueEncrypted = new StringBuilder();

        for (char valueChar : valueChars) {
            if (valueChar == ' ') {
                valueEncrypted.append(valueChar);
            } else {
                int charValue = Character.getNumericValue(valueChar) - 3;
                if (charValue < 10) {
                    charValue += 26;
                }
                valueEncrypted.append(Character.forDigit(charValue, 36));
            }
        }
        return valueEncrypted.toString();
    }

}
