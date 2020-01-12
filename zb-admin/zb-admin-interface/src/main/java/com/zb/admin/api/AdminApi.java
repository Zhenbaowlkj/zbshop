package com.zb.admin.api;

import com.zb.admin.pojo.Admin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface AdminApi {
    @GetMapping("query")
    public Admin queryAdmin(@RequestParam("username") String username,@RequestParam("password") String password);

 }