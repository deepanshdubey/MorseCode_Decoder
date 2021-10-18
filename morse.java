//Author  : Deepansh Dubey.
//Date    : 7/7/2020.
//Purpose : Decoding the International Morse Code.

import java.io.*;
import java.util.StringTokenizer;
import word.Words;

class morse {
    static char decode(String str) {
        int i, j = 0;
        String D[] = {
                // ALPHABETS
                ".-", // A
                "-...", // B
                "-.-.", // C
                "-..", // D
                ".", // E
                "..-.", // F
                "--.", // G
                "....", // H
                "..", // I
                ".---", // J
                "-.-", // K
                ".-..", // L
                "--", // M
                "-.", // N
                "---", // O
                ".--.", // P
                "--.-", // Q
                ".-.", // R
                "...", // S
                "-", // T
                "..-", // U
                "...-", // V
                ".--", // W
                "-..-", // X
                "-.--", // Y
                "--..", // Z

                // NUMERICS
                "-----", // 0
                ".----", // 1
                "..---", // 2
                "...--", // 3
                "....-", // 4
                ".....", // 5
                "-....", // 6
                "--...", // 7
                "---..", // 8
                "----." // 9
        };

        for (i = 0; i < 26; i++) // Checking for an alphabet.
        {
            if (str.equals(D[i])) {
                j = i + 65;
                return (char) j;
            }
        }

        if (i == 26) {
            for (i = 26; i < 36; i++) // checking for a numeric.
            {
                if (str.equals(D[i])) {
                    j = i + 22;
                    return (char) j;
                }
            }
        }

        if (i == 36)
            return '?';
        return '?';
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nRules for entering the MORSE CODE CHARACTER.\n");
        System.out.println(
                " --> Press '-' for dash. \n --> Press '.' for dot. \n --> Use single space between letters and double spaces between words.");
        System.out.println(" Any character can be used in place of space.\n ? = Unknown.");

        while (true) {
            System.out.println("\nPlease input your character OR 'Q' to exit.");
            String s = br.readLine().trim();

            if (s.equals("Q") || s.equals("q"))
                break;
            if (s.equals(""))
                continue;

            // Removing unwanted characters
            String st = "";
            char ch;
            for (int i = 0; i < s.length(); i++) {
                ch = s.charAt(i);
                if (ch == '.' || ch == '-') {
                    st += ch;
                } else {
                    st += ' ';
                }
            }

            Words words = new Words(st, "  ");
            while (words.hasMoreTokens()) {
                StringTokenizer letters = new StringTokenizer(words.nextToken());
                while (letters.hasMoreTokens()) {
                    System.out.print(decode(letters.nextToken()));
                }
                System.out.print(" ");
            }
        }
        System.out.println("\n\n\n ---// Thank You :) \\---\n");
    }
}
