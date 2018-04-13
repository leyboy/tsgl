package com.syc.tsgl.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.syc.tsgl.entity.Student;

/**
 * 分组转换工具类
 **/
public class GroupUtils {

	/**
	 * 将随机数转换成学生的分组信息
	 **/
	public static List<Student> changeToGroupStr(List<Student> students, int groupSize) {
		int size = students.size();
		List<Integer> randomInts = RandomUtils.randomArray(0, size-1, size);
		System.out.println("randomInts" + randomInts);
		int groupNumber = size / groupSize;
		List<Student> tmpStudents = students;
		Map<Integer, String> map=new HashMap<>();
		System.out.println(groupNumber);
		for(int i=0;i<groupNumber;i++){
			final int index=i;
			map.put(index+1, "第"+(index+1)+"组");
			System.out.println(map.get(1)+"-->"+map.get(2));
		}
		for(int i=0;i<groupNumber;i++){
			//System.out.println(groupNumber+"-->"+i*(groupNumber-1)+"-->"+((i*groupNumber)-1));
			List<Integer> subRandomInts=randomInts.subList(i*groupNumber,(i+1)*groupNumber);
			for(int j=0;j<groupSize;j++){
				tmpStudents.get(subRandomInts.get(j)).setStudentgroup(map.get(j+1));
			}
		}
		return tmpStudents;
	}	
}
