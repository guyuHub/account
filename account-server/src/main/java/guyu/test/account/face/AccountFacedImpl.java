package guyu.test.account.face;

import guyu.test.account.converter.AccountDTOConverter;
import guyu.test.account.domain.Account.Model.Account;
import guyu.test.facade.AccountFaced;
import guyu.test.model.AccountDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/accountFaced")
public class AccountFacedImpl implements AccountFaced{

    @Resource
    private AccountDTOConverter accountDTOConverter;

    @RequestMapping("/queryAccountByAccountId")
    public AccountDTO queryAccountByAccountId(Long accountId) {
        Account account = new Account();
        account.setAccountId(1000110001L);
        account.setName("大哥大");
        return accountDTOConverter.back(account);
    }
}
