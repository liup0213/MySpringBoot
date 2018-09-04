package com.liupeng.springboot.controller;

import com.liupeng.springboot.model.User;
import org.springframework.web.bind.annotation.*;

//@RestController（用于返回字符串 或者 json） = @Controller + @ResponseBody（返回页面）
@RestController//是@Controller + @ResponseBody的组合注解
public class MVCController {

    @RequestMapping(value = "/boot/getUser",method = RequestMethod.GET)
    public Object getUser(){
        User user = new User();
        user.setId(1995);
        user.setName("liupeng");
        return user;
    }

    /*浏览器的地址访问都是GET请求
     *GetMapping只支持get请求 : @GetMapping = @RequestMapping + RequestMethod.GET
     * return
     */
    @GetMapping("/boot/getUser1")
    public Object getUser1(){
        User user = new User();
        user.setId(1996);
        user.setName("liupeng2");
        return user;
    }

    /*表单Form的提交都是POST
     *PostMapping只支持post请求 : @PostMapping = @RequestMapping + RequestMethod.POST
     * return
     */
    @PostMapping("/boot/getUser2")
    public Object getUser2(){
        User user = new User();
        user.setId(1997);
        user.setName("liupeng3");
        return user;
    }

    /*修改操作的提交，可用POST代替
     *PutMapping支持put操作 : @PutMapping = @RequestMapping + RequestMethod.PUT
     * return
     */
    @PutMapping ("/boot/getUser3")
    public Object getUser3(){
        User user = new User();
        user.setId(1997);
        user.setName("liupeng3");
        return user;
    }

    /*删除操作的提交，可用Get代替
     *DeleteMapping支持删除Del数据操作 : @PutMapping = @RequestMapping + RequestMethod.DeLETE
     * return
     */
    @DeleteMapping("/boot/getUser3")
    public Object getUser4(){
        User user = new User();
        user.setId(1997);
        user.setName("liupeng3");
        return user;
    }

}
