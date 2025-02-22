package com.example.demo.service;

import com.example.demo.dto.DefaultDto;
import com.example.demo.dto.TestpostDto;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public interface TestpostService {

    //CREATE
    DefaultDto.CreateResDto create(TestpostDto.CreateReqDto param);
    //READ
    TestpostDto.DetailResDto detail(Long id);
    List<TestpostDto.DetailResDto> list(TestpostDto.ListReqDto param);
    List<TestpostDto.DetailResDto> deletedList(TestpostDto.ListReqDto param);
    //UPDATE
    void update(TestpostDto.UpdateReqDto param);
    //DELETE
    void delete(Long id);
    void deletes(DefaultDto.DeletesReqDto param);

    //FILE UPLOAD
    void saveFile(MultipartFile param) throws IOException;

    //PAGED LIST
    public DefaultDto.PagedListResDto pagedList(TestpostDto.PagedListReqDto params);
}
