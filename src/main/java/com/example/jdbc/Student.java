package com.example.jdbc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author mihai
 */
public class Student {
    
    private String id;git
    private String name;
    private String course;
    private double mark;
    
    
    public Student (String idIn, String nameIn, String courseIn)
    {
        this.id = idIn;
        this.name = nameIn;
        this.course = courseIn;
        this.mark = 0.0;
        
    }
    
    @Override
    public String toString()
    {
        
        return String.format("Name: %s, Course: %s" ,this.name, this.course);
        
        //return ("Name: " + this.name + ", Course: "+ this.course + ", Mark: "+ this.mark);
    }
    
    public boolean setMark(double markIn)
    {
        if(markIn >= 0 && markIn <= 100)
        {
            
            this.mark = markIn;
            return true;
            
        }
        
        return false;
        
    }
    
    public String getName()
    {
        return this.name;
    }
    public String getCourse()
    {
        return this.course;
    }
    public double getMark()
    {
        return this.mark;
    }
    public String getId()
    {
        return this.id;
    }
    
    public String getGrade()
    {
        if (this.mark >= 70)
            return "First";
        
        if (this.mark >= 60)
            return "2/1";
        
        if (this.mark >= 50)
            return "2/2";
        
        if (this.mark >= 40)
            return "Third";
        
        return "Fail";
        
    }
    
    public boolean didPass()
    {
        return getGrade() != "Fail";
    }
    
    public String getStatus()
    {
        
        String passed = this.didPass() ? "Yes" : "No";
        return String.format("Mark: %.1f, Grade: %s, Passed: %s", this.mark, this.getGrade(), passed);
    }
    
}
