package mybatis.cascade.test.po;

/**
 * @Description: 商品实体
 * @author 浮华
 * @date 2017年8月10日，下午11:52:40
 *
 */ 
public class Commodity {

	/**
	 * fdId
	 */
	private String fdId;

	public String getFdId() {
		return fdId;
	}

	/**
	 * 商品名
	 */
	private String fdName;
	
	public String getFdName() {
		return fdName;
	}

	public void setFdName(String fdName) {
		this.fdName = fdName;
	}
	
	/**
	 * 单价
	 */
	private double fdPrice;

	public double getFdPrice() {
		return fdPrice;
	}

	public void setFdPrice(double fdPrice) {
		this.fdPrice = fdPrice;
	}

	/**
	 * 商品描述
	 */
	private String fdDescribe;

	public String getFdDescribe() {
		return fdDescribe;
	}

	public void setFdDescribe(String fdDescribe) {
		this.fdDescribe = fdDescribe;
	}

	/**
	 * 库存
	 */
	private Integer fdReserve;

	public Integer getFdReserve() {
		return fdReserve;
	}

	public void setFdReserve(Integer fdReserve) {
		this.fdReserve = fdReserve;
	}

}
