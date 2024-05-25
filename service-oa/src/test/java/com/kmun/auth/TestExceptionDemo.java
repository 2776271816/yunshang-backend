package com.kmun.auth;

import com.kmun.common.execption.GuiguException;
import com.kmun.model.system.SysRole;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestExceptionDemo {
    @Test
    public void exceptionTest(){
        try {
            int a = 10/0;
        }catch(Exception e) {
            throw new GuiguException(20001,"出现自定义异常");
        }
    }
}
