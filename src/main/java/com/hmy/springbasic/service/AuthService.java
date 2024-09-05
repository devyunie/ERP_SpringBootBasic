package com.hmy.springbasic.service;

import com.hmy.springbasic.dto.PostUserRequestDto;
import com.hmy.springbasic.dto.SignInRequestDto;

public interface  AuthService {
    String signUp(PostUserRequestDto dto);
    String signIn(SignInRequestDto dto);
}
