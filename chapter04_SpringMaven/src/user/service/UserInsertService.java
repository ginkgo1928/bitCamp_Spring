package user.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.bean.UserDTO;
import user.dao.UserDAO;
@Service
public class UserInsertService implements UserService {
	@Autowired
	private UserDTO userDTO;
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public void execute() {
		//데이터
		Scanner scan=new Scanner(System.in);
		System.out.print("이름:");
		userDTO.setName(scan.next());
		System.out.print("아이디:");
		userDTO.setId(scan.next());
		System.out.print("비밀번호:");
		userDTO.setPwd(scan.next());
		//DB
		userDAO.userWrite(userDTO);
		//응답
		System.out.println("데이터를 저장했습니다.");

	}

}
