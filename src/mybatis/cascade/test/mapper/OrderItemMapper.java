package mybatis.cascade.test.mapper;

import java.util.List;

import mybatis.cascade.test.po.OrderItem;

public interface OrderItemMapper {
	
	/**
	 * 通过id获取订单明细
	 * @param fdId
	 * @return
	 */
	public OrderItem getOrderItemById(String fdId);
	
	/**
	 * 通过订单id 获取订单明细列表
	 * @param fdOrderId
	 * @return
	 */
	public List<OrderItem> getOrderItemListByOrderId(String fdOrderId);
}
