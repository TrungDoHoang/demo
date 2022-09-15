package myfirstproject.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestTbService {
    @Autowired
    private TestTbRepository repository;

    public List<TestTb> getList() {
        return repository.getList();

    }
}
