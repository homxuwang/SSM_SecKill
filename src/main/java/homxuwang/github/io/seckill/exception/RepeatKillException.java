package homxuwang.github.io.seckill.exception;

/**
 * 重复秒杀异常(运行期异常)
 * @author github.com/homxuwang
 * @date 2019/8/4 19:13
 */
public class RepeatKillException extends SeckillException {

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
