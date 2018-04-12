package com.syc.tsgl.test.database.meta;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseMetaTest {
	
	private DatabaseMetaData dbMetaData = null;
	
	private Connection con = null;

	public DatabaseMetaTest() {  
        this.getDatabaseMetaData();  
    }
	
	private void oracleDatebase() throws ClassNotFoundException{
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@103.249.252.109:10521:zbdb";
		String user = "zb";
		String password = "zb";
	}

	private void getDatabaseMetaData() {
		try {
			if (dbMetaData == null) {
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/tsgl?characterEncoding=utf8&useSSL=true";
				String user = "root";
				String password = "root";
				con = DriverManager.getConnection(url, user, password);
				dbMetaData = con.getMetaData();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	/**
	 * 获得该用户下面的所有表
	 */
	public void getAllTableList(String schemaName) {
		try {
			// table type. Typical types are "TABLE", "VIEW", "SYSTEM TABLE",
			// "GLOBAL TEMPORARY", "LOCAL TEMPORARY", "ALIAS", "SYNONYM".
			String[] types = { "TABLE" };
			ResultSet rs = dbMetaData.getTables(null, schemaName, "%", types);
			while (rs.next()) {
				String tableName = rs.getString("TABLE_NAME"); // 表名
				//String tableType = rs.getString("TABLE_TYPE"); // 表类型
				//String remarks = rs.getString("REMARKS"); // 表备注
				System.out.println(tableName);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获得该用户下面的所有视图
	 */
	public void getAllViewList(String schemaName) {
		try {
			String[] types = { "VIEW" };
			ResultSet rs = dbMetaData.getTables(null, schemaName, "%", types);
			while (rs.next()) {
				String viewName = rs.getString("TABLE_NAME"); // 视图名
				String viewType = rs.getString("TABLE_TYPE"); // 视图类型
				String remarks = rs.getString("REMARKS"); // 视图备注
				System.out.println(viewName + "-" + viewType + "-" + remarks);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获得表或视图中的所有列信息
	 */
	public void getTableColumns(String schemaName, String tableName) {

		try {

			ResultSet rs = dbMetaData.getColumns(null, schemaName, tableName, "%");
			while (rs.next()) {
				String tableCat = rs.getString("TABLE_CAT");// 表目录（可能为空）
				//String tableSchemaName = rs.getString("TABLE_SCHEM");// 表的架构（可能为空）
				String tableName_ = rs.getString("TABLE_NAME");// 表名
				String columnName = rs.getString("COLUMN_NAME");// 列名
				//int dataType = rs.getInt("DATA_TYPE"); // 对应的java.sql.Types类型
				String dataTypeName = rs.getString("TYPE_NAME");// java.sql.Types类型
																// 名称
				//int columnSize = rs.getInt("COLUMN_SIZE");// 列大小
				String remarks = rs.getString("REMARKS");// 列描述
				//String columnDef = rs.getString("COLUMN_DEF");// 默认值
				//int sqlDataType = rs.getInt("SQL_DATA_TYPE");// sql数据类型

				/**
				 * ISO规则用来确定某一列的为空性。 是---如果该参数可以包括空值; 无---如果参数不能包含空值
				 * 空字符串---如果参数为空性是未知的
				 */
				String isNullAble = rs.getString("IS_NULLABLE");

				/**
				 * 指示此列是否是自动递增 是---如果该列是自动递增 无---如果不是自动递增列 空字串---如果不能确定它是否
				 * 列是自动递增的参数是未知
				 */
				String isAutoincrement = rs.getString("IS_AUTOINCREMENT");

				System.out.println(tableCat + "-" +  "-" + tableName_ + "-" + columnName + "-"
						 + "-" + dataTypeName + "-" 
						+ "-"  + "-" + remarks + "-" + "-" + isAutoincrement+"-"+isNullAble);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获得一个表的主键信息
	 */
	public void getAllPrimaryKeys(String schemaName, String tableName) {
		try {
			ResultSet rs = dbMetaData.getPrimaryKeys(null, schemaName, tableName);
			while (rs.next()) {
				String columnName = rs.getString("COLUMN_NAME");// 列名
				//short keySeq = rs.getShort("KEY_SEQ");// 序列号(主键内值1表示第一列的主键，值2代表主键内的第二列)
				String pkName = rs.getString("PK_NAME"); // 主键名称
				System.out.println(columnName + "-" + pkName);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void colseCon() {
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		DatabaseMetaTest databaseMetaTest=new DatabaseMetaTest();
		// metaData.getDataBaseInformations();
		// metaData.getAllTableList(null);
		// metaData.getAllViewList(null);
		// metaData.getAllSchemas();
		// metaData.getTableColumns(null, "zsc_admin");
		// metaData.getIndexInfo(null, "zsc_admin");
		// metaData.getAllPrimaryKeys(null, "zsc_admin");
		databaseMetaTest.getAllTableList("zb");
	}
}
