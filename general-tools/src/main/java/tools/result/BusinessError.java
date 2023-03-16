package tools.result;

/**
 * @author JUNJ
 * @since 1.0
 */
public interface BusinessError {
    /**
     * 获取描述
     *
     * @return 错误描述
     * @author jimmy.zhang
     * @date 2019-03-29
     */
    String getMessage();

    /**
     * 获取编码
     *
     * @return 错误编码
     * @author jimmy.zhang
     * @date 2019-03-29
     */
    int getCode();
}
