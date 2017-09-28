package comments;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.ram.comments.CommentController;
import com.ram.comments.CommentQueryServiceImpl;
import com.ram.comments.CommentsDTO;

@RunWith(MockitoJUnitRunner.class)
public class CommentControllerTest {

	@Mock
	CommentQueryServiceImpl commentQueryServiceImpl;
	

	@Mock
	List<CommentsDTO> list;
	
	@InjectMocks
	CommentController commentController;
	
	
	@Before
	public void setUp(){
	       MockitoAnnotations.initMocks(this);
	}
	@Test
	public void getCommentsTest() {
		String entityID= "12";
		String entityTypeID= "2";
		Mockito.when(commentQueryServiceImpl.getComments(Mockito.anyString(), Mockito.anyString())).thenReturn(list);
		commentController.getComments(entityID, entityTypeID);
	}
	
	//@Test
	public void saveCommentsTest() {
		List<CommentsDTO> li = new ArrayList<CommentsDTO>();
	//	Mockito.when(commentController.saveComments(list)).thenReturn(Mockito.anyList());
	}
}
