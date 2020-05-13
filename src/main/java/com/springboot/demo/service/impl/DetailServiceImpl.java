package com.springboot.demo.service.impl;

import com.springboot.demo.mapper.DetailMapper;
import com.springboot.demo.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("DetailService")
public class DetailServiceImpl implements DetailService {

    @Autowired
    DetailMapper mDetailMapper;

    @Override
    public List<String> getDetailNameList() {
        return mDetailMapper.getDetailNameList();
    }

}
