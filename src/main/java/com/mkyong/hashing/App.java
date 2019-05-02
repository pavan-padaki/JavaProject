package com.mkyong.hashing;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public boolean isPrime(int n) {
	boolean flag = true;
        for(int i=2; i<=n/2; i++) {
	    if(n%i == 0) {
		flag = false;
		break;
	    }
        }
	return flag;
    }
}
