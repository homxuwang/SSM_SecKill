package homxuwang.github.io.seckill.dao;

import homxuwang.github.io.seckill.entity.SuccessKilled;
import org.apache.ibatis.annotations.Param;

/**
 * @author github.com/homxuwang
 * @date 2019/7/29 8:54
 */
public interface SuccessKilledDao {

    /**
     * 插入购买明细,可过滤重复秒杀(使用了联合主键)
     * @param seckillId
     * @param userPhone
     * @return 插入的行数
     */
    int insertSuccessKilled(@Param("seckillId") long seckillId,@Param("userPhone") long userPhone);

    /**
     * 根据id查询SuccessKilled并携带秒杀产品对象实体
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId")long seckillId,@Param("userPhone") long userPhone);

}
