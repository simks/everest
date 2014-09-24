package com.everest.sim.dao;

import com.everest.sim.model.Post;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class postDaoTest {

	@Autowired
	PostDao postDaoImpl;

	@Test
	public void simpleInsertTest(){
		Post post = new Post(21l, "test", "testTitle", "testContents", new Date(), null);
		postDaoImpl.save(post);
	}

}