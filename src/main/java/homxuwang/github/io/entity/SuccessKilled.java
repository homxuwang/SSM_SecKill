package homxuwang.github.io.entity;

import java.util.Date;

/**
 * @author github.com/homxuwang
 * @date 2019/7/28 22:08
 */
public class SuccessKilled {
    private long seckilledId;
    private long userPhone;
    private short state;
    private Date createTime;

    //多对一,一个秒杀成功的实体可能对应多个Seckill
    private Seckill seckill;

    public long getSeckilledId() {
        return seckilledId;
    }

    public void setSeckilledId(long seckilledId) {
        this.seckilledId = seckilledId;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    @Override
    public String toString() {
        return "SuccessKilled{" +
                "seckilledId=" + seckilledId +
                ", userPhone=" + userPhone +
                ", state=" + state +
                ", createTime=" + createTime +
                '}';
    }
}
