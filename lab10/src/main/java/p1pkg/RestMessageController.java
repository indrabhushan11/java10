package p1pkg;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import p1pkg.Message;



@RestController
@RequestMapping("/")
public class RestMessageController {
	//ArrayList<Message> al = new ArrayList<Message>();
	ArrayList<Message> al = new ArrayList<Message>();
	@GetMapping("/")
	public Message getMessageById(){
		
		Message m1 = null;
		return m1;
	}
	@RequestMapping(value = "/display/{id}")
    public Message getMessageById(@PathVariable int id) {
		Message m1 = null;
		lp:	for(Message m:al) {
				if(m.getId()==id) {
					m1 = m;
					break lp;
				}
			}
			return m1;
		}
		
    
	
	@RequestMapping(value = "/add")
	public List<Message> add(@RequestParam int id, String message){
		Message m = new Message(id, message);
		al.add(m);
		return al;
	}
	
	
	@RequestMapping(value = "/delete/{id}")
	public List<Message> delete(@PathVariable int id){
		Message m1 = null;
		for(Message m: al) {
			if(m.getId()==id) {
				al.remove(m);
			}
		}
		return al;
	}	
	
	
	@RequestMapping(value = "/display")
	public List<Message> displayall(){
		return al;
	}
	
	@RequestMapping(value = "/update")
	public List<Message> update(@RequestParam int id, String message){
		lp :for(Message m:al) {
			if(m.getId()==id) {
				m.setMessage(message);
				break lp;
			}
		}
		return al;
	}
	
	@RequestMapping(value = "/update/{id}")
	public Message updatebyid(@PathVariable int id, String message){
		Message m1=null;
		lp :for(Message m:al) {
			if(m.getId()==id) {
				m.setMessage(message);
				m1=m;
				break lp;
			}
		}
		return m1;
	}
	
}

