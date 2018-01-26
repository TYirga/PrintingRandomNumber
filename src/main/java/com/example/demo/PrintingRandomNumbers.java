package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Random;

@RestController
public class PrintingRandomNumbers {
    @RequestMapping("/")
    public int randomNumber(){
        int number=0;
        Random random=new Random();
         number= 1+ random.nextInt();
        System.out.println(number);
   return number; }
}
