package guyu.test.account.converter;

import guyu.test.account.domain.Account.Model.Account;
import guyu.test.model.AccountDTO;
import org.mapstruct.Mapper;

/**
 * @author guyu
 * @date 2019/4/2
 */
@Mapper(componentModel = "spring")
public interface AccountDTOConverter extends BaseConverter<AccountDTO, Account>{
}
