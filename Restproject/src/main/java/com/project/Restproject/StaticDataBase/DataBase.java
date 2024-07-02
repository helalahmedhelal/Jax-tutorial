package com.project.Restproject.StaticDataBase;
import java.util.HashMap;
import java.util.Map;
import com.project.Restproject.model.*;
public class DataBase {
	
private static Map<Long, messages> messages=new HashMap<>();

public static Map<Long, messages> getmessages(){
	return messages;
}
}
