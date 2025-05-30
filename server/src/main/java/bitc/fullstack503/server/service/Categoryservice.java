package bitc.fullstack503.server.service;

import bitc.fullstack503.server.dto.mysql.CategoryDTO;

import java.util.List;

public interface Categoryservice {
    List<CategoryDTO> getCategoryList() throws Exception;

    List<CategoryDTO> getCategoryLineList(String scode) throws Exception;

    String getStationName(String downendcode) throws Exception;
}
