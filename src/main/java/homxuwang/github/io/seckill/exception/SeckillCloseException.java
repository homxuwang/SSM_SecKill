package homxuwang.github.io.seckill.exception;

/**
 * 秒杀关闭异常
 * @author github.com/homxuwang
 * @date 2019/8/4 19:17
 */
public class SeckillCloseException extends SeckillException {

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
