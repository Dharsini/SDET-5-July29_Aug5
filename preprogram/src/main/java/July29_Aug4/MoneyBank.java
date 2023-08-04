package July29_Aug4;
/*
 * input int -> 4
 * output int 
 * 1, 1+1, 1+2...1+6 --> 1+2+3+4+6+7
 * then 1+1, (1+1)+1, (1+2)+1,  .....(1+6)+1 
 * -> 2+3+4++5+6+7+8
 * -> 3+4+5+6+7+8+9
 * ->4+5+6+7+8+9+10
 * 
 * result = (1+2+3+4) + (2+3+4+5) .... + (7+8+9+10)
 * rewsult = sum of n numbers + (sum 0f n numbers + n )+ (sum of n numbers + 2n )+....... 
 * + (sum of n numbers + (n-1)n)
 * 
 */

public class MoneyBank {

}
