package homxuwang.github.io.seckill.service;

import homxuwang.github.io.seckill.dto.Exposer;
import homxuwang.github.io.seckill.dto.SeckillExecution;
import homxuwang.github.io.seckill.entity.Seckill;
import homxuwang.github.io.seckill.exception.RepeatKillException;
import homxuwang.github.io.seckill.exception.SeckillCloseException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author github.com/homxuwang
 * @date 2019/8/5 16:00
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-service.xml",
        "classpath:spring/spring-dao.xml"})
public class SeckillServiceTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private SeckillService seckillService;

    @Test
    public void getSeckillList() {
        List<Seckill> seckillList = seckillService.getSeckillList();
        logger.info("seckillList={}",seckillList);

    }

    @Test
    public void getById() {
        long id = 1000L;
        Seckill seckill = seckillService.getById(id);
        logger.info("seckill={}",seckill);
    }

    @Test
    public void exportSeckillUrl() {
        long  id = 1001L;
        Exposer exposer = seckillService.exportSeckillUrl(id);
        if(exposer.isExposed()){
            long phone = 13026429718L;
            String md5 = exposer.getMd5();

            try{
                SeckillExecution seckillExecution = seckillService.executeSeckill(id,phone,md5);
                logger.info("seckillExecution = {}",seckillExecution);
            }catch (RepeatKillException e){
                logger.error(e.getMessage());
            } catch (SeckillCloseException e){
                logger.error(e.getMessage());
            }
        }else{
            //秒杀未开启
            logger.warn("exposer = {}",exposer);
        }
        //Exposer{exposed=true, md5='179b120379e46605af6c05ad7adcd872', seckillId=1001, now=0, start=0, end=0}
    }
    
}