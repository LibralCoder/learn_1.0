package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author chaiguanguan
 * @className StartDemo
 * @description
 * @date 2020/1/16 18:33
 **/
public class StartDemo {
    public static void main(String[] args) {
        String initStr = "{  \"Success\": false,  \"Code\": \"6000\",  \"Data\": null,  \"Msg\": \"[本地医保][Recv][25ms][-1] 错误编码-1030： 卡片复位失败，请检查是否正确插入社会保障卡或PSAM卡。\",  \"TradeNo\": \"d4df19c6f54646c5a3c319569163e844\"}";
        //step1创建模式对象
       // String rule = "(\\D*)(\\d+)(.*)";
        String rule = ".*(Msg.*)(,.*)^[^}]*\\}";
        Pattern pattern = Pattern.compile(rule);
        //step2创建匹配器
        Matcher matcher = pattern.matcher(initStr);

        if(matcher.find()) {
            int groupCount = matcher.groupCount();
            for (int i = 0; i < groupCount; i++) {
                System.out.println(matcher.group(i));
                System.out.println("---------------------");
            }
        }

    }

}