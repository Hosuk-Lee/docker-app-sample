package test.unit;

import hs.sample.k.apiserver.ProductDirectoryApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ProductDirectoryApplication.class)
class SpringBootConfigTest {

    @Test
    void load(){
        System.out.println("성공");
    }
}
