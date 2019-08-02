package homxuwang.github.io.seckill.dao;

import homxuwang.github.io.seckill.entity.Seckill;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author github.com/homxuwang
 * @date 2019/7/29 8:50
 */
public interface SeckillDao {

    /**
     * 减库存操作
     * @param seckillId 库存id
     * @param killTime 执行减库存的时间
     * @return 如果影响行数>1，表示更新的记录行数
     */
    int reduceNumber(@Param("seckillId") long seckillId,@Param("killTime") Date killTime);

    /**
     * 根据id查询秒杀库存对象
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     * @param offset 偏移量
     * @param limit 偏移量之后要取的个数
     * @return
     */
    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
