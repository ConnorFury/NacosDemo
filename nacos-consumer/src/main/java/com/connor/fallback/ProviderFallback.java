package com.connor.fallback;

import com.connor.beans.Students;
import com.connor.feign.StudentsFeign;
import org.springframework.stereotype.Component;

@Component
public class ProviderFallback implements StudentsFeign {
    @Override
    public Students getFirstStudent() {
        System.out.println("服务器忙");
        return null;
    }
}
