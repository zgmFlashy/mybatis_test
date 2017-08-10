package mybatis.cascade.test.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @Description: TODO()
 * @author 浮华
 * @date 2017年7月11日，上午6:25:24
 *
 */ 
public class SqlSessionFactoryUtil {
	// SqlSessionFactory 对象
	private static SqlSessionFactory sqlSessionFactory = null;
	// 类线程锁
	private static final Class CLASS_LOCK = SqlSessionFactoryUtil.class;
	
	/**
	 * 私有化构造器
	 */
	private SqlSessionFactoryUtil() {};
	
	/**
	 * 构建SqlSessionFactory
	 */
	public static SqlSessionFactory initSqlSessionFactory() {
		
		String resource = "mybatis/cascade/test/mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		synchronized (CLASS_LOCK) {
			if(sqlSessionFactory == null) {
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			}
		}
		
		return sqlSessionFactory;
		
	}
	
	/**
	 * 打开SqlSession
	 */
	
	public static SqlSession openSqlSession() {
		if(sqlSessionFactory == null) {
			initSqlSessionFactory();
		}
		return sqlSessionFactory.openSession();
	}
}
