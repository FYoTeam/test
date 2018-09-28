package com.tototwo.controller.register.controller.test;

import java.util.ArrayList;

public class sx {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		boolean flag = false;
		for (Integer ls : list) {
			if (ls==4) {
				flag = true;
				System.out.println("4");
			}
		}
		if (flag) {
			for (Integer ls : list) {
				if (ls==1) {
					System.out.println("1");
				}
				if (ls==2) {
					System.out.println("2");
				}
				if (ls==3) {
					System.out.println("3");
				}
				if (ls==5) {
					System.out.println("5");
				}
				if (ls==6) {
					System.out.println("6");
				}
			}
		}
		System.out.println("111111");
	}
}
