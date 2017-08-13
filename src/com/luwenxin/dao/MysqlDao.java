package com.luwenxin.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.luwenxin.model.User;

public class MysqlDao {
	private SqlSessionFactory sessionFactory = null;
	private SqlSession session = null;

	public MysqlDao() throws IOException {
		String resource = "config.xml";
		Reader reader = Resources.getResourceAsReader(resource);
		sessionFactory = new SqlSessionFactoryBuilder().build(reader);
	}

	public void updateUser(User user) {
		session = sessionFactory.openSession();
		int row = session.update("userMapper.updateUser", user);
		session.commit();
		System.out.println(row);
	}

	public void deleteUser(User user) {
		session = sessionFactory.openSession();
		int row = session.delete("userMapper.deleteUser", user);
		session.commit();
		System.out.println(row);
	}

	public void insertUser(User user) {
		session = sessionFactory.openSession();
		int row = session.insert("userMapper.insertUser", user);
		session.commit();
		System.out.println(row);
	}

	public List<User> getUsers() {
		List<User> users = new ArrayList<User>();
		session = sessionFactory.openSession();
		users = session.selectList("userMapper.getUser");
		session.commit();
		return users;
	}

}
