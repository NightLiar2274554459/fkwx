package org.fkjava.fkwx.menu.service;

import org.fkjava.fkwx.menu.domain.SelfMenu;

public interface SelfMenuService {

	SelfMenu findMenus();

	void save(SelfMenu menu);

}
