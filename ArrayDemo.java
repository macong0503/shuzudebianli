package com.fs.test;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5};
		/**
		 * for循环遍历
		 * for(表达式1；表达式2；表达式3){ 循环体 }
		 * 表达式1：声明一个变量并初始化
		 * 表达式2：循环条件判断
		 * 表达式3：修整变量
		 */

		for(int i = 0;i<a.length;i++){
			System.out.println("下标为"+ i +"的值为"+a[i]);
		}
		
		/*
		 * foreach遍历
		 * for(数据类型 变量 X ： 遍历对象obj){
		 *      引用X语句
		 * }
		 * 数据类型：表示的是数组中元素的值
		 * X:表示的是数组中每一个元素的值
		 * obj：表示的是遍历的数组的对象
		 * 
		 */
		
		for(int x : a){
			System.out.println(x);
		}
		//每一个foreach语句都能改编成for循环，但并不是每一个for循环都能改编成foreach语句
	}

}
