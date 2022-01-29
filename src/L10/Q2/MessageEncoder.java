package L10.Q2;

/**
 * Create an interface MessageEncoder that has a method
 * encode(plainText) where plainText is the message to be encoded.
 *      The method returns the cipher text.
 *
 * Create another method decode(ciphertext).
 *      The method returns the plain text.
 *
 * Create a class SubstitutionCipher that implements the interface MessageEncoder.
 *
 * The constructor has parameters inputFileName, outputFileName and shift.
 * Define the method encode that shifted the letter by shifting the positive value and the method decode that shift
 * the letter by shifting the negative value.
 *
 * The class
 * read the plainText from inputFile
 * and
 * output the cipherText to outputFile.
 *
 * Besides, the class also can read the cipher
 * text from inputFile and output the plain text to outputFile.
 */
public interface MessageEncoder {

    String encode( String plainText);
    String decode( String cipherText);
}
