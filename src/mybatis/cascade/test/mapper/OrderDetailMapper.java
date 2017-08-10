package mybatis.cascade.test.mapper;

import mybatis.cascade.test.po.OrderDetail;

public interface OrderDetailMapper {

	/**
	 * 通过id获取订单明细商品项
	 * @param fdId
	 * @return
	 */
	public OrderDetail getOrderDetailById(String fdId);
	
}
