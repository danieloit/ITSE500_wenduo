package edu.oit.lesson7;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Homework2 {

	public static void main(String[] args) {
		
		Map<String, Integer> roster = new HashMap<>();
        roster.put("Mort", 77);
        roster.put("Dan", 81);
        roster.put("Alyssa", 98);
        roster.put("Kim", 52);
        roster.put("Lisa", 87);
        roster.put("Bob", 43);
        roster.put("Jeff", 70);
        roster.put("Sylvia", 92);
        roster.put("Vikram", 90);
        
        Map<Integer, String> gradeMap = new HashMap<>();
        gradeMap.put(52, "D");
        gradeMap.put(70, "C-");
        gradeMap.put(73, "C");
        gradeMap.put(76, "C+");
        gradeMap.put(80, "B-");
        gradeMap.put(84, "B");
        gradeMap.put(87, "B+");
        gradeMap.put(89, "A-");
        gradeMap.put(91, "A");
        gradeMap.put(98, "A+");
        
        Map<String, String> getGrade = teacher(roster, gradeMap);
                
		for (Entry<String, String> entry : getGrade.entrySet()) {
			System.out.println(entry.getKey() + "'s grade is " + entry.getValue());
		}
		
		

	}

	
	
	public static Map<String, String> teacher(Map<String, Integer> roster, Map<Integer, String> gradeMap) {
       
		Map<String, String> studentsGrades = new HashMap<>();

		for (String studentName : roster.keySet()) {
            
            int gradeAdjust = 0;
            for (Integer grade : gradeMap.keySet()) {
                if (roster.get(studentName) >= grade && grade > gradeAdjust) {
                    gradeAdjust = grade;
                }
                
                
            }
            
            String getGrade = (gradeAdjust > 0)? gradeMap.get(gradeAdjust):"F";
            
            studentsGrades.put(studentName, getGrade);
        }
        
        return studentsGrades;
    }
	
	
	
	
	
}
