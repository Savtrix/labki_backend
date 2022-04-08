package com.example.demo;


import com.fasterxml.jackson.databind.JsonNode;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.HashMap;
import java.util.Map;


@Controller
public class UsersController {
    private Map<Integer, UserEntity> UserMap = new HashMap<Integer, UserEntity>();



    @GetMapping("/users")
    @ResponseBody
    public String users(){
        String jsonStr = JSONValue.toJSONString(UserMap);
        return jsonStr;
    }

    @GetMapping("/usersDefault")
    public String  usersDefault(){
        UserMap.put(0,new UserEntity("fsahu", 24));
        UserMap.put(1,new UserEntity("y45hg45", 99));
        UserMap.put(2,new UserEntity("gfsf", 231));
        UserMap.put(3,new UserEntity("dadfu", 44));
        return "redirect:users";
    }
    @GetMapping("/users/{id}/get")
    @ResponseBody
    public String user(@PathVariable Integer id){
        JSONObject o = new JSONObject();
        o.put(id,UserMap.get(id));
        String jsonStr = JSONValue.toJSONString(o);
        return jsonStr;
    }
    @GetMapping("/users/add")

    public  String userAdd(@RequestParam String name, @RequestParam Integer age) {
        UserMap.put(UserMap.size(),new UserEntity(name,age));
        return "redirect:../users";
    }
    @GetMapping("/users/remove/{id}")
    public String userRemove(@PathVariable Integer id){
        if(UserMap.containsKey(id))
        UserMap.remove(id);
        return "redirect:../../users";
    }


}
