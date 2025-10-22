package web;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import nhan2so.InputBoundary;
import nhan2so.InputData;
import nhan2so.Nhan2So;
import nhan2so.Nhan2SoControl;
import presenters.Nhan2SoPresenter;
import presenters.Nhan2SoViewModel;

@WebServlet("/nhan2so")
public class Nhan2SoControllerWeb extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Controller sẽ nhận dữ liệu từ Web - Browser - 
		//Apache tomcat:8080
		String strNum1 = req.getParameter("num1");
		String strNum2 = req.getParameter("num2");
		
		InputData inData = new InputData();
		inData.num1 = Integer.parseInt(strNum1);
		inData.num2 = Integer.parseInt(strNum2);
		Nhan2So n2soEntity = new Nhan2So();
		Nhan2SoViewModel viewModel = new Nhan2SoViewModel();
		Nhan2SoPresenter presenter = new Nhan2SoPresenter(viewModel);
		InputBoundary in = new Nhan2SoControl(presenter, n2soEntity);
		in.execute(inData);
		
		//chờ 1 2 3; viewModel có dữ liệu
		//đẩy viewModel cho result.jsp
		//nhét viewModel vào package trước khi gửi đi
		req.setAttribute("model", viewModel);
		
		//đẩy
		req.getRequestDispatcher("/result.jsp")
		.forward(req, resp);

		
	}
	

	

}
