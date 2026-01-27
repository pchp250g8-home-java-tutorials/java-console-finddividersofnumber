/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.home.finddividersofnumber;
import java.io.*;

/**
 *
 * @author PC
 */
public class FindDividersOfNumber 
{

    public static void main(String[] args) throws Exception
    {
        System.out.println("Input an integer positive number");
        var bufStdIn = new BufferedReader(new InputStreamReader(System.in));
        var ulNumber = Long.parseUnsignedLong(bufStdIn.readLine());
        System.out.printf
        (
           "The number %d has the folowing dividers:\r\n", 
           ulNumber
        );
        for(long i = 1; i <= ulNumber; i++)
        {
            if(ulNumber % i == 0)
            {
                System.out.printf("%d ", i);
            }
        }
        System.out.println("");
    }
}
