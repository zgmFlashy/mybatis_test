package mybatis.cascade.test.po;

import java.util.Date;
import java.util.List;

/**
 * @Description: 客户订单
 * @author 浮华
 * @date 2017年8月9日，下午9:13:31
 *
 */ 
public class Orders {
	/**
	 * fdId
	 */
	private String fdId;

	public String getFdId() {
		return fdId;
	}

	/**
	 * 订单名（号）
	 */
	private String fdName;
	
	public String getFdName() {
		return fdName;
	}

	public void setFdName(String fdName) {
		this.fdName = fdName;
	}

	/**
	 * 订单明细项
	 */
	private List<OrderItem> orderItemList;

	public List<OrderItem> getOrderItemList() {
		return orderItemList;
	}

	public void setOrderItemList(List<OrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}

	/**
	 * 订单总价
	 */
	private double fdTotalPrices;
	
	public double getFdTotalPrices() {
		return fdTotalPrices;
	}

	public void setFdTotalPrices(double fdTotalPrices) {
		this.fdTotalPrices = fdTotalPrices;
	}


	/**
	 * 下单用户（订单角度，一对一）
	 */
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	/**
	 * 下单时间
	 */
	private Date fdOrderDateTime;

	public Date getFdOrderDateTime() {
		return fdOrderDateTime;
	}

	public void setFdOrderDateTime(Date fdOrderDateTime) {
		this.fdOrderDateTime = fdOrderDateTime;
	}

}