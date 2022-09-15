package myfirstproject.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @Autowired
    TestTbService service;

    @GetMapping("/")
    public List<TestTb> getName() {
        List<TestTb> list = service.getList();
        return list;
    }
}
