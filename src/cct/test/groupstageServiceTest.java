package cct.test;


import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.test.AbstractTransactionalSpringContextTests;

import cct.entity.groupstage;
import cct.service.groupstageService;

/**
 * @author ����
 * @createDate 2015/5/2
 * @version 1.0
 * @description groupstageService�Ĳ�����
 *
 */
/**
 * @author Administrator
 *
 */
public class groupstageServiceTest extends
		AbstractTransactionalSpringContextTests {
	private groupstageService groupstageService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testAddGroupstage() {
//		groupstage groupstage=new groupstage();
//		groupstage.setStageName("��ƽ׶�");
//		groupstage.setGoal("��Ƴ��Ƚ����Ƶ����ݿ�ͽ�Ϊ�꾡�Ĺ�������");
//		groupstage.setGroupId("2015_1");
//		groupstage.setGroupStageId("2015_1_1");
//		groupstage.setState(0);
//		groupstage.setStartTime("2015-5-2");
//		groupstage.setEndTime("2015-6-2");
//		if(groupstageService.addGroupstage(groupstage))
//		{
//			System.out.print("��ӳɹ�");
//		}
//		else {
//			System.out.print("�ý׶��Ѵ���");
//		}
		fail("Not yet implemented");
	}
	public String[] getConfigLocations() {
	    String[] configLocations = { "file:src/applicationContext.xml"};
	    return configLocations;
	}
	@Test
	public void testDeleteGroupstage() {
//		groupstage groupstage=new groupstage();
//		groupstage.setStageName("��ƽ׶�");
//		groupstage.setGoal("��Ƴ��Ƚ����Ƶ����ݿ�ͽ�Ϊ�꾡�Ĺ�������");
//		groupstage.setGroupId("2015_1");
//		groupstage.setGroupStageId("2015_1_1");
//		groupstage.setState(0);
//		groupstage.setStartTime("2015-5-2");
//		groupstage.setEndTime("2015-6-2");
//		if(groupstageService.deleteGroupstage(groupstage.getGroupStageId()))
//		{
//			System.out.print("ɾ���ɹ�");
//		}
//		else {
//			System.out.print("ɾ��ʧ��");
//		}
		fail("Not yet implemented");
	}

	@Test
	public void testAlterGroupstage() {
		groupstage groupstage=new groupstage();
		groupstage.setStageName("��ƽ׶�");
		groupstage.setGoal("��Ƴ��Ƚ����Ƶ����ݿ�ͽ�Ϊ�꾡�Ĺ�������");
		groupstage.setGroupId("2015_1");
		groupstage.setGroupStageId("2015_1_1");
		groupstage.setState(0);
		groupstage.setStartTime("2015-5-2");
		groupstage.setEndTime("2015-6-3");
		if(groupstageService.alterGroupstage(groupstage))
		{
			System.out.print("�޸ĳɹ�");
		}
		else {
			System.out.print("�޸�ʧ��");
		}
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllGroupstage() {
		fail("Not yet implemented");
	}

	public groupstageService getGroupstageService() {
		return groupstageService;
	}

	public void setGroupstageService(groupstageService groupstageService) {
		this.groupstageService = groupstageService;
	}
	
}
