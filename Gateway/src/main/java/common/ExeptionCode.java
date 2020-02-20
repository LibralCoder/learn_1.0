package common;

/**
 * @author chaiguanguan
 * @className ExeptionCode
 * @description
 * @date 2020/1/17 11:12
 **/
public class ExeptionCode {

    /**
     * 大部分都只有一个出错信息,统一用一个code
     */
    public static final int COMM_CODE = 0;

    /**
     * 参数有问题code
     */
    public static final int ARGS_ERROR = -1;

    /**
     * 服务端异常code
     */
    public static final int SERVER_EXCEPTION = -2;

    /**
     * 业务异常code
     */
    public static final int BIZ_EXCEPTION = -3;


    /**
     *  业务超时
     */
    public static final int TIMEOUT_EXCEPTION = -4;


    /**
     * HIS  报错
     */
    public static  final int HIS_EXCEPTION = -5;

    /**
     * 结算  报错
     */
    public static  final int VS_EXCEPTION = -6;


    /**
     * 排班 报错
     */
    public static  final int APPO_EXCEPTION = -7;

    /**
     * 用户管理 报错
     */
    public static  final int USER_EXCEPTION = -8;

    /**
     * 脱机异常
     */
    public static  final int OFFLINE_EXCEPTION = -9;

    /**
     * HIS 超时 报错
     */
    public static  final int HIS_TIMEOUT_EXCEPTION = -10;


    /**
     * 结算 超时 报错
     */
    public static  final int VS_TIMEOUT_EXCEPTION = -11;


    /**
     * 排班 超时 报错
     */
    public static  final int APPO_TIMEOUT_EXCEPTION = -12;


    /**
     * 卡存在，不能发卡
     */
    public static  final int SEND_CARD_EXIST_EXCEPTION = -13;


    /**
     * 支付网关异常
     */
    public static final int PAY_GATEWAY_EXCEPTION = -14;

    /**
     * 病人信息不存在
     */
    public static  final int PATIENT_NOT_EXIST_EXCEPTION = -15;

    /**
     * 特殊code，宝安人民医院 医保报错自动转自费处理，但是医院要求弹框提示用户
     */
    public static final int SPECIAL_CODE_EXCEPTION_BY_POP_MSG = -99;

}
