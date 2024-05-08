package hello.itemservice.web.form;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerClass {
    @GetMapping("/exit")
    public void exit() {
        System.exit(0);
        //자바 프로그램 종료
    }
}
