package cct.test;

import org.junit.BeforeClass;
import org.junit.Test;

import cct.entity.knowledgeclass;
import cct.service.knowledgeClassService;

/**
 * @author 熊鑫	
 * @createDate 2015/5/2
 * @version 1.0
 * @description 用于测试知识点分类代理类的方法
 *
 */
public class knowledgeClassServiceTest extends baseTest{
	private knowledgeClassService knowledgeClassService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testAddKnowledgeClass() {
//		try{
//			knowledgeclass knowledgeclass=new knowledgeclass();
//			knowledgeclass.setClassBrief("安卓基础学习");
//			knowledgeclass.setClassId("KB_001");
//			knowledgeclass.setClassName("安卓入门");
//			knowledgeclass.setKnowledgeNumber(0);
//			knowledgeclass.setReplyVolume(0);
//			knowledgeclass.setVisitorVolume(0);
//			if(knowledgeClassService.addKnowledgeClass(knowledgeclass).equals("success"))
//			{
//				System.out.print("添加成功");
//			}
//			else {
//				System.out.print("添加失败，该类别已存在");
//			}
//		}catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateKnowledgeClass() {
		knowledgeclass knowledgeclass=new knowledgeclass();
		knowledgeclass.setClassBrief("Web基础学习");
		knowledgeclass.setClassId("KB_001");
		knowledgeclass.setClassName("ssh框架");
		knowledgeclass.setKnowledgeNumber(0);
		knowledgeclass.setReplyVolume(0);
		knowledgeclass.setVisitorVolume(0);
		if(knowledgeClassService.updateKnowledgeClass(knowledgeclass).equals("success"))
		{
			System.out.print("修改成功");
		}
		else {
			System.out.print("修改失败，该类别不存在");
		}
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteKnowledgeClass() {
//		try
//		{
//			String classId="KB_001";
//			if(knowledgeClassService.deleteKnowledgeClass(classId).equals("success"))
//			{
//				System.out.print("删除成功");
//			}
//			else {
//				print("删除失败，该类别不存在");
//			}
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		fail("Not yet implemented");
	}

	@SuppressWarnings("unused")
	@Test
	public void testGetKnowledgeclass() {
		int pageNo=1;
		int pagesize=8;
		fail("Not yet implemented");
	}

	public knowledgeClassService getknowledgeClassService() {
		return knowledgeClassService;
	}

	public void setknowledgeClassService(
			knowledgeClassService knowledgeClassService) {
		this.knowledgeClassService = knowledgeClassService;
	}

}
