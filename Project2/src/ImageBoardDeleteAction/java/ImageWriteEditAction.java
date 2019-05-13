package ImageBoardDeleteAction.java;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;

public class ImageWriteEditAction implements Action {

	@Override
	public Actionforward execute(HttpServletRequest request, HttpServletResponse response) {
		Actionforward forward = null;
		
	    forward = new Actionforward();
	    forward.setRedirect(false);
	    forward.setPath("/WEB-INF/imageboard/imageedit.jsp");
	    
	    return forward;
	}

}
