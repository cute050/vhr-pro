package cn.net.yunzan.vhr.service;

import cn.net.yunzan.vhr.mapper.HrMapper;
import cn.net.yunzan.vhr.model.Hr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author yp
 * @since 2022/11/22
 **/
@Service
public class HrService implements UserDetailsService {

    @Autowired
    private HrMapper hrMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Hr hr= hrMapper.loadUserByUsername(username);
        if (hr == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        return hr;
    }
}
