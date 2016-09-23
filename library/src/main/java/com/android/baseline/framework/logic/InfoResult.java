package com.android.baseline.framework.logic;
import com.google.gson.annotations.SerializedName;

/**
 * 网络请求返回数据
 * @author hiphonezhu@gmail.com
 * @version [Android-BaseLine, 2013-7-23]
 */
public class InfoResult<T>
{
    // 成功Code
    public static final String SUCCESS_CODE = "0";

    @SerializedName("errNum")
    private String errorCode;
    @SerializedName("retMsg")
    private String desc;
    @SerializedName("retData")
    private T extraObj;

    public InfoResult(String errorCode, String desc)
    {
        this.errorCode = errorCode;
        this.desc = desc;
    }

    public InfoResult()
    {
    }

    public boolean isSuccess()
    {
        return SUCCESS_CODE.equals(errorCode);
    }

    public String getErrorCode()
    {
        return errorCode;
    }

    public void setErrorCode(String errorCode)
    {
        this.errorCode = errorCode;
    }

    public T getExtraObj()
    {
        return extraObj;
    }

    public void setExtraObj(T extraObj)
    {
        this.extraObj = extraObj;
    }

    public String getDesc()
    {
        return desc;
    }

    public void setDesc(String desc)
    {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "InfoResult{" +
                "errorCode='" + errorCode + '\'' +
                ", desc='" + desc + '\'' +
                ", extraObj=" + extraObj +
                '}';
    }
}
