package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Studentpojo;


@Controller
public class Controller1 {
	@RequestMapping("data")
	public @ResponseBody  void data(@RequestParam("name123")String name) {
		System.out.println(name); 
	}
	
	@RequestMapping("data/{name}")
	public @ResponseBody  void data1(@PathVariable("name")String name) {
		System.out.println("path variable:"+ name); 
	}
	
	@RequestMapping(value="savedata",method=RequestMethod.POST)
	public @ResponseBody void savedata( Studentpojo s) {
		System.out.println("id:"+s.getId());
		System.out.println("name:"+s.getName());
		
	}
		@RequestMapping(value="savedata1",method=RequestMethod.POST)
	public @ResponseBody void savedata1(@RequestBody Studentpojo s) {
		System.out.println("id:"+s.getId());
		System.out.println("name:"+s.getName());
	}
	 
	@RequestMapping("getStudent")
	public @ResponseBody Studentpojo getStudent() {
		Studentpojo s=new Studentpojo();
		s.setId(1);
		s.setName("abc");
		return s;
	}
	
	
	@RequestMapping("getStudents")
	public @ResponseBody List<Studentpojo> getStudents() {
		Studentpojo s1=new Studentpojo();
		s1.setId(1);
		s1.setName("a1");
		
		Studentpojo s2=new Studentpojo();
		s2.setId(2);
		s2.setName("a2");
		
		Studentpojo s3=new Studentpojo();
		s3.setId(3);
		s3.setName("a3");
		
		List<Studentpojo> ls=new ArrayList<>();
		ls.add(s1);
		ls.add(s2);
		ls.add(s3);
		return ls;
	
	}
	
	
	@RequestMapping("getmarks")
	public @ResponseBody Map<Integer, Integer> getmarks(){
	Map<Integer,Integer> m=new HashMap<Integer,Integer>();
	m.put(1, 23);
	m.put(2,24);
	m.put(3, 25);
	return m;
	
	}
	
	@RequestMapping("getmarksmap")
	public @ResponseBody  Map<Integer,Studentpojo> getStudentsmap() {
		Studentpojo s1=new Studentpojo();
		s1.setId(1);
		s1.setName("a1");
		
		Studentpojo s2=new Studentpojo();
		s2.setId(2);
		s2.setName("a2");
		
		Studentpojo s3=new Studentpojo();
		s3.setId(3);
		s3.setName("a3");
		
		Map<Integer,Studentpojo> m=new HashMap<Integer,Studentpojo>();
		m.put(1,s1);
		m.put(2, s2);
		m.put(3, s3);
		return m;
	
	}
}
