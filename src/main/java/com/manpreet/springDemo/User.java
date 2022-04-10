package com.manpreet.springDemo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String fname;
    private String lname;
    private String cname;
    private List<String> hobbies;
    private  Map<String,String> courseGradeMap;
    public void init()
    {
        if(hobbies==null)
        {
            hobbies=new ArrayList<>();
        }
        hobbies.add("Coding");
    }
    public void destroy(){
        System.out.println("Destroying");
    }

}
