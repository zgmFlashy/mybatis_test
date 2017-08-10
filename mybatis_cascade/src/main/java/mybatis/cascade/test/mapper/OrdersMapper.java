package mybatis.cascade.test.mapper;

import java.util.List;

import mybatis.cascade.test.po.Orders;

public interface OrdersMapper {
	
	/**
	 * 通过id获取订单
	 * @param fdId
	 * @return
	 */
	public Orders getOrdersById(String fdId);
	
	/**
	 * 通过用户id获取用户订单
	 * @param fdUserId
	 * @return
	 */
	public List<Orders> getOrdersListByUserId(String fdUserId);

}
