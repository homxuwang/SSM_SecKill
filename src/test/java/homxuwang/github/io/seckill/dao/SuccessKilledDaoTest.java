package homxuwang.github.io.seckill.dao;

import homxuwang.github.io.seckill.entity.SuccessKilled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author github.com/homxuwang
 * @date 2019/7/31 9:25
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class SuccessKilledDaoTest {

    @Resource
    private SuccessKilledDao successKilledDao;

    @Test
    public void insertSuccessKilled() throws Exception{
        long id = 1001L;
        long phone = 13026329718L;
        int i = successKilledDao.insertSuccessKilled(id, phone);
        System.out.println(i);
    }

    @Test
    public void queryByIdWithSeckill() {
        long id = 1001L;
        long phone = 13026329718L;
        SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(id, phone);
        System.out.println(successKilled.getSeckill());
    }
}