package co.simplon.service;

import co.simplon.entites.AppRole;
import co.simplon.entites.AppUser;

public interface AccountService {
  public AppUser saveUser(AppUser user);
  public AppRole saveRole(AppRole role);
  public void addRoleToUse(String userName,String roleName);
  public AppUser findUserByUserName(String userName);
}
