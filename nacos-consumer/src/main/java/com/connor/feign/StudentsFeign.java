package com.connor.feign;

import com.connor.beans.Students;
import com.connor.fallback.ProviderFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "nacos-provider", fallback = ProviderFallback.class)
public interface StudentsFeign {

    @RequestMapping("/getOne")
    Students getFirstStudent();

}
