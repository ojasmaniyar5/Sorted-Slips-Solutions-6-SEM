import java.util.*;

class ThreadVowel1 extends Thread

{

    String v;

    ThreadVowel1(String k)

    {

        v = k;

    }

    public void run()

    {

        for (int i = 0; i < v.length(); i++)

        {

            if (v.charAt(i) == 'a' ||

                    v.charAt(i) == 'e' ||

                    v.charAt(i) == 'i' ||

                    v.charAt(i) == 'o' ||

                    v.charAt(i) == 'u')

            {

                System.out.println(v.charAt(i));

                try

                {

                    Thread.sleep(3000);

                }

                catch (Exception e) {
                }

            }

        }

    }

}

public class Slip_17A {

    public static void main(String args[])

    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");

        String n = sc.nextLine();

        ThreadVowel1 tv = new ThreadVowel1(n);

        tv.start();

    }

}