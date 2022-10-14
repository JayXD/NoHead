//package com.dxj.study.service;
//
//import com.dxj.study.domain.AccountDetails;
//import com.dxj.study.entity.User;
//import com.dxj.study.repository.manager.UserManager;
//import com.dxj.study.service.impl.LoginServiceImpl;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.MockitoJUnitRunner;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNull;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//@RunWith(MockitoJUnitRunner.class)
//public class LoginServiceTest {
//
//    @InjectMocks
//    private LoginServiceImpl loginService;
//
//    @Mock
//    private UserManager manager;
//
//    private final User user = Make.aUser();
//
//    @Test
//    public void queryHappy() {
//        String email = Make.email();
//        when(manager.queryOneUser(email)).thenReturn(user);
//
//        AccountDetails accountDetails = loginService.login(email);
//
//        verify(manager).queryOneUser(email);
//        assertEquals(accountDetails.getEmail(), email);
//    }
//
//    @Test
//    public void queryNull() {
//        String wrong = "wrong";
//        when(manager.queryOneUser(wrong)).thenReturn(null);
//
//        AccountDetails accountDetails = loginService.login(wrong);
//
//        verify(manager).queryOneUser(wrong);
//        assertNull(accountDetails);
//    }
//}
