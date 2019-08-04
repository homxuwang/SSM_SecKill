package homxuwang.github.io.seckill.exception;

/**
 * 秒杀相关业务异常
 * @author github.com/homxuwang
 * @date 2019/8/4 19:18
 */
public class SeckillException extends RuntimeException {
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
