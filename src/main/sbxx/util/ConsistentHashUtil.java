package main.sbxx.util;


import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 哈希一致性算法
 * @author Dair
 * @since
 */
public class ConsistentHashUtil {
	public static void main(String[] args) {
		ConsistentHashUtil consistentHashUtil = new ConsistentHashUtil();
		System.out.println(consistentHashUtil.getRealServer("192.168.0.39:1181:1"));
		System.out.println(consistentHashUtil.getRealServer("3"));
		System.out.println(consistentHashUtil.getRealServer("2"));
		System.out.println(consistentHashUtil.getRealServer("4"));
		System.out.println(consistentHashUtil.getRealServer("5"));
		System.out.println(consistentHashUtil.getRealServer("6"));
		System.out.println(consistentHashUtil.getRealServer("7"));
		System.out.println(consistentHashUtil.getRealServer("8"));
		System.out.println(consistentHashUtil.getRealServer("9"));
		System.out.println(consistentHashUtil.getRealServer("10"));
		System.out.println(consistentHashUtil.getRealServer("11"));
		System.out.println(consistentHashUtil.getRealServer("12"));
	}
	
	private String[] ipArr = new String[]{"192.168.0.39:1181", "192.168.0.19:1181", "192.168.0.29:1181"};
	
	
	private final int VIRUAL_NODE_NUM = 3;
	
	
	private SortedMap<Long, String> nodes = new TreeMap<>();
	
	
	public ConsistentHashUtil() {
		for (String s : ipArr) {
			addNode(s);
		}
	}
	
	/**
	 * 添加节点
	 * @param nodeKey
	 */
	private void addNode(String nodeKey) {
		for (int i = 0; i < VIRUAL_NODE_NUM; i++) {
			long hashCode = hash(nodeKey + ":" + i);
			nodes.put(hashCode, nodeKey);
		}
	}
	
	/**
	 * md5后截取16位后对2^64取模
	 * @param key
	 * @return
	 */
	private long hash(String key) {
		String md5 = Md5Utils.MD5Encode(key, "utf-8", false);
		return Long.parseLong(md5.substring(0, 15), 16) % (long) Math.pow(2, 64);
	}
	
	/**
	 * 顺时针获取服务器
	 * @param key
	 * @return
	 */
	private String getRealServer(String key) {
		long hash = hash(key);
		if(!nodes.containsKey(hash)){
			SortedMap<Long, String> map = nodes.tailMap(hash);
			hash = map.isEmpty() ? nodes.firstKey() : map.firstKey();
		}
		return nodes.get(hash);
	}
}
