package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *412. Fizz Buzz

 Write a program that outputs the string representation of numbers from 1 to n.

 But for multiples of three it should output “Fizz” instead of the number and
 for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
 fizz
 */
public class FizzBuzz {
    /**
     * fizzBuzz program
     * @param n int
     * @return List<String></String>
     */
    public List<String> fizzBuzz(int n) {
        List<String> ret = new ArrayList<String>(n);
        for(int i=1,fizz=0,buzz=0;i<=n ;i++){
            fizz++;
            buzz++;
            if(fizz==3 && buzz==5){
                ret.add("FizzBuzz");
                fizz=0;
                buzz=0;
            }else if(fizz==3){
                ret.add("Fizz");
                fizz=0;
            }else if(buzz==5){
                ret.add("Buzz");
                buzz=0;
            }else{
                ret.add(String.valueOf(i));
            }
        }
        return ret;
    }
}
