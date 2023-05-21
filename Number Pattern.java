For a given number N. Print the pattern in the following form: 1 121 12321 1234321 for N = 4.

Example 1:

Input:
N = 3
Output:
1 121 12321
Explanation:
For N = 3 we will print the 3 strings 
according to the pattern.
  
  

//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<String> numberPattern(int N){
        // code here
        ArrayList<String> list = new ArrayList<>();
        String str="";
        for(int i=1;i<=N;i++){
           str = "";
            for(int j=1;j<2*i;j++){
            if(j<i){
                str+=j;
            }else{
                str+=2*i-j;
            }
            }
            
        list.add(str);
        }
        return list;
    }
}
