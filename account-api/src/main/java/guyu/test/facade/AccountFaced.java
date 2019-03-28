package guyu.test.facade;

import guyu.test.model.AccountDTO;

public interface AccountFaced {

    public AccountDTO queryAccountByAccountId(Long accountId);
}
