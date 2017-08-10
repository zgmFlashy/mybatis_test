package mybatis.cascade.test.po;

/**
 * @Description: 订单明细
 * @author 浮华
 * @date 2017年8月10日，下午11:53:22
 *
 */ 
public class OrderItem {

	/**
	 * fdId
	 */
	private String fdId;

	public String getFdId() {
		return fdId;
	}
	
	/**
	 * 所属订单，一对一
	 */
	private Orders orders;

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	
	/**
	 * 商品记录项，一对一（有点绕。。。。。）
	 */
	private OrderDetail orderDetail;

	public OrderDetail getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(OrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}
}
