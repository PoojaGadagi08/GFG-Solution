Given a time in the format of hh:mm (12-hour format) 0 < HH < 12, 0 <= MM < 60. The task is to convert it into words.
Note: There are different corner cases appears for simplicity refer this example:

6:00 six o'clock
6:10 ten minutes past six
6:15 quarter past six
6:30 half past six
6:45 quarter to seven
6:47 thirteen minutes to seven






//User function Template for Java
class Solution
{
    public String timeToWord(int H, int M)
    {
       String hours[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten",
        "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen",
        "twenty","twenty one","twenty two","twenty three","twenty four","twenty five",
        "twenty six","twenty seven","twenty eight","twenty nine","thirty"};
        
        String s="";
        if(M==0)
             s=hours[H] +" o' clock";
        else if(M==1)
              s=hours[M] + " minute past " + hours[H];
        else if(M>1 && M<30 && M!=15)
              s=hours[M] + " minutes past " + hours[H];
        else if(M==15)
              s="quarter past " + hours[H];
        else if(M==30)
              s="half past " + hours[H];
        else if(M==45)
              s="quarter to "+ hours[H+1];
        else if(M==59)
              s=hours[60-M] + " minute to " + hours[H+1];
        else if(M>30 || M<59 && M!=45)
        {
             if(H == 12)
                H = 0;
            int t=60-M;
            s=hours[t] + " minutes to " +  hours[H+1];
        }
        return s;   
    }
}
