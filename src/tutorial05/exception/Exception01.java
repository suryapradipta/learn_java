package tutorial05.exception;

import java.io.IOException;
import java.util.*;

public class Exception01 {
    public static void main(String[] args) {
        boolean done = false;
        while (!done) {
            try {
                System.out.print("Enter an integer :");
                int val = getInteger();
                System.out.println("You entered " + val);


                if (val < 0)
                    throw new NegativeNumException(val);
                if (val == 0)
                    throw new Exception("Actually, 0 is not positive");

                done = true;
            }

            catch (InputMismatchException e) {
                System.out.println("You didn't enter an integer");
            }

            // both val is catch here (throwed exception)
            // if not throwing, the e.getMessage will be null
            catch (java.lang.Exception e) {
                System.out.println(e.getMessage());
            }

            finally {
                System.out.println("Thank you for trying");
            }
        }

    }

    public static int getInteger() throws IOException {
        // declare a large byte array
        byte[] buffer = new byte[512];
        // characters entered stored in array
        System.in.read(buffer);
        // make string from byte array
        String s = new String(buffer);
        // trim string
        s = s.trim();
        // converts string to an 'int'
        int num = Integer.parseInt(s);
        // send back integer value
        return num;

    }
}
