package id.fatih.springbootreactjs.model;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class DefaultResponse <T> {
    private int status;
    private String massage;
    private T data;

    public DefaultResponse(int status, String massage, T data){
        this.status = status;
        this.massage = massage;
        this.data = data;
    }

    public static <T> DefaultResponse <T> ok (T data){
        return new DefaultResponse<T>(HttpStatus.OK.value(), "SUCCESS", data);
    }

    public static <T> DefaultResponse <T> ok (T data, String massage){
        return new DefaultResponse<T>(HttpStatus.OK.value(), massage, data);
    }

    public static <T> DefaultResponse <T> error (String massage){
        return new DefaultResponse<T>(HttpStatus.INTERNAL_SERVER_ERROR.value(), massage, null);
    }

    public static <T> DefaultResponse <T> noContent (String massage){
        return new DefaultResponse<T>(HttpStatus.NO_CONTENT.value(), massage, null);
    }

}
