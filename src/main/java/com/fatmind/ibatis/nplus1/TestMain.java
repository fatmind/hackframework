package com.fatmind.ibatis.nplus1;

import java.io.InputStream;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.ibatis.sqlmap.client.SqlMapSession;


public class TestMain {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		
		InputStream configInput = TestMain.class.getResourceAsStream("sql_map_config.xml");
		SqlMapClient sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(configInput);
		
		SqlMapSession sqlsession = sqlMapClient.openSession();
		List<Department> deps = (List<Department>)sqlsession.queryForList("queryDepartment");
		assert deps != null;
		System.out.println(deps.size());
		System.out.println(deps.get(0).getEmployes().size());
	}

}
