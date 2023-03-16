package tools.result;

import lombok.Getter;
import lombok.ToString;

/**
 * @author JUNJ
 * @since 1.0
 * @date 2023.3.16
 * 操作返回结果
 */
@ToString
public class ActionResult<T> {
    @Getter
    private int code;

    @Getter
    private String message;

    @Getter
    private T data;


    ActionResult() {}

    ActionResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
