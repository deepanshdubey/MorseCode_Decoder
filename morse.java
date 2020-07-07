//Author : Deepansh Dubey.
//Date   : 7/7/2020.
//Purpose: Decoding the morse code.

import java.io.*;
class morse
{
    public void render(String str)
    {
        int i,j=0;
        char ch;
        String D[]=
        {   
                //ALPHABETS

            ".-",               //A

            "-...",             //B

            "-.-.",             //C

            "-..",              //D

            ".",                //E

            "..-.",             //F

            "--.",              //G

            "....",             //H

            "..",               //I

            ".---",             //J

            "-.-",              //K

            ".-..",             //L

            "--",               //M

            "-.",               //N

            "---",              //O

            ".--.",             //P

            "--.-",             //Q

            ".-.",              //R

            "...",              //S

            "-",                //T

            "..-",              //U

            "...-",             //V

            ".--",              //W

            "-..-",             //X

            "-.--",             //Y

            "--..",             //Z   

                    //NUMERICS

            "-----",                //0

            ".----",                //1

            "..---",                //2

            "...--",                //3

            "....-",                //4

            ".....",                //5

            "-....",                //6

            "--...",                //7

            "---..",                //8

            "----."                 //9
            };



        for(i=0;i<26;i++)                       //Checking for an alphabet.
        {
            if(str.equals(D[i]))
            {
                j=i+65;
                ch=(char)j;
                System.out.println("\n" + ch);
                break;
            }
        }
            
        if(i==26)
        {
            for(i=26;i<36;i++)                      //checking for a numeric.
            {
                if(str.equals(D[i]))
                {
                    j=i+22;
                    ch=(char)j;
                    System.out.println("\n " + ch);
                    break;
                }
            }
        }

        if(i==36)
            System.out.println("\n***NOT A VALID ENTERY***\n");
    }

    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        String s;
        System.out.println("\nRules for entering the MORSE CODE CHARACTER.\n");
        System.out.println(" --> Press '-' for dash. \n --> Press '.' for dot. \n --> No space should be entered betwwen the units of letter.");


        while(true)
        {
            System.out.println("\nPlease input your character OR 'Q' to exit.");
            s=br.readLine();
                
            if(s.equals("Q") || s.equals("q"))
                break;
                

            morse ob=new morse();
            ob.render(s);
        }
        
        System.out.println("\n\n\n              ---//  Thank You :)  \\---\n");

    }   
}