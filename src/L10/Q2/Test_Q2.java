package L10.Q2;

public class Test_Q2 {
    public static void main(String[] args) {

        //input file: product.txt
        //output file: cipherText.txt
        //the shift value is 3
//        SubstitutionCipher encode = new SubstitutionCipher("plain.txt", "cipher.txt", 3);
//        encode.read_plain_output_cipher();


        //input file: cipherText.txt
        //output file: product.txt
        //the shift value is 3
        SubstitutionCipher decode = new SubstitutionCipher("cipher.txt", "plain.txt", 3);
        decode.read_cipher_output_plain();
    }
}
