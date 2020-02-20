/**
 * @author chaiguanguan
 * @className StringHandler
 * @description
 * @date 2020/1/16 18:20
 **/
public class StringHandler {
    /**
     *
     * @param orignStr 原始字符串
     * @param len    设置的截取长度
     * @return
     */
    public static String autoNewLine(String orignStr,int len){
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
