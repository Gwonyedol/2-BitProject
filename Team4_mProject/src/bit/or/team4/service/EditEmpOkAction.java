package bit.or.team4.service;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import com.sun.glass.ui.Application;
import bit.or.team4.action.Action;
import bit.or.team4.action.ActionForward;
import bit.or.team4.dao.EmpDao;
import bit.or.team4.dto.emp;
public class EditEmpOkAction implements Action{
    @Override
    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
        ActionForward forward = null;
        String fileName ="";
        try {
            
            Part part = request.getPart("upload");
            if (part.getHeader("Content-Disposition").contains("filename=")) {
                 fileName = part.getSubmittedFileName();
                 
                System.out.println("filename : " + fileName);
                if (part.getSize() > 0) {
                    
                    part.write(request.getSession().getServletContext().getRealPath(fileName));
                    part.delete();
                }
            }
            forward = new ActionForward();
            EmpDao dao = new EmpDao();
            emp emp = new emp();
            emp.setEmpno(Integer.parseInt(request.getParameter("empno")));
            emp.setEname(request.getParameter("ename"));
            emp.setJob(request.getParameter("job"));
            emp.setSal(Integer.parseInt(request.getParameter("sal")));
            emp.setDeptno(Integer.parseInt(request.getParameter("deptno")));
            emp.setMgr(Integer.parseInt(request.getParameter("mgr")));
            emp.setFile_path(request.getSession().getServletContext().getRealPath(fileName));
            int result = dao.editEmp(emp);
            if(result > 0 ) {
                System.out.println(result);
            }else {
                System.out.println(result);
            }
            forward.setRedirect(false);
            forward.setPath("/ShowEmpList.do");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return forward;
    }
}