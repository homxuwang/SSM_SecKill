package homxuwang.github.io.seckill.service;

import homxuwang.github.io.seckill.dto.Exposer;
import homxuwang.github.io.seckill.dto.SeckillExecution;
import homxuwang.github.io.seckill.entity.Seckill;
import homxuwang.github.io.seckill.exception.RepeatKillException;
import homxuwang.github.io.seckill.exception.SeckillCloseException;
import homxuwang.github.io.seckill.exception.SeckillException;

import java.util.List;

/**
 * 业务接口：站在"使用者"的角度去设计接口
 * 三个方面：定义方法论粒度，参数，返回类型
 *
 * @author github.com/homxuwang
 * @date 2019/8/4 17:45
 */
public interface SeckillService {

    /**
     * 查询所有秒杀记录
     *
     * @return
     */
    List<Seckill> getSeckillList();

    /**
     * 查询单个秒杀记录
     *
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);

    /**
     * 秒杀开启时输出秒杀接口地址
     * 否则输出系统时间和秒杀时间
     *
     * @param seckillId
     * @return
     */
    Exposer exportSeckillUrl(long seckillId);

    /**
     * 执行秒杀操作
     * @param seckillId
     * @param userPhone
     * @param md5
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
        throws SeckillException, SeckillCloseException, RepeatKillException;
}
