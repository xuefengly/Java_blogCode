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

	//ajax����ִ�еķ���
	public String ajaxJsonMethod(){
		HashMap<String,String> map = new HashMap<>();
		map.put("name", "aaa");
		map.put("name2", "aaa");
		map.put("name3", "aaa");
		
		//��Map����ת��Ϊjson�ַ���
		ObjectMapper mapper = new ObjectMapper();
		try {
			data = mapper.writeValueAsString(map);//ת��Ϊjson��ʽ
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//���سɹ���ʶ
		return SUCCESS;
	}
}
