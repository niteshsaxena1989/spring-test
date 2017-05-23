package com.nitesh.test.controller;

import com.nitesh.test.dto.HotelChainDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HotelChainController {

//    @RequestMapping(value="/getChains",method = RequestMethod.GET,headers="Accept=application/json")
    @GetMapping("/getChains")
    public List<HotelChainDTO> chains(HttpServletRequest request, HttpServletResponse response) {
        List<HotelChainDTO> list = new ArrayList<HotelChainDTO>();
//        response.setContentType("application/xml");
        HotelChainDTO hotelChainDTO1 = new HotelChainDTO("1011", "1");
        HotelChainDTO hotelChainDTO2 = new HotelChainDTO("1012", "1");
        list.add(hotelChainDTO1);
//        list.add(hotelChainDTO2);
        return list;
    }
}
