package com.project.Restproject.messageService;

import java.util.*;  
import com.project.Restproject.StaticDataBase.*;
import com.project.Restproject.model.messages;

public class messageService {

	private Map<Long, messages> mymessages=DataBase.getmessages();

public messageService() {
	mymessages.put(1l, new messages(1,"hello world 1","ahmed"));
	mymessages.put(2l, new messages(2,"hello world 2","mohamed"));
	mymessages.put(3l, new messages(3,"hello world 3","koushik"));
}
public List<messages> getAllMessages(){
	
	return new ArrayList<messages>(mymessages.values());
}

public messages getMessage(long id) {
	return mymessages.get(id);
}

public messages addMessage(messages message) {
	message.setId(mymessages.size()+1);
	mymessages.put(message.getId(), message);
	return message;
}

public messages updateMessage(messages message) {
	if(message.getId()==0) {
		return null;
	}
	mymessages.put(message.getId(), message);
	return message;
}


public messages removeMessage(long id) {
	
	return mymessages.remove(id);
}
}

