package com.liuxl.service;

import com.github.pagehelper.PageInfo;
import com.liuxl.entity.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author liuxl
 * @date 2019/3/4
 */
public interface UserService {
    User queryById(Long id);

    List<User> queryList();

    PageInfo queryPage(int pageSize, int pageNumber);
}
