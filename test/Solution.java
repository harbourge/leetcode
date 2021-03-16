
import java.util.*;

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        if(s.length()<=numRows || numRows==1) return s;

        int flag = 1,index = 0;
        StringBuffer[] buffer = new StringBuffer[numRows];
        for(int i=0;i<numRows;i++){
            buffer[i] = new StringBuffer();
        }
        for(int i=0;i<s.length();i++){
            buffer[index].append(s.charAt(i));
            if(index+flag>=numRows || index+flag < 0){
                flag = 0-flag;
            }
            index+=flag;
        }
        StringBuffer res= new StringBuffer();
        for(int i=0;i<numRows;i++){
            res.append(buffer[i].toString());
        }

        return res.toString();
    }


    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.convert("AB", 1));

    }

}
// @lc code=end
