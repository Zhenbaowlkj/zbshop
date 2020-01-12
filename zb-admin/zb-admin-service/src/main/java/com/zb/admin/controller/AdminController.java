package com.zb.admin.controller;

import com.zb.admin.pojo.Admin;
import com.zb.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Autowired
    AdminService adminService;
    @GetMapping("query")
    public ResponseEntity<Admin> queryAdmin(@RequestParam("userName") String userName,@RequestParam("passWord") String passWord){
      Admin admin=this.adminService.queryAdmin(userName,passWord);
      if (admin== null){
          return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
      }
      return ResponseEntity.ok(admin);
    }

}
