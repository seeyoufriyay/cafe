package seller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import common.controller.SuperClass;
import dao.SellerDao;
// 회원 비밀번호 찾기 결과에 대한 컨트롤러입니다.
@Controller
public class SellPWResultController extends SuperClass {
	private final String command = "/sellPWResult.se";
	private final String redirect = "redirect:/";

	private ModelAndView mav = null;

	@Autowired
	@Qualifier("sdao")
	private SellerDao sdao;

	public SellPWResultController() {
		super("sellPWResult", null);
		this.mav = new ModelAndView();
	}

	@GetMapping(command)
	public ModelAndView doGet() {
		this.mav.setViewName(super.getpage);
		return this.mav;
	}
}