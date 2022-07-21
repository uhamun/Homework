package kr.uha.demo.controller.basic.first;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class dice {

        @GetMapping("/")
        public static void main(String[] args) {
            int ramdom=(int)(Math.random()*6)+1;
            int number=ramdom;
            System.out.println("주사위 번호:"+number);
        }
    }

