package com.manpreet.springDemo.domain;

import lombok.*;
//import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
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
