package com.luwenxin.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.luwenxin.dao.MysqlDao;
import com.luwenxin.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User> {
	private User user = null;

	List<User> users = new ArrayList<User>();

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String get() throws IOException {
		MysqlDao dao = new MysqlDao();
		users = dao.getUsers();
		return "get";
	}

	public String add() throws IOException {
		System.out.println(user);

		MysqlDao dao = new MysqlDao();
		dao.insertUser(user);
		return "add";
	}

	public String update() throws IOException {
		System.out.println(user);
		MysqlDao dao = new MysqlDao();
		dao.updateUser(user);
		return "update";
	}

	public String delete() throws IOException {
		System.out.println(user);
		MysqlDao dao = new MysqlDao();
		dao.deleteUser(user);
		return "delete";
	}

	public User getModel() {
		if (user == null) {
			user = new User();
		}
		return user;
	}

}
