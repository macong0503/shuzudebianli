package com.fs.test;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5};
		/**
		 * forѭ������
		 * for(���ʽ1�����ʽ2�����ʽ3){ ѭ���� }
		 * ���ʽ1������һ����������ʼ��
		 * ���ʽ2��ѭ�������ж�
		 * ���ʽ3����������
		 */

		for(int i = 0;i<a.length;i++){
			System.out.println("�±�Ϊ"+ i +"��ֵΪ"+a[i]);
		}
		
		/*
		 * foreach����
		 * for(�������� ���� X �� ��������obj){
		 *      ����X���
		 * }
		 * �������ͣ���ʾ����������Ԫ�ص�ֵ
		 * X:��ʾ����������ÿһ��Ԫ�ص�ֵ
		 * obj����ʾ���Ǳ���������Ķ���
		 * 
		 */
		
		for(int x : a){
			System.out.println(x);
		}
		//ÿһ��foreach��䶼�ܸı��forѭ������������ÿһ��forѭ�����ܸı��foreach���
	}

}
