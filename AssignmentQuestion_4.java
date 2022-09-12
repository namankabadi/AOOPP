/*
Author:Naman Kabadi
USN: 2SD20CS058
PROBLEM STATEMENT:
Write a Java program to perform the following operations:

a) Create a file named Alphabets.txt and insert appropriate data into it
b) Read the file and copy all the consonants into another file named Consonants.txt
c) If vowel is encountered, throw an exception VowelNotAllowedException and continue until
end of file.
 */
import java.io.*;

public class AssignmentQuestion_4 extends Exception {
    public AssignmentQuestion_4(String vowelsNotAllowed) {
        System.out.println(vowelsNotAllowed);
    }

    public static void main(String[] args) {

        System.out.println("The Text in the File is:\nWelcome To this Text File.\n" +
                "This File consists a set of texts with a set of Consonants and vowels.\n");
        FileInputStream fstream = null;
        try {
            fstream = new FileInputStream("Alphabets.txt");
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        FileWriter ostream = null;
        try {
            ostream = new FileWriter("vowels.txt");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        BufferedWriter out = new BufferedWriter(ostream);
        FileWriter opstream = null;
        try {
            opstream = new FileWriter("consonants.txt");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        BufferedWriter outt = new BufferedWriter(opstream);

        String str = null;
        try {
            str = br.readLine();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);


            if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
                try {
                    out.write(ch);
                    //System.out.println(ch);
                    throw new AssignmentQuestion_4("VowelsNotAllowed");
                } catch (IOException ex) {
                    System.out.println();
                } catch (AssignmentQuestion_4 e) {
                    System.out.println();
                }
            } else {
                try {
                    outt.write(ch);
                    System.out.println(ch);
                } catch (IOException ex) {
                    System.out.println("IOException");
                }
            }

        }

        try {
            out.close();
            System.out.println();
        } catch (IOException ex) {
            System.out.println("IOException");
        }
        try {
            outt.close();
        } catch (IOException ex) {
            System.out.println("IOException");
        }
        try {
            br.close();
        } catch (IOException ex) {
            System.out.println("IOException");
        }
    }
}