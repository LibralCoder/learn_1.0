import org.junit.Test;

/**
 * @author chaiguanguan
 * @className CutString
 * @description
 * @date 2020/1/16 17:54
 **/
public class CutString {

    public static String cut(String orignStr,int len){
        int length = orignStr.length();
        if(len>=length){
            return orignStr;
        }
        String newStr = "";
        int subCounts = length / len;
        int start = 0;
        for (int i = 1; i <= subCounts; i++) {
            newStr+=orignStr.substring(start,len*i)+"\n";
            start+=len;
        }
        int leave = length%len;
        if(leave>0){
            newStr+=orignStr.substring(length-leave,length);
        }
        return newStr;
    }
}
