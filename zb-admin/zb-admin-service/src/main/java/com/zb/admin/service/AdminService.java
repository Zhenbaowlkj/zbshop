package com.zb.admin.service;

import com.zb.admin.mapper.AdminMapper;
import com.zb.admin.pojo.Admin;
import com.zb.common.utils.CodecUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    AdminMapper adminMapper;
    public Admin queryAdmin(String userName,String passWord){
        Admin admin=new Admin();
        admin.setUserName(userName);
        Admin adm=this.adminMapper.selectOne(admin);
        if (adm == null){
            return null;
        }
        if (!adm.getPassWord().equals(CodecUtils.md5Hex(passWord,adm.getSalt()))){
            return null;
        }
        return adm;

    }

}
