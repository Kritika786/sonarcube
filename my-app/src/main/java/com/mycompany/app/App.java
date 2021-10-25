package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] char)
    {
        System.out.println( "Hello World!" );

        System.out.println("A NullPointerException is a drag...");
        Object myObject = null;
        /**
         * Checker prevents this from compiling...
         */
//        System.out.println("myObject: " + myObject.toString());
        /**
         * ... which is simply fantastic. It shows:
         *
         * error: [dereference.of.nullable] dereference of possibly-null
         * reference myObject
         *
         * http://checkerframework.org
         */
        System.out.println("... but thankfully, Checker has our back: http://checkerframework.org");
        
        int minval(int *A, int n) {
  int currmin;

  for (int i=0; i<n; i++)
    if (A[i] < currmin)
      currmin = A[i];
  return currmin;
}
    }
}

