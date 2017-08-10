package mybatis.cascade.test.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import mybatis.cascade.test.mapper.OrderDetailMapper;
import mybatis.cascade.test.mapper.OrderItemMapper;
import mybatis.cascade.test.mapper.OrdersMapper;
import mybatis.cascade.test.mapper.UserMapper;
import mybatis.cascade.test.po.Commodity;
import mybatis.cascade.test.po.OrderDetail;
import mybatis.cascade.test.po.OrderItem;
import mybatis.cascade.test.po.Orders;
import mybatis.cascade.test.po.User;
import mybatis.cascade.test.util.SqlSessionFactoryUtil;

/**
 * @Description: mybatis级联测试
 * @author 浮华
 * @date 2017年8月9日，下午9:40:33
 *
 */ 
public class TestMain {

	public static void main(String[] args) {
		
		SqlSession sqlSession = null;
		try {
			sqlSession = SqlSessionFactoryUtil.openSqlSession();
			// 创建订单代理对象 
			OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class); 
			
			/**
			 * 通过用户id获取订单
			 */
			List<Orders> ordersListByUserId = ordersMapper.getOrdersListByUserId("u01");

			for(Orders order : ordersListByUserId) {
				System.out.println("\n" + order.getFdName());
				
				// 订单关联的用户（一对一）
				User user = order.getUser();
				System.out.println("客户名称：" + user.getFdName());
				
				// 获取订单商品项（一对多）
				List<OrderItem> orderItemList = order.getOrderItemList();
				
				for (OrderItem orderItem : orderItemList) {
					// 之前把这过商品过渡类忽略了，然后相同id的商品就合一起了。
					OrderDetail orderDetail = orderItem.getOrderDetail();
					
					// 终于得到商品列表
					Commodity commodity = orderDetail.getCommodity();
					
					String fdName = commodity.getFdName();
					System.out.println(fdName);
				}
			}
			
			
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
	}
}
