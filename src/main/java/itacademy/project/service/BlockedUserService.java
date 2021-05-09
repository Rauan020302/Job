package itacademy.project.service;

import itacademy.project.entity.BlockedUser;

import java.util.List;

public interface BlockedUserService {
    List<BlockedUser> findAll();

    BlockedUser save (BlockedUser blockedUser);
    List<BlockedUser> findAllByUserStatus(Long userStatus);
}
