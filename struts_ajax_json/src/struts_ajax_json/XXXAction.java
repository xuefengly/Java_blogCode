package struts_ajax_json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opensymphony.xwork2.ActionSupport;

public class XXXAction extends ActionSupport{
	private String data;	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	//ajax请求执行的方法
	public String ajaxJsonMethod(){
		HashMap<String,String> map = new HashMap<>();
		map.put("name", "aaa");
		map.put("name2", "aaa");
		map.put("name3", "aaa");
		
		//把Map集合转换为json字符串
		ObjectMapper mapper = new ObjectMapper();
		try {
			data = mapper.writeValueAsString(map);//转换为json形式
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//返回成功标识
		return SUCCESS;
	}
}
