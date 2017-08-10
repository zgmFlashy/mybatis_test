package mybatis.cascade.test.po;

/**
 * @Description: 订单明细商品项实体
 * @author 浮华
 * @date 2017年8月9日，下午9:23:56
 *
 */ 
public class OrderDetail {

	/**
	 * fdId
	 */
	private String fdId;

	public String getFdId() {
		return fdId;
	}
	
	/**
	 * 所属订单（订单角度，一对一）
	 */
	private Orders orders;

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	
	/**
	 * 所属商品（订单角度，一对一）
	 */
	private Commodity commodity;

	public Commodity getCommodity() {
		return commodity;
	}
	
}