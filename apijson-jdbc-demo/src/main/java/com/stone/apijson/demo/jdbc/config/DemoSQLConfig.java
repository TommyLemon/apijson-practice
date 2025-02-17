package com.stone.apijson.demo.jdbc.config;

import apijson.RequestMethod;
import apijson.framework.APIJSONSQLConfig;
import com.stone.apijson.demo.jdbc.model.MomentComment;

public class DemoSQLConfig extends APIJSONSQLConfig {

    public DemoSQLConfig() {
        super();
    }

    public DemoSQLConfig(RequestMethod method, String table) {
        super(method, table);
    }

    static {
        DEFAULT_DATABASE = "MYSQL";  // MYSQL, POSTGRESQL, SQLSERVER, ORACLE, DB2
        DEFAULT_SCHEMA = "todo_demo_db";  // 数据库的 Schema 名，决定了链接哪个数据库

        //表名映射，隐藏真实表名，对安全要求很高的表可以这么做
        TABLE_KEY_MAP.put(MomentComment.class.getSimpleName(), "apijson_moment_comment");
    }

    @Override
    public String getDBVersion() {
        return "5.7.26";
    }

    @Override
    public String getDBUri() {
        // 数据库实例链接信息
        return "jdbc:mysql://127.0.0.1:3306?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=UTF-8";
    }

    @Override
    public String getDBAccount() {
        // 数据库用户名
        return "root";
    }

    @Override
    public String getDBPassword() {
        // 数据库密码
        return "Root@123";
    }
}
