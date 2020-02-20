package common;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Result<T> implements Serializable {

  private static final long serialVersionUID = 5616070434977448606L;


  private boolean success; // 是否成功.表明:从头到尾没有异常,不代表业务含义

  private String msg;    // 给前端返回错误的字段

  private int code;   // 给前端返回的异常代码

  private final ErrorCodes errorCodes = new ErrorCodes();

  private T data;   // 返回给前端的数据

  private static final String HOSTNAME = System.getenv().get("COMPUTERNAME");//根据系统变量获取医院名



  /**
   *
   * @param isSucc dfa
   */
  private Result(boolean isSucc) {
    this.success = isSucc;
  }
  /**----------------------------------------成功----------------------------------------------
   * 设置成功
   *
   */
  private void setSuccess() {
    this.success = true;
  }

  /**
   * result默认isSucc=false <br />
   * 设置value时,会将isSucc=true
   *
   * @param val
   */
  public Result<T> value(T val) {
    this.success = true;
    this.data = val;

    return this;
  }

  public T value() {
    return this.data;
  }

  public static <W> Result<W> createSuccessResult() {
    Result<W> result = createFailResult();
    result.setSuccess();
    return result;
  }

  public static <T> Result<T> createSuccessResult(T val) {
    Result<T> result = createFailResult();
    result.value(val);
    return result;
  }

  /**----------------------------------------单原因失败-----------------------------------------------
   *
   * @param <W> 静态方法要使用泛型要将它定义到方法上
   * @return
   */
  public static <W> Result<W> createFailResult() {

    Result<W> result =  new Result<W>(false);
    result.data = null;
    return result;
  }
    /**
     * @Desicription 创建一个无响应
     * @param <W>
     * @return
     */
  public static <W> Result<W> createNoResponseResult() {
    Result<W> result = createFailResult();
    result.success =false;
    result.data = null;

    return result;
  }



  /**------------------------------------多原因失败--------------------------------------------------
   * 设置出错code和desc
   *
   * @param code
   * @param desc
   * @return
   */
  public Result<T> error(int code, String desc) {
    this.success = false;
    data = null;
    errorCodes.add(code, desc);
    this.code = code;
    return this;
  }

    /**
     * 设置出错信息
     *
     * @param code
     * @return
     */
    public Result<T> error(int code) {
        data = null;
        this.code = code;
        return this.error(code, "");
    }

  public Result<T> error(String errMsg) {
      data = null;
    return this.error(ExeptionCode.COMM_CODE, errMsg);
  }
    /**
     *  创建一个多种错误集合erroCodes，code默认为1
     * @param errorMsg
     * @param <W>
     * @return
     */
    public static <W> Result<W> createFailResult(String errorMsg) {
        Result<W> result = createFailResult();
        result.error(errorMsg);
        result.data = null;
        return result;
    }
    public static <W> Result<W> createFailResult(int errorCode, String errorMsg) {
        Result<W> result = createFailResult();
        result.error(errorCode, errorMsg);
        result.code = errorCode;
        result.data = null;
        return result;
    }


    /**
     * 返回出错信息 应该以isSucc()来判定是否成功
     * 失败后,再获取出错信息
     *
     * @return
     */
    public ErrorCodes errors() {
        return this.errorCodes;
    }
  /**
   * 返回第一个出错信息
   *
   * @return
   */
  public String errorMess() {
    return this.errors().one().getDesc();
  }

  /**
   * catch的异常.直接显示服务端异常
   *
   * @return
   */
  public Result<T> exception() {
    return this.error(ExeptionCode.SERVER_EXCEPTION, "服务器端异常 ->" + id());
  }


  private static String id() {
    return HOSTNAME + "-" + System.currentTimeMillis();
  }
    public boolean checkArgs(boolean expression, String format, Object... args) {
        if (!expression) {
            this.error(ExeptionCode.ARGS_ERROR, String.format(format, args));
        }
        return expression;
    }

    @Override
    public String toString() {
        this.msg = getMsg();
        return ReflectionToStringBuilder.toString(this);
    }
  /**
   * 是否成功
   *
   * @return
   */
  public boolean isSuccess() {
    return this.success;
  }
  public String getMsg() {
    if(StringUtils.isBlank(this.errors().one().getDesc())){
        return msg;
    }
    return this.errors().one().getDesc();
  }
}
