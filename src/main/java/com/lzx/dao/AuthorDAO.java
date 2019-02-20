package com.lzx.dao;

import com.lzx.entity.Author;
import org.apache.ibatis.annotations.Param;

public interface AuthorDAO {
    Author queryByNameAndCity(@Param("name") String name,@Param("city") String city);
    Author queryByName(String name);
    int insertAuthor(Author author);
    int updateAuthor(Author author);

    int deleteAuthor(int[] id);
}
