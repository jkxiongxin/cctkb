package cct.test;

import org.junit.BeforeClass;
import org.junit.Test;

import cct.entity.knowledgeclass;
import cct.service.knowledgeClassService;

/**
 * @author ����	
 * @createDate 2015/5/2
 * @version 1.0
 * @description ���ڲ���֪ʶ����������ķ���
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
//			knowledgeclass.setClassBrief("��׿����ѧϰ");
//			knowledgeclass.setClassId("KB_001");
//			knowledgeclass.setClassName("��׿����");
//			knowledgeclass.setKnowledgeNumber(0);
//			knowledgeclass.setReplyVolume(0);
//			knowledgeclass.setVisitorVolume(0);
//			if(knowledgeClassService.addKnowledgeClass(knowledgeclass).equals("success"))
//			{
//				System.out.print("��ӳɹ�");
//			}
//			else {
//				System.out.print("���ʧ�ܣ�������Ѵ���");
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
		knowledgeclass.setClassBrief("Web����ѧϰ");
		knowledgeclass.setClassId("KB_001");
		knowledgeclass.setClassName("ssh���");
		knowledgeclass.setKnowledgeNumber(0);
		knowledgeclass.setReplyVolume(0);
		knowledgeclass.setVisitorVolume(0);
		if(knowledgeClassService.updateKnowledgeClass(knowledgeclass).equals("success"))
		{
			System.out.print("�޸ĳɹ�");
		}
		else {
			System.out.print("�޸�ʧ�ܣ�����𲻴���");
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
//				System.out.print("ɾ���ɹ�");
//			}
//			else {
//				print("ɾ��ʧ�ܣ�����𲻴���");
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
