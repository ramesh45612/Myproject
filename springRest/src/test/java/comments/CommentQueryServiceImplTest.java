package comments;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.ram.comments.CommentQueryRepositoryImpl;
import com.ram.comments.CommentQueryServiceImpl;
import com.ram.comments.CommentsDTO;

@RunWith(MockitoJUnitRunner.class)
public class CommentQueryServiceImplTest {
	
	@Mock
	CommentQueryRepositoryImpl commentQueryRepositoryImpl;
	
	@InjectMocks
	CommentQueryServiceImpl commentQueryServiceImpl;
	
	@Mock
	List<CommentsDTO> list;
	
	@Before
	public void setUp(){
	       MockitoAnnotations.initMocks(this);
	}
	@Test
	public void getCommentsTest() {
		String entityID= "12";
		String entityTypeID= "2";
		Mockito.when(commentQueryServiceImpl.getComments(entityID, entityTypeID)).thenReturn(list);
		
	}
}
