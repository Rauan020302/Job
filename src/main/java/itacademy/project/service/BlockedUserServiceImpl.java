package itacademy.project.service;

import itacademy.project.entity.BlockedUser;
import itacademy.project.repository.BlockedUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlockedUserServiceImpl implements BlockedUserService {
    @Autowired
    private BlockedUserRepository blockedUserRepository;

    @Override
    public List<BlockedUser> findAll() {
        return blockedUserRepository.findAll();
    }

    @Override
    public BlockedUser save(BlockedUser blockedUser) {
        return blockedUserRepository.save(blockedUser);
    }

    @Override
    public List<BlockedUser> findAllByUserStatus(Long userStatus) {
        return blockedUserRepository.findAllByUser_Status(userStatus);
    }
}
