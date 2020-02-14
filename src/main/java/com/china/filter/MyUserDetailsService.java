package com.china.filter;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

//将实现类注册到容器中
@Component
public class MyUserDetailsService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		/**
         * name： 用户名
         * password： 密码
         * authorities： 定义权限名称 必须以 ROLE_ 开头
         */
        User user = new User("miracle", "123456",
                AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER"));
		
		return user;
	}

}
