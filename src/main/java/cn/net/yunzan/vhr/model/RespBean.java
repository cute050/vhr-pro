package cn.net.yunzan.vhr.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yp
 * @since 2022/11/22
 **/
@Data

public class RespBean {

    private Integer status;

    private String msg;

    private Object obj;

    public static RespBean ok(String msg){
        return new RespBean(200,msg,null);
    }

    public static RespBean ok(String msg,Object obj){
        return new RespBean(200,msg,obj);
    }

    public static RespBean error(String msg){
        return new RespBean(500,msg,null);
    }

    public static RespBean error(String msg,Object obj){
        return new RespBean(500,msg,obj);
    }

    private RespBean(Integer status, String msg, Object obj) {
        this.status = status;
        this.msg = msg;
        this.obj = obj;
    }

    private RespBean() {
    }
}
