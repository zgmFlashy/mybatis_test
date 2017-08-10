package mybatis.cascade.test.po;

/**
 * @Description: 用户实体
 * @author 浮华
 * @date 2017年8月9日，下午9:07:33
 *
 */ 
public class User {
	
	/**
	 * fdId
	 */
	private String fdId;

	public String getFdId() {
		return fdId;
	}

	/**
	 * 用户名
	 */
	private String fdName;
	
	public String getFdName() {
		return fdName;
	}

	public void setFdName(String fdName) {
		this.fdName = fdName;
	}

	/**
	 * 手机号
	 */
	private String fdPhone;

	public String getFdPhone() {
		return fdPhone;
	}

	public void setFdPhone(String fdPhone) {
		this.fdPhone = fdPhone;
	}

	/**
	 * 地址
	 */
	private String fdAddress;

	public String getFdAddress() {
		return fdAddress;
	}

	public void setFdAddress(String fdAddress) {
		this.fdAddress = fdAddress;
	}
	
}