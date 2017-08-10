package mybatis.cascade.test.mapper;

import mybatis.cascade.test.po.Commodity;

public interface CommodityMapper {
	
	/**
	 * 通过id获取商品
	 * @param fdId
	 * @return
	 */
	public Commodity getCommodityById(String fdId);
	
}
