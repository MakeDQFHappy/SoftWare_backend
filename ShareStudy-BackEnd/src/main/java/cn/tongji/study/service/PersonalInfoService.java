package cn.tongji.study.service;

import cn.tongji.study.dto.UserInfoDTO;
import org.springframework.stereotype.Service;

/**
 * @Author : 王晨
 * @Date : Created in 19:09 2022/11/26
 */
@Service
public interface PersonalInfoService {
    void updateAvatar(String avatarUrl);

    Integer updateBonusPoints(Integer updateNum);

    UserInfoDTO getUserInfo(Long userId);

    Boolean updateUserInfo(String userName,Integer age,String sex);

    Boolean updateUserInfo(Long userId,String userName,Integer age,String sex);
}
