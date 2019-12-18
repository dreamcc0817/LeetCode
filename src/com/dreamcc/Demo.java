package com.dreamcc;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc
 * @Description:
 * @Author: dreamcc
 * @Date: 2019/7/12 10:39
 * @Version: V1.0
 */
public class Demo {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println();
	}
}


interface Componet{
	void process();
}

interface Renderable{
	abstract void process();
	abstract void render();
}

interface ChartWrap extends Componet,Renderable{
	Pie pie = new Pie("foo");
	//abstract void render(){};
}

class Pie implements ChartWrap{

	private String name;

	public String getName(){
		return name;
	}

	public Pie(String name) {
		this.name = name;
	}

	@Override
	public void process() {
		//pie = new Pie("foo1");
		Map map = new HashMap<>();
		System.out.println(pie.getName());
	}

	@Override
	public void render() {
		System.out.println(pie.getName());
	}
}