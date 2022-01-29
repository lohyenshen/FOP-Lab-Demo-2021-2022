package L10.Q3;

/**
 * Create another class ShuffleCipher that implements the interface MessageEncoder.
 * The constructor has parameters inputFileName, outputFileNam and N.
 *
 * Define the method encode
 *          that Shuffle the text by N times.
 *
 * Each shuffle split the message in half and then combine characters from each half alternately.
 *
 * Example
 *
 *      if plain text is abcde,
 *      the cipher text will become acbde.
 *
 *
 *
 * Define the method decode that reverse the process of encoding.
 * Create a Tester class to test the program.
 */
public class Test_Q3 {
    public static void main(String[] args) {
        //input file: product.txt
        //output file: cipherText.txt
//        ShuffleCipher encode = new ShuffleCipher("plain.txt", "cipher.txt", 1);
//        encode.read_plain_output_cipher();


        //input file: cipherText.txt
        //output file: product.txt
        ShuffleCipher decode = new ShuffleCipher("cipher.txt", "plain.txt", 1);
        decode.read_cipher_output_plain();
    }
}
