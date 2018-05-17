package 江西财经大学第一届程序设计竞赛;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E_消息列表 {

	static List<User> topUsers;
	static List<User> users;
	static int flag = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int T = sc.nextInt();
		while (T-- != 0) {
			topUsers = new ArrayList<User>();
			users = new ArrayList<User>();
			flag = 0;
			int n = sc.nextInt();
			while (n-- != 0) {
				// String str = sc.nextLine();
				// System.out.println("---"+str);
				// String cmd = str.split(" ")[0];
				// String id = str.split(" ")[1];

				String cmd = sc.next();
				String id = sc.next();
				if (cmd.equals("recv")) {
					recv(id);
				}
				if (cmd.equals("view")) {
					view(id);
				}
				if (cmd.equals("up")) {
					up(id);
				}
				if (cmd.equals("down")) {
					down(id);
				}
				if (cmd.equals("delete")) {
					delete(id);
				}

				// show();
				// System.out.println("----");
			}

			show();
			System.out.println();
		}

	}

	public static void show() {
		
		for(int i = 0; i < topUsers.size(); i++){
			for(int j = i+1; j < topUsers.size(); j++){
				if(topUsers.get(i).time < topUsers.get(j).time){
					User u = topUsers.get(i);
					topUsers.set(i,topUsers.get(j));
					topUsers.set(j,u);
				}
			}
		}
		for(int i = 0; i < users.size(); i++){
			for(int j = i+1; j < users.size(); j++){
				if(users.get(i).time < users.get(j).time){
					User u = users.get(i);
					users.set(i,users.get(j));
					users.set(j,u);
				}
			}
		}
		
		for (User u : topUsers) {
			System.out.println(u.id + " " + u.msg);
		}
		for (User u : users) {
			System.out.println(u.id + " " + u.msg);
		}
	}

	public static void recv(String id) {
		int topIndex = getTopIndex(id);
		// System.out.println("topIndex:"+topIndex);
		if (topIndex == -1) { // 如果不在置顶里
			int index = getIndex(id);
			if (index == -1) { // 如果没有消息
				User u = new User(id, 1, flag++);
				users.add(u);
				return;
			}
			// 如果有消息
			users.get(index).setMsg(users.get(index).msg + 1);
			users.get(index).setTime(flag++);
			return;
		}
		// 如果在置顶里
		User u = topUsers.get(topIndex);
		topUsers.get(topIndex).setMsg(u.msg + 1);
		topUsers.get(topIndex).setTime(flag++);

	}

	public static void view(String id) {
		int topIndex = getTopIndex(id);
		if (topIndex != -1) {
			topUsers.get(topIndex).setMsg(0);
			return;
		}
		int index = getIndex(id);
		if (index != -1) {
			users.get(index).setMsg(0);
			// return;
		}
	}

	public static void up(String id) {
		int index = getIndex(id);
		if(index == -1){
			return;
		}
		User u = users.get(index);
		users.remove(index);
		int topIndex = getTopIndex(id);
		if (topIndex == -1) {
			topUsers.add(u);
			return;
		}

	}

	public static void down(String id) {
		int topIndex = getTopIndex(id);
		if(topIndex == -1){
			return;
		}
		User u = topUsers.get(topIndex);
		topUsers.remove(topIndex);
		int index = getIndex(id);
		if(index == -1){
			users.add(u);
		}
		
	}

	public static void delete(String id) {
		int topIndex = getTopIndex(id);
		if (topIndex != -1) {
			topUsers.remove(topIndex);
			return;
		}
		int index = getIndex(id);
		if (index != -1) {
			users.remove(index);
			// return;
		}

	}

	public static int getTopIndex(String id) {
		for (int i = 0; i < topUsers.size(); i++) {
			if (id.equals(topUsers.get(i).id)) {
				return i;
			}
		}
		return -1;
	}

	public static int getIndex(String id) {
		for (int i = 0; i < users.size(); i++) {
			if (id.equals(users.get(i).id)) {
				return i;
			}
		}
		return -1;
	}
}

class User {
	String id;
	int msg;
	int time;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getMsg() {
		return msg;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public void setMsg(int msg) {
		this.msg = msg;
	}

	public User(String id, int msg, int time) {
		super();
		this.id = id;
		this.msg = msg;
		this.time = time;
	}

}