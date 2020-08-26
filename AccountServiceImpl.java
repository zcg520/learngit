package com.sitech.service.Impl;

import com.sitech.Dao.IAccountDao;
import com.sitech.domain.Account;
import com.sitech.service.IAccountService;

import java.util.List;

/**
 * @author zhaocg
 * @title: AccountServiceImpl
 * @projectName SpringIOC-XML-example
 * @description: 业务层实现类
 * @date 2020/8/1316:09
 */
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> findAllAccount( ) {
        return accountDao.findAllAccount();
    }

    public Account findById(Integer id) {
        return accountDao.findById(id);
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    public void deleteAccount(Integer id) {
        accountDao.deleteAccount(id);
    }
}
