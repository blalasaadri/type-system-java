package com.github.blalasaadri;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try {
          throw new Exception();
        } catch (Exception e) {
          // Ignore
        }
    }
}
